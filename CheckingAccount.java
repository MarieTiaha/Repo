public class CheckingAccount extends BankAccount {
    // Step 2: Define the static constant FEE
    private static final double FEE = 0.15;

    // Step 3: Write the constructor
    public CheckingAccount(String name, double amount) {
        super(name, amount);
        setAccountNumber(getAccountNumber() + "-10");
    }

    // Step 4: Override the withdraw method
    @Override
    public boolean withdraw(double amount) {
        // Calculate the total amount to withdraw (including fee)
        double totalAmount = amount + FEE;

        // Call the withdraw method from the superclass
        boolean completed = super.withdraw(totalAmount);

        // Return the result from the superclass
        return completed;
    }
}


