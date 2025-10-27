import java.util.*;

class Transaction {
    private String type;
    private double amount;
    private Date date;

    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
        this.date = new Date();
    }

    @Override
    public String toString() {
        return String.format("%s: $%.2f on %s", type, amount, date);
    }
}

class Account {
    protected String accountNumber;
    protected double balance;
    protected List<Transaction> transactions;

    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.transactions = new ArrayList<>();
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactions.add(new Transaction("Deposit", amount));
            System.out.println("Deposited $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            transactions.add(new Transaction("Withdrawal", amount));
            System.out.println("Withdrew $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void printTransactionHistory() {
        System.out.println("\nTransaction History for Account " + accountNumber + ":");
        for (Transaction t : transactions) {
            System.out.println("  " + t);
        }
    }
}

class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, double initialBalance, double interestRate) {
        super(accountNumber, initialBalance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = balance * interestRate / 100;
        deposit(interest);
        System.out.println("Interest added: $" + interest);
    }

    @Override
    public void withdraw(double amount) {
        
        System.out.println("Savings account withdrawal:");
        super.withdraw(amount);
    }
}


class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, double initialBalance, double overdraftLimit) {
        super(accountNumber, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && balance + overdraftLimit >= amount) {
            balance -= amount;
            transactions.add(new Transaction("Withdrawal", amount));
            System.out.println("Withdrew $" + amount + " (Checking Account)");
        } else {
            System.out.println("Overdraft limit reached or invalid amount.");
        }
    }
}


public class BankAccountSimulation {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SA100", 1000, 2.0);
        CheckingAccount checking = new CheckingAccount("CA101", 500, 300);

        savings.deposit(500);
        savings.withdraw(250);
        savings.addInterest();

        checking.deposit(1000);
        checking.withdraw(500);  

        
        System.out.println("\nFinal Balances:");
        System.out.println("Savings: $" + savings.getBalance());
        System.out.println("Checking: $" + checking.getBalance());

        savings.printTransactionHistory();
        checking.printTransactionHistory();
    }
}
