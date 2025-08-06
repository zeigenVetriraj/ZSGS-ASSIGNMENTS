import java.util.ArrayList;

/*
8. Develop a Java program to manage a list of bank accounts using ArrayList.
--->Create an Account class with the following attributes:
a. accountNumber (int)
b. holderName (String)
c. balance (double)
--->Use auto-boxing to store the balance and interest as Double wrapper objects.
--->Use manual boxing to convert a primitive interest rate into a Double object.
--->Unbox the values (both automatic and manual) to calculate and update the new balance.
--->Add at least three Account objects to an ArrayList<Account>.
--->For each account:
a. Display the holder name, account number, original balance
b. Apply 5% interest
c. Show the new balance using primitive values (unboxed).
 */
public class BanckManagement {
    public static void main(String[] args) {
        ArrayList<Account> accounts = new ArrayList<>();

        accounts.add(new Account(12547,"Raja",5000.00));
        accounts.add(new Account(23566,"Viswa",10000.00));
        accounts.add(new Account(45778,"Raja",85000.30));

        Double interestRate = Double.valueOf(5.0);  // manual boxing

        accounts.forEach(account -> {
            System.out.println("--------------------------------------");
            account.display();

            double balance = account.getBalance();

            double rate = interestRate.doubleValue();

            double interest = balance * rate / 100;
            double newBalance = balance + interest;

            System.out.println("Applied Interest Rate: " + rate + "%");
            System.out.println("New Balance (after interest): " + newBalance);
        });
    }
}

class Account{
    private int accountNumber;
    private String accountHolderName;
    private Double balance;

    public Account(int accountNumber, String accountHolderName, Double balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public Double getBalance(){
        return balance;
    }

    public void display(){
        System.out.println("Account Number   : " + accountNumber);
        System.out.println("Account Holder    : " + accountHolderName);
        System.out.println("Original Balance  : " + balance);
    }
}
