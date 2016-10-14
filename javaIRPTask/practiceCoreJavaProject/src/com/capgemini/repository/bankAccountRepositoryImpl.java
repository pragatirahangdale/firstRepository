package com.capgemini.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.capgemini.model.BankAccount;

public class bankAccountRepositoryImpl implements BankAccountRepositoryIF {

	List <BankAccount>  bankAccount = null;
	Map <String, BankAccount> bankAccountMap = new HashMap();
	BankAccount b1 = new BankAccount();
	BankAccount b2 = new BankAccount();
	
	public Map<String, BankAccount>  saveAccount(){
		System.out.println("111 bankAccountMap : ");
		b1.setBankId("1");
		b1.setAccountNo("1001"); 
		b1.setAccountType("Saving");
		b1.setAccountBal(2000);
		
		b2.setBankId("1");
		b2.setAccountNo("1002"); 
		b2.setAccountType("Saving");
		b2.setAccountBal(5000); 
		
		bankAccountMap.put("1001", b1);
		bankAccountMap.put("1002", b2);
		//bankAccount.add(b1);
	//	bankAccount.add(b2);
		System.out.println("bankAccountMap : "+bankAccountMap);

		return bankAccountMap;
	}
	public List <BankAccount> findAllAccounts(){
		//BankAccount b1=null, b2=null;
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
