package com.capgemini.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.capgemini.model.BankAccount;

public interface BankAccountRepositoryIF {
	
	Map<String, BankAccount>  saveAccount();
	List <BankAccount> findAllAccounts();
	BankAccount searchAccount(String accountNo);
}