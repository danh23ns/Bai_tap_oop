package CustomerandAccount;

public class Main {
    public static void main(String[] args) {
        // Create a customer
        Customer customer1 = new Customer(1, "John Doe", 'M');
        
        // Create an account for the customer
        Account account1 = new Account(101, customer1, 1000.0);
        
        // Display initial account information
        System.out.println("Account Information:");
        System.out.println("ID: " + account1.getId());
        System.out.println("Customer Name: " + account1.getCustomerName());
        System.out.println("Balance: $" + account1.getBalance());
        
        // Deposit some money into the account
        double depositAmount = 500.0;
        System.out.println("\nDepositing $" + depositAmount + " into the account...");
        account1.deposit(depositAmount);
        System.out.println("New Balance: $" + account1.getBalance());
        
        // Withdraw some money from the account
        double withdrawAmount = 200.0;
        System.out.println("\nWithdrawing $" + withdrawAmount + " from the account...");
        account1.withdraw(withdrawAmount);
        System.out.println("New Balance: $" + account1.getBalance());
        
        // Attempt to withdraw more money than the current balance
        double excessiveWithdrawAmount = 2000.0;
        System.out.println("\nWithdrawing $" + excessiveWithdrawAmount + " from the account...");
        account1.withdraw(excessiveWithdrawAmount);
        System.out.println("Current Balance: $" + account1.getBalance());
    }
}

