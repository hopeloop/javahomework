package W3;

import java.util.Date;

public class Q9_7_The_Account_Class {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000);
        account.setAnnualInterestRate(4.5);
        account.withDraw(2500);
        account.deposit(3000);
        System.out.printf("The balance: " + account.getBalance());
        System.out.println("\nThe monthly interest: " + account.getMonthlyInterest());
        System.out.println("\nThe date when this account is created: " + account.getDataCreated());
    }
}

class Account {
    private int id;
    private double balance;
    private static double annualInterestRate;
    java.util.Date date = new Date();
    private Date dataCreated = date;

    Account() {
    }

    Account(int specifiedId, double initialBalance) {
        id = specifiedId;
        balance = initialBalance;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDataCreated() {
        return dataCreated;
    }

    public double getMonthlyInterest() {
        return balance * (annualInterestRate / 1200);
    }

    public boolean withDraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        else return false;
    }

    public void deposit(int amount) {
        balance += amount;
    }
}
