package org.example.controller;

import org.example.Exception.DepositLimit;
import org.example.Exception.UnsuffecientBalanceException;
import org.example.entity.BankAccount;
import org.example.service.BankAccountService;

public class BankAccountServiceImpl implements BankAccountService {

//    BankAccount account;

//    public BankAccountServiceImpl(){};
//    public BankAccountServiceImpl(BankAccount account){
//        this.account=account;
//    }
    public double checkBalance(BankAccount account) {
        System.out.println("Checking balance for " + account.getCustName());
        return account.getCustAccountBalance();
    }

    public double withdrawAmount(BankAccount account,double amount) {
        try{
            if(account.getCustAccountBalance()<amount){
                System.out.println("Not enough balance");
                throw new UnsuffecientBalanceException("kangali me aata geela");
            }
            else{
                account.setCustAccountBalance(account.getCustAccountNumber()-amount);
                System.out.println("Done....");
                System.out.println("Account Number :"+account.getCustAccountNumber());
            }
        } catch (UnsuffecientBalanceException e) {
            System.out.println(e);
        }

        return account.getCustAccountBalance();
    }



    public double depositAmount(BankAccount account,double amount) throws DepositLimit{
        try{
            if(amount<account.getLimit()){
                account.setCustAccountBalance(account.getCustAccountBalance() + amount);
                System.out.println("Deposit successful.");
                System.out.println("New Balance: " + account.getCustAccountBalance());

            }
            else{
                System.out.println("Depositing above the limit");
                throw new DepositLimit("Ab padegi incom tax ki raid .....");
            }

        }
        catch (DepositLimit d){
            System.out.println(d);
        }
        return account.getCustAccountBalance();
    }
}
