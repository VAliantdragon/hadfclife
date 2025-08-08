package org.example;

import org.example.Exception.DepositLimit;
import org.example.Exception.UnsuffecientBalanceException;
import org.example.controller.BankAccountServiceImpl;
import org.example.entity.BankAccount;
import org.example.service.BankAccountService;

public class Main {
    public static void main(String[] args) {

        BankAccount account=new BankAccount(101,20,155456,"asadfa",500);
        BankAccountService service =new BankAccountServiceImpl();
//        System.out.println(service.checkBalance(account));
//        service.depositAmount(account, 5000.0);
//        service.withdrawAmount(account,100000);
//        service.withdrawAmount(account,200);
//        try{
//            service.withdrawAmount(account,1);
//        }
//        catch (UnsuffecientBalanceException u){
//            System.out.println(u);
//        }

        try{
            service.depositAmount(account,3000);
        }
        catch (DepositLimit u){
            System.out.println(u);
        }

    }

    public void division(int a,int b) {

        try {
            if(b==0){
                throw new ArithmeticException("bhuka choda");
            }
            else{
                int division=(a / b);
                System.out.println(division);
            }

        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}