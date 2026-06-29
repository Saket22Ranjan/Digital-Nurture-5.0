package com.sam;
abstract class BankAccount {
    //encapsulation: private fields with public getters and setters
    private int accountNumber; 
    private String customerName;
    private double balance;
//constructor
    public BankAccount(int accountNumber, String customerName, double Balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = Balance;
    }
//getters and setters
    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public abstract void displayAccountInfo();
}