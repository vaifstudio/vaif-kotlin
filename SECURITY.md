# Security policy

Report vulnerabilities privately, through the "Report a vulnerability" form on
this repository's Security tab (GitHub private vulnerability reporting) or by
email to security@vaif.studio. Do not disclose a vulnerability in a public issue
or pull request.

Include the SDK version, JDK or Android version, affected API, impact, and a minimal
reproduction. Include request IDs when available. Remove tokens, API keys,
passwords and personal data from reports and logs. Test only accounts and projects
you own.

We acknowledge a report within 2 business days and send an initial assessment
within 5 business days. We then investigate it and coordinate disclosure with
the reporter.
Confirmed fixes are recorded in [CHANGELOG.md](CHANGELOG.md). Security fixes target
the latest supported release. Version 1.0.0 has not been tagged or published yet.
The hosted API and console are not available yet.

Each module uses strict Gradle dependency locking. CI runs
OSV-Scanner on runtime, test, documentation and build dependency lockfiles and
fails on any known vulnerability or scanner error. No vulnerability suppressions or
severity thresholds are configured. A clean advisory scan does not establish that
a package is uncompromised. Review dependency and lockfile changes before release.
