# Tutorial 5

The six assessment projects are implemented as separate classes on the `tutorial-5` branch:

1. Employee Payroll Analyzer — `tutorial5.payroll`
2. E-Commerce Product Billing — `tutorial5.billing`
3. Bank Account Transaction System — `tutorial5.bank`
4. Hospital Patient Priority System — `tutorial5.priority`
5. Inventory Stock Management — `tutorial5.inventory`
6. ATM Transaction Simulator — `tutorial5.atm`

Compile all Tutorial 5 files:

```bash
javac -d out $(find src/tutorial5 -name "*.java")
```

Run examples:

```bash
java -cp out tutorial5.payroll.PayrollMain
java -cp out tutorial5.billing.BillingMain
java -cp out tutorial5.bank.BankMain
java -cp out tutorial5.priority.PriorityMain
java -cp out tutorial5.inventory.InventoryMain
java -cp out tutorial5.atm.AtmMain
```

Note: `AtmMain` expects the account number, PIN, and then up to three PIN entries before the menu operations. For a normal single-entry assessment input, the stored PIN can also serve as the first entered PIN.
