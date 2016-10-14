package com.capgemini.repository;

import java.util.List;
import com.capgemini.model.*;

public class bankAccountRepositoryImpl implements BankAccountRepositoryIF {

	List <BankAccount>  bankAccount = null;
	
	public List <BankAccount> findAllAccounts(){
		//BankAccount b1=null, b2=null;
		BankAccount b1 = new BankAccount();
		BankAccount b2 = new BankAccount();
		b1.setBankId("1");
		b1.setAccountNo("1001"); 
		b1.setAccountType("Saving");
		b1.setAccountBal(2000);
		
		b2.setBankId("1");
		b2.setAccountNo("1002"); 
		b2.setAccountType("Saving");
		b2.setAccountBal(5000); 
		
		bankAccount.add(b1);
		bankAccount.add(b2);
		return bankAccount;
	}
	
	public BankAccount searchAccount(String accountNo){
		return null;
		
	}
}
