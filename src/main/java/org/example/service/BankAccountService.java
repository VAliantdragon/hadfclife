package org.example.service;

import org.example.Exception.DepositLimit;
import org.example.Exception.UnsuffecientBalanceException;
import org.example.entity.BankAccount;

public interface BankAccountService {

    public double checkBalance(BankAccount account);
    public double withdrawAmount(BankAccount account,double amount) throws UnsuffecientBalanceException;
    public double depositAmount(BankAccount account,double amount) throws DepositLimit;

}
