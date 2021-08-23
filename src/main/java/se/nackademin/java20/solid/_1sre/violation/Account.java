package se.nackademin.java20.solid._1sre.violation;

public class Account {
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public void deposit(int money) {
        this.balance += money;
    }

    public void print() {
        System.out.println("Current balance: " + balance);
    }
}
