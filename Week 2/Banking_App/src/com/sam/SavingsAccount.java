package com.sam;

public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(int accountNumber, String customerName, double balance, double interestRate) {
        super(accountNumber, customerName, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public void displayAccountInfo() {
        System.out.println("Savings Account Info:");
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Customer Name: " + getCustomerName());
        System.out.println("Balance: " + getBalance());
        System.out.println("Interest Rate: " + interestRate);
    }
    
}
