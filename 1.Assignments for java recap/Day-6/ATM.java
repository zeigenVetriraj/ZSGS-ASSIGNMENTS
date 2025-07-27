import java.util.Scanner;

/*
5. Design a class named `BankAccount` that uses the concept of encapsulation.
The class should have private data members: account number, account holder name, and balance.
Provide public getter and setter methods to access and modify these fields.
Also, include a method to deposit and withdraw amount ensuring that the balance cannot go negative.
*/

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount account = new BankAccount(); // ✅ Fixed class name and syntax

        account.setDetails("1223554826", "Parthi", 50000.00);

        int choice;
        do {
            System.out.println("\n-----------------------------");
            System.out.println("Enter your choice:");
            System.out.println("1. Withdraw Amount");
            System.out.println("2. Deposit Amount");
            System.out.println("3. Display Details");
            System.out.println("4. Exit");
            System.out.println("-----------------------------");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmt = sc.nextDouble();
                    account.withdraw(withdrawAmt);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmt = sc.nextDouble();
                    account.deposit(depositAmt);
                    break;

                case 3:
                    account.accountDetails();
                    break;

                case 4:
                    System.out.println("Thank you! Visit Again.");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 4);
        sc.close();
    }
}

class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public void setDetails(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Deposit should be positive.");
        } else {
            balance += amount;
            System.out.println("Deposited successfully.");
        }
    }

    public void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("Invalid amount.");
        } else if (balance - amount < 0) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn successfully.");
        }
    }

    public void accountDetails() {
        System.out.println("----- Account Details -----");
        System.out.println("Account Number      : " + accountNumber);
        System.out.println("Account Holder Name : " + accountHolderName);
        System.out.println("Total Balance       : ₹" + balance);
        System.out.println("-----------------------------");
    }
}
