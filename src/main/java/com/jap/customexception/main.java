package com.jap.customexception;

public class main {
    public static void main(String[] args) {
        Account account=new Account(2000);
        try {
            System.out.println("Remaining Account Balance = " + account.withdraw(400));

        }catch (InsufficientFundException e){
            System.out.println("e = " + e);

        }

    }

}
