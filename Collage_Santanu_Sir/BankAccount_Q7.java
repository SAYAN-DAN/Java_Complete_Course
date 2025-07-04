public class BankAccount_Q7 {
    String accountHolder;
    double balance;
    static String bankName;

    // Static block to initialize static variable
    static {
        bankName = "State Bank of India";
    }

    // Constructor to initialize account holder and balance
    BankAccount_Q7(String name, double initialBalance) {
        this.accountHolder = name;
        this.balance = initialBalance;
    }

    // Static method to change the bank name
    static void changeBankName(String newName) {
        bankName = newName;
    }

    // Method to display account details
    void displayAccountDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
        System.out.println("Bank Name: " + bankName);
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        // Creating account objects
        BankAccount_Q7 acc1 = new BankAccount_Q7("Alice", 1000.0);
        BankAccount_Q7 acc2 = new BankAccount_Q7("Bob", 1500.0);

        // Displaying initial details
        acc1.displayAccountDetails();
        acc2.displayAccountDetails();

        // Changing the bank name using static method
        System.out.println("Changing bank name to: Axis Bank\n");
        BankAccount_Q7.changeBankName("Axis Bank");

        // Displaying updated details
        acc1.displayAccountDetails();
        acc2.displayAccountDetails();
    }
}
