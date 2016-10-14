package com.capgemini.repository;

import java.util.List;

import com.capgemini.model.BankAccount;

public interface BankAccountRepositoryIF {

	List <BankAccount> findAllAccounts();
	BankAccount searchAccount(String accountNo);
}