
/*
1. Illustrate the concept-Encapsulation with the Payment Gateway System.[The class should encapsulate private data members such as transaction ID, payer name, payee name, amount, payment method, and transaction status. Provide appropriate public getter and setter methods to access and modify these details securely. Also include a method to display the transaction summary.]
*/
public class PaymentGateWay {
    public static void main(String[] args) {
        Transaction transaction = new Transaction();

        transaction.setDetails("TXN123456", "Alice", "Bob", 15000);
        transaction.setTransactionStatus("Success");

        transaction.displayTransactionSummary();
    }
}

class Transaction {
    private String transactionID;
    private String payerName;
    private String payeeName;
    private double amount;
    private String transactionStatus;

    public void setDetails(String transactionID, String payerName, String payeeName, double amount) {
        this.transactionID = transactionID;
        this.payerName = payerName;
        this.payeeName = payeeName;
        this.amount = amount;
    }

    public String getTransactionID() {
        return transactionID;
    }

    public String getPayerName() {
        return payerName;
    }

    public String getPayeeName() {
        return payeeName;
    }

    public double getAmount() {
        return amount;
    }

    public String getPaymentMethod() {
        if (amount < 500)
            return "Cash";
        else if (amount < 50000)
            return "G-Pay";
        else
            return "Card";
    }

    public void setTransactionStatus(String status) {
        this.transactionStatus = status;
    }

    public String getTransactionStatus() {
        return transactionStatus;
    }

    public void displayTransactionSummary() {
        System.out.println("----- Transaction Summary -----");
        System.out.println("Transaction ID    : " + getTransactionID());
        System.out.println("Payer Name        : " + getPayerName());
        System.out.println("Payee Name        : " + getPayeeName());
        System.out.println("Amount            : " + getAmount());
        System.out.println("Payment Method    : " + getPaymentMethod());
        System.out.println("Transaction Status: " + getTransactionStatus());
        System.out.println("--------------------------------");
    }
}
