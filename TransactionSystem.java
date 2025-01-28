

import java.util.Scanner;

class Transaction {
    private String senderAccount;
    private String receiverAccount;
    private double amount;

    public Transaction(String senderAccount, String receiverAccount, double amount) {
        this.senderAccount = senderAccount;
        this.receiverAccount = receiverAccount;
        this.amount = amount;
    }

    public String getSenderAccount() {
        return senderAccount;
    }

    public String getReceiverAccount() {
        return receiverAccount;
    }

    public double getAmount() {
        return amount;
    }
}

class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
}

public class TransactionSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Account account1 = new Account("12345", 1000.0);
        Account account2 = new Account("67890", 500.0);

        System.out.println("Transaction System");
        System.out.println("---------------------");

        while (true) {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Transfer");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");

            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    deposit(account1, scanner);
                    break;
                case 2:
                    withdraw(account1, scanner);
                    break;
                case 3:
                    transfer(account1, account2, scanner);
                    break;
                case 4:
                    checkBalance(account1, account2);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }

    private static void deposit(Account account, Scanner scanner) {
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        account.deposit(amount);
        System.out.println("Deposit successful. New balance: " + account.getBalance());
    }

    private static void withdraw(Account account, Scanner scanner) {
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        if (amount > account.getBalance()) {
            System.out.println("Insufficient balance.");
        } else {
            account.withdraw(amount);
            System.out.println("Withdrawal successful. New balance: " + account.getBalance());
        }
    }

    private static void transfer(Account sender, Account receiver, Scanner scanner) {
        System.out.print("Enter amount to transfer: ");
        double amount = scanner.nextDouble();
        if (amount > sender.getBalance()) {
            System.out.println("Insufficient balance.");
        } else {
            sender.withdraw(amount);
            receiver.deposit(amount);
            System.out.println("Transfer successful. New balance (sender): " + sender.getBalance());
            System.out.println("New balance (receiver): " + receiver.getBalance());
        }
    }

    private static void checkBalance(Account account1, Account account2) {
        System.out.println("Account 1 balance: " + account1.getBalance());
        System.out.println("Account 2 balance: " + account2.getBalance());
    }
}


