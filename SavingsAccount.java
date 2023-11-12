public class SavingsAccount extends BankAccount {
    private static double rate = 0.025; // Annual interest rate (2.5%)
    private static int savingsCounter = 0; // Counter for creating unique savings account numbers
    private int savingsNumber; // Individual savings account number

    // Constructor
    public SavingsAccount(String name, double amount) {
        super(name, amount);
        savingsCounter++;
        savingsNumber = savingsCounter;
        setAccountNumber(getAccountNumber() + "-" + savingsNumber);
    }

    // Method to calculate and deposit monthly interest
    public void postInterest() {
        double interest = getBalance() * rate / 12;
        deposit(interest);
    }

    // Override the getAccountNumber method
    @Override
    public String getAccountNumber() {
        return super.getAccountNumber() + "-" + savingsNumber;
    }

    // Copy constructor
    public SavingsAccount(SavingsAccount oldAccount, double amount) {
        super(oldAccount, amount);
        savingsCounter++;
        savingsNumber = savingsCounter;
        setAccountNumber(getAccountNumber() + "-" + savingsNumber);
    }
}
