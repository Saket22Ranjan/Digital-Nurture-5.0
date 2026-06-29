package com.sam;
import java.util.ArrayList;

public class BankingSystem{
    public static void main(String[] args){
        ArrayList<BankAccount> accounts = new ArrayList<>();

        accounts.add(new CurrentAccount(1001, "Alice", 5000.0, 1000.0));
        accounts.add(new SavingsAccount(1002, "Bob", 3000.0, 0.03));    
        accounts.add(new SavingsAccount(1003, "Charlie", 2000.0, 0.04));    
        accounts.add(new SavingsAccount(1002, "Bob", 3000.0, 0.03));

        accounts.get(0).deposit(500.0);  
        accounts.get(1).withdraw(1000.0);

        for (BankAccount account : accounts) {
            account.displayAccountInfo();
            System.out.println();
        }

        
    }
}
