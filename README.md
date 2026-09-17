# Tutorial 7 — Java Packages and Multithreading

This repository contains the five Java programs from the tutorial dated 17/09/2026.

## Programs

1. `college.management.Main` — college management using separate `student` and `course` packages.
2. `hospital.Main` — hospital management using separate `doctor` and `patient` packages, doctor assignment, and fee totals.
3. `onlineexam.OnlineExamMain` — concurrent online examination activities using `Runnable`.
4. `banking.BankingMain` — concurrent banking activities using `Runnable`.
5. `traffic.TrafficMain` — concurrent traffic junction monitoring by extending `Thread`.

## Compile and run

From the repository root:

```bash
javac -d out $(find src -name "*.java")
java -cp out college.management.Main
java -cp out hospital.Main
java -cp out onlineexam.OnlineExamMain
java -cp out banking.BankingMain
java -cp out traffic.TrafficMain
```

The multithreaded programs intentionally print interleaved output because their activities run concurrently.
