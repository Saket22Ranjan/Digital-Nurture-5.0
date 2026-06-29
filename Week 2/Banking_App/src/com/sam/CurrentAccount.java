package com.sam;

public class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(int accountNumber, String customerName, double balance, double overdraftLimit) {
        super(accountNumber, customerName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void displayAccountInfo() {
        System.out.println("Current Account Info:");
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Customer Name: " + getCustomerName());
        System.out.println("Balance: " + getBalance());
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }
    
}
