
 
/*
1. All the banks operating in India are controlled by RBI. RBI has set a well defined guideline (e.g. minimum interest rate, minimum balance allowed, maximum withdrawal limit etc) which all banks must follow. For example, suppose RBI has set minimum interest rate applicable to a saving bank account to be 4% annually; however, banks are free to use 4% interest rate or to set any rates above it.
Write a program to implement bank functionality in the above scenario. Note: Create few classes namely Customer, Account, RBI (Base Class) and few derived classes (SBI, ICICI, PNB etc). Assume and implement required member variables and methods in each class.
Hint:
Class Customer
{
//Personal Details ...
// Few functions ...
}
Class Account
{
// Account Detail ...
// Few functions ...
}
Class RBI
{
Customer c; //hasA relationship
Account a; //hasA relationship
..
Public double GetInterestRate() { }
Public double GetWithdrawalLimit() { }
}
Class SBI extends public RBI
{
//Use RBI functionality or define own functionality.
}
Class ICICI extends public RBI
{
//Use RBI functionality or define own functionality.
}
*/

public class Banck {
    public static void main(String[] args) {
        SBI sbiAccount = new SBI("Ravi", "C101", "SBI123", 50000);
        ICICI iciciAccount = new ICICI("Priya", "C102", "ICI456", 70000);

        sbiAccount.displayAccountDetails();
        System.out.println("SBI Interest Rate   : " + sbiAccount.getInterestRate() + "%");
        System.out.println("SBI Withdrawal Limit: " + sbiAccount.getWithdrawalLimit());

        System.out.println();

        iciciAccount.displayAccountDetails();
        System.out.println("ICICI Interest Rate   : " + iciciAccount.getInterestRate() + "%");
        System.out.println("ICICI Withdrawal Limit: " + iciciAccount.getWithdrawalLimit());
    }
}

class Customer {
    private String name;
    private String customerId;

    public Customer(String name, String customerId) {
        this.name = name;
        this.customerId = customerId;
    }

    public void displayCustomer() {
        System.out.println("Customer Name: " + name);
        System.out.println("Customer ID  : " + customerId);
    }
}

class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance       : ₹" + balance);
    }
}

class RBI {
    protected Customer customer;
    protected Account account;

    public RBI(String name, String customerId, String accountNumber, double balance) {
        customer = new Customer(name, customerId);
        account = new Account(accountNumber, balance);
    }

    public double getInterestRate() {
        return 4.0;
    }

    public double getWithdrawalLimit() {
        return 25000; // default RBI withdrawal limit
    }

    public void displayAccountDetails() {
        System.out.println("----- Account Information -----");
        customer.displayCustomer();
        account.displayAccount();
    }
}

class SBI extends RBI {
    public SBI(String name, String customerId, String accountNumber, double balance) {
        super(name, customerId, accountNumber, balance);
    }

    @Override
    public double getInterestRate() {
        return 5.0;
    }

    @Override
    public double getWithdrawalLimit() {
        return 40000;
    }
}

class ICICI extends RBI {
    public ICICI(String name, String customerId, String accountNumber, double balance) {
        super(name, customerId, accountNumber, balance);
    }

    @Override
    public double getInterestRate() {
        return 4.5;
    }

    @Override
    public double getWithdrawalLimit() {
        return 35000;
    }
}
