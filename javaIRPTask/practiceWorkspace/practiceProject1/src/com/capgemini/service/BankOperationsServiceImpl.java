package com.capgemini.service;

import com.capgemini.model.BankAccount;
import com.capgemini.repository.BankAccountRepositoryIF;
import com.capgtemini.exceptions.InsufficientInitialBalaceException;

public class BankOperationsServiceImpl implements BankOperationsServiceIF {
	BankAccountRepositoryIF  bankAccountRepository;
	double balance=0;
	public BankOperationsServiceImpl(BankAccountRepositoryIF bankAccountRepository){
		this.bankAccountRepository=bankAccountRepository;
	}
	
	@Override
	public BankAccount createAccount(String accountNo, double amount){
		System.out.println("Creating new account");
		if(amount<500)
			try {
				throw new InsufficientInitialBalaceException();
			} catch (InsufficientInitialBalaceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		BankAccount account = new BankAccount();
		
		account.setAccountNo(accountNo);
		account.setAccountBal(amount);
		
		return null;
	}
	 
	@Override
	public int showAccountBalance(String accountNo){
		System.out.println("Showing new account");
		return 0;
	}
	 
	@Override
	public void withdrawAmount(String accountNo, double withdrawAmt){
		System.out.println(" Withdraw amount is = " + withdrawAmt);
		if(withdrawAmt >= balance)
			System.out.println(" Withdraw amount is more than available balance");

	}
	 
	@Override
	public void depositAmount(String accountNo, double depositAmt){
		System.out.println("Deposit");
	}

}
