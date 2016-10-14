package com.capgemini.service;


import com.capgemini.model.BankAccount;
import com.capgemini.repository.BankAccountRepositoryIF;
import com.capgtemini.exceptions.AccountAleardyExists;
import com.capgtemini.exceptions.IncorrectAmountEntered;
import com.capgtemini.exceptions.InsufficientInitialBalanceException;

public class BankOperationsServiceImpl implements BankOperationsServiceIF {
	BankAccountRepositoryIF  bankAccountRepository;
	int balance=0;
	public BankOperationsServiceImpl(BankAccountRepositoryIF bankAccountRepository){
		this.bankAccountRepository=bankAccountRepository;
	}
	
	@Override
	public BankAccount createAccount(String accountNo, int amount) throws AccountAleardyExists, InsufficientInitialBalanceException{
		//System.out.println("Creating new account= "+ bankAccountRepository.saveAccount());
        //Map bankAccount = bankAccountRepository.saveAccount();
		//System.out.println("bankAccount : "+bankAccount);
		if(amount<500){
			System.out.println("Exception 11 ");
			throw new InsufficientInitialBalanceException();
			//throw new  IllegalArgumentException();
		}else{
			System.out.println("11 Code for new account creation");
		}
		BankAccount account = new BankAccount();
		
		if(accountNo.equalsIgnoreCase("1001")){
			System.out.println("Exception 22 ");
			throw new AccountAleardyExists();
		}else{
			System.out.println("22 Code for new account creation");
		}
		
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
	public void withdrawAmount(String accountNo, int withdrawAmt){
		System.out.println(" Withdraw amount is = " + withdrawAmt);
		if(withdrawAmt >= balance)
			System.out.println(" Withdraw amount is more than available balance");

	}
	 
	@Override
	public void depositAmount(String accountNo, int depositAmt) throws IncorrectAmountEntered{
		if(depositAmt<=0){
			throw new IncorrectAmountEntered();
		}
	}

}
