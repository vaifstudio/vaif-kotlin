package studio.vaif

import kotlinx.serialization.json.*

/**
 * Immutable row query builder; JSON preserves arbitrary columns and API values.
 */
public class Query internal constructor(
    private val client: VaifClient,
    private val table: String,
    private val selected: List<String> = emptyList(),
    private val filters: List<JsonObject> = emptyList(),
    private val ordering: List<Pair<String, Boolean>> = emptyList(),
    private val maximum: Int? = null,
    private val offset: Int? = null,
) {
    private val path = client.config.projectId?.let { "/v1/data/${segment(it)}/${segment(table)}" }
        ?: throw VaifException("Configure projectId for data queries", "PROJECT_ID_REQUIRED")
    private fun copy(selected: List<String> = this.selected, filters: List<JsonObject> = this.filters,
                     ordering: List<Pair<String, Boolean>> = this.ordering, maximum: Int? = this.maximum, offset: Int? = this.offset) =
        Query(client, table, selected, filters, ordering, maximum, offset)
    /**
     * Selects columns without changing this query.
     * @param columns Columns to select; an empty list selects the API default.
     * @return A new query with the requested projection.
     */
    public fun select(vararg columns: String): Query = copy(selected = columns.toList())
    /**
     * Adds an API filter tree, combined with existing predicates using AND.
     * @param filter API JSON filter tree.
     * @return A new query containing the filter.
     */
    public fun where(filter: JsonObject): Query = copy(filters = filters + filter)
    /**
     * Adds a supported comparison predicate.
     * @param field Column to compare or sort.
     * @param operator Comparison operator accepted by the API.
     * @param value JSON-compatible scalar or list comparison value.
     * @return A new query containing the comparison.
     * @throws VaifException If configuration, arguments or the current session cannot support this operation.
     */
    public fun filter(field: String, operator: String, value: Any?): Query {
        if (operator !in setOf("eq", "neq", "gt", "gte", "lt", "lte", "like", "ilike", "in")) validation("Unsupported filter operator")
        return where(jsonObject("field" to JsonPrimitive(field), "operator" to JsonPrimitive(operator), "value" to jsonValue(value)))
    }
    /**
     * Adds a predicate for values equal to the supplied comparison.
     * @param field Column to compare or sort.
     * @param value JSON-compatible scalar or list comparison value.
     * @return A new query containing the predicate.
     * @throws VaifException If a comparison value cannot be represented as JSON.
     */
    public fun eq(field: String, value: Any?): Query = filter(field, "eq", value)
    /**
     * Adds a predicate for values not equal to the supplied comparison.
     * @param field Column to compare or sort.
     * @param value JSON-compatible scalar or list comparison value.
     * @return A new query containing the predicate.
     * @throws VaifException If a comparison value cannot be represented as JSON.
     */
    public fun neq(field: String, value: Any?): Query = filter(field, "neq", value)
    /**
     * Adds a predicate for values greater than the supplied comparison.
     * @param field Column to compare or sort.
     * @param value JSON-compatible scalar or list comparison value.
     * @return A new query containing the predicate.
     * @throws VaifException If a comparison value cannot be represented as JSON.
     */
    public fun gt(field: String, value: Any): Query = filter(field, "gt", value)
    /**
     * Adds a predicate for values greater than or equal to the supplied comparison.
     * @param field Column to compare or sort.
     * @param value JSON-compatible scalar or list comparison value.
     * @return A new query containing the predicate.
     * @throws VaifException If a comparison value cannot be represented as JSON.
     */
    public fun gte(field: String, value: Any): Query = filter(field, "gte", value)
    /**
     * Adds a predicate for values less than the supplied comparison.
     * @param field Column to compare or sort.
     * @param value JSON-compatible scalar or list comparison value.
     * @return A new query containing the predicate.
     * @throws VaifException If a comparison value cannot be represented as JSON.
     */
    public fun lt(field: String, value: Any): Query = filter(field, "lt", value)
    /**
     * Adds a predicate for values less than or equal to the supplied comparison.
     * @param field Column to compare or sort.
     * @param value JSON-compatible scalar or list comparison value.
     * @return A new query containing the predicate.
     * @throws VaifException If a comparison value cannot be represented as JSON.
     */
    public fun lte(field: String, value: Any): Query = filter(field, "lte", value)
    /**
     * Adds a case-sensitive pattern predicate.
     * @param field Column to compare or sort.
     * @param value JSON-compatible scalar or list comparison value.
     * @return A new query containing the predicate.
     * @throws VaifException If a comparison value cannot be represented as JSON.
     */
    public fun like(field: String, value: String): Query = filter(field, "like", value)
    /**
     * Adds a case-insensitive pattern predicate.
     * @param field Column to compare or sort.
     * @param value JSON-compatible scalar or list comparison value.
     * @return A new query containing the predicate.
     * @throws VaifException If a comparison value cannot be represented as JSON.
     */
    public fun ilike(field: String, value: String): Query = filter(field, "ilike", value)
    /**
     * Adds a predicate that matches any value in the supplied list.
     * @param field Column to compare or sort.
     * @param values Values to match with the in operator.
     * @return A new query containing the predicate.
     * @throws VaifException If a comparison value cannot be represented as JSON.
     */
    public fun inList(field: String, values: List<Any?>): Query = filter(field, "in", values)
    /**
     * Adds a sort column in priority order.
     * @param field Column to compare or sort.
     * @param ascending True for ascending order; false for descending order.
     * @return A new query with the additional ordering.
     */
    public fun order(field: String, ascending: Boolean = true): Query = copy(ordering = ordering + (field to ascending))
    /**
     * Sets a positive maximum row count.
     * @param count Positive maximum number of rows.
     * @return A new query with the limit.
     * @throws VaifException If configuration, arguments or the current session cannot support this operation.
     */
    public fun limit(count: Int): Query { if (count < 1) validation("limit must be positive"); return copy(maximum = count) }
    /**
     * Sets an inclusive row range using an offset and limit.
     * @param from Zero-based first row index.
     * @param toInclusive Inclusive last row index.
     * @return A new query covering the requested range.
     * @throws VaifException If configuration, arguments or the current session cannot support this operation.
     */
    public fun range(from: Int, toInclusive: Int): Query {
        if (from < 0 || toInclusive < from || toInclusive.toLong() - from + 1 > Int.MAX_VALUE) validation("Invalid inclusive range")
        return copy(maximum = toInclusive - from + 1, offset = from)
    }
    private fun query(): List<Pair<String, String>> = buildList {
        if (selected.isNotEmpty()) add("select" to selected.joinToString(","))
        if (filters.isNotEmpty()) add("where" to if (filters.size == 1) filters[0].toString() else jsonObject("AND" to JsonArray(filters)).toString())
        if (ordering.isNotEmpty()) { add("orderBy" to ordering.joinToString(",") { it.first }); add("orderDir" to ordering.joinToString(",") { if (it.second) "asc" else "desc" }) }
        maximum?.let { add("limit" to it.toString()) }; offset?.let { add("offset" to it.toString()) }
    }
    /**
     * Lists rows matching this immutable query.
     * @return The API envelope with rows and count when present.
     * @throws VaifException On validation, API, storage or transport failure. Cancellation propagates unchanged.
     */
    public suspend fun list(): JsonObject = client.send("GET", path, query()).asObject()
    /**
     * Fetches one row by ID, preserving the API envelope.
     * @param id Row identifier, encoded as one path segment.
     * @return The API row envelope.
     * @throws VaifException On validation, API, storage or transport failure. Cancellation propagates unchanged.
     */
    public suspend fun get(id: String): JsonObject = client.send("GET", "$path/${segment(id)}",
        if (selected.isEmpty()) emptyList() else listOf("select" to selected.joinToString(","))).asObject()
    /**
     * Inserts one row, preserving the API envelope.
     * @param values Column names and values for the row.
     * @return The API mutation envelope.
     * @throws VaifException On validation, API, storage or transport failure. Cancellation propagates unchanged.
     */
    public suspend fun insert(values: JsonObject): JsonObject = client.send("POST", path, body = values).asObject()
    /**
     * Inserts a batch of rows, preserving the API envelope.
     * @param values Rows to insert in one bulk request.
     * @return The API mutation envelope.
     * @throws VaifException On validation, API, storage or transport failure. Cancellation propagates unchanged.
     */
    public suspend fun insert(values: List<JsonObject>): JsonObject = client.send("POST", "$path/bulk", body = JsonArray(values)).asObject()
    /**
     * Updates one row by ID, preserving the API envelope.
     * @param id Row identifier, encoded as one path segment.
     * @param values Column names and replacement values for the row.
     * @return The API mutation envelope.
     * @throws VaifException On validation, API, storage or transport failure. Cancellation propagates unchanged.
     */
    public suspend fun update(id: String, values: JsonObject): JsonObject = client.send("PATCH", "$path/${segment(id)}", body = values).asObject()
    /**
     * Deletes one row by ID, preserving the API envelope.
     * @param id Row identifier, encoded as one path segment.
     * @return The API mutation envelope.
     * @throws VaifException On validation, API, storage or transport failure. Cancellation propagates unchanged.
     */
    public suspend fun delete(id: String): JsonObject = client.send("DELETE", "$path/${segment(id)}").asObject()
    /**
     * Inserts or updates a row using explicit conflict columns.
     * @param values Column names and values for the row to insert or update.
     * @param conflictColumns Nonempty list of columns used to detect a conflict.
     * @return The API mutation envelope.
     * @throws VaifException On validation, API, storage or transport failure. Cancellation propagates unchanged.
     */
    public suspend fun upsert(values: JsonObject, conflictColumns: List<String>): JsonObject {
        if (conflictColumns.isEmpty()) validation("upsert requires conflict columns")
        return client.send("POST", path, body = JsonObject(values + mapOf("_upsert" to JsonPrimitive(true), "_conflict_columns" to JsonArray(conflictColumns.map(::JsonPrimitive))))).asObject()
    }
    private fun equalityFilters(requireFilter: Boolean = false): JsonObject {
        val out = mutableMapOf<String, JsonElement>()
        fun visit(filter: JsonObject) {
            if (filter.containsKey("AND")) {
                if (filter.keys != setOf("AND")) validation("Invalid AND filter")
                val terms = filter.getValue("AND") as? JsonArray ?: validation("Invalid AND filter")
                terms.forEach { visit(it as? JsonObject ?: validation("Invalid AND filter")) }; return
            }
            if (filter.keys.any { it !in setOf("field", "operator", "value") } || (filter.string("operator") ?: "eq") != "eq") validation("Bulk writes and count support only AND equality filters")
            val field = filter.string("field") ?: validation("Filter field is required")
            // The bulk API silently skips invalid identifiers, and query filters parse dots as operators.
            // Refuse either case rather than widening a mutation/count by dropping one predicate.
            if (!Regex("[A-Za-z0-9_]+").matches(field)) validation("Bulk equality requires a plain column name")
            val value = filter["value"] as? JsonPrimitive ?: validation("Equality filter needs a scalar")
            if (value == JsonNull) validation("Bulk equality cannot represent null; use row IDs")
            if (out.containsKey(field) && out[field] != value) validation("Conflicting equalities cannot be flattened")
            out[field] = JsonPrimitive(value.content)
        }
        filters.forEach(::visit)
        if (requireFilter && out.isEmpty()) validation("Bulk writes require an equality filter; use row IDs to target individual rows")
        if (selected.isNotEmpty() || ordering.isNotEmpty() || maximum != null || offset != null) validation("Bulk writes/count do not support select, order, limit or range")
        return JsonObject(out)
    }
    /**
     * Updates rows matching AND equality filters. Rejects unsupported modifiers and empty filters.
     * @param values Column names and replacement values for every matching row.
     * @return The API mutation envelope.
     * @throws VaifException On validation, API, storage or transport failure. Cancellation propagates unchanged.
     */
    public suspend fun update(values: JsonObject): JsonObject = client.send("PATCH", "$path/bulk", body = jsonObject("data" to values, "filter" to equalityFilters(true))).asObject()
    /**
     * Deletes rows matching AND equality filters. Rejects unsupported modifiers and empty filters.
     * @return The API mutation envelope.
     * @throws VaifException On validation, API, storage or transport failure. Cancellation propagates unchanged.
     */
    public suspend fun delete(): JsonObject = client.send("DELETE", "$path/bulk", query = equalityFilters(true).map { "filter[${it.key}]" to it.value.jsonPrimitive.content }).asObject()
    /**
     * Counts rows matching AND equality filters; rejects unsupported query modifiers.
     * @return The aggregate count, or zero for an empty aggregate result.
     * @throws VaifException On validation, API, storage or transport failure. Cancellation propagates unchanged.
     */
    public suspend fun count(): Long {
        val response = client.send("GET", "$path/aggregate", listOf("fn" to "count") + equalityFilters().map { "filter[${it.key}]" to it.value.jsonPrimitive.content }).asObject()
        val rows = response["data"] as? JsonArray
        if (rows != null && rows.isEmpty()) return 0 // RLS denial is represented by an empty aggregate result.
        return ((rows?.firstOrNull() as? JsonObject)?.get("value") as? JsonPrimitive)?.longOrNull
            ?: throw VaifException("Count response is missing a numeric value", "INVALID_RESPONSE")
    }
}
