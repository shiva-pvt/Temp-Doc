# Tutorial 6 — Separate Java Classes

Each question is in its own package, with every class stored in a separate file:

- `tutorial6.wallet`: `Wallet.java`, `WalletMain.java`
- `tutorial6.scholarship`: `Scholarship.java`, `ScholarshipMain.java`
- `tutorial6.ecommerce`: `Product.java`, `Electronics.java`, `Clothing.java`, `Grocery.java`, `EcommerceMain.java`
- `tutorial6.ride`: `Ride.java`, `Bike.java`, `Auto.java`, `Car.java`, `PremiumCar.java`, `RideMain.java`
- `tutorial6.hospital`: `Doctor.java`, `GeneralDoctor.java`, `Specialist.java`, `Surgeon.java`, `HospitalMain.java`

Compile from the repository root:

```bash
javac -d out $(find src/tutorial6 -name "*.java")
```

Run an individual program, for example:

```bash
java -cp out tutorial6.wallet.WalletMain
java -cp out tutorial6.scholarship.ScholarshipMain
java -cp out tutorial6.ecommerce.EcommerceMain
java -cp out tutorial6.ride.RideMain
java -cp out tutorial6.hospital.HospitalMain
```
