package com.capgemini.service;

import com.capgemini.model.BankAccount;
import com.capgtemini.exceptions.AccountAleardyExists;
import com.capgtemini.exceptions.IncorrectAmountEntered;
import com.capgtemini.exceptions.InsufficientInitialBalanceException;

public interface BankOperationsServiceIF {

	BankAccount createAccount(String accountNo, int amount) throws AccountAleardyExists, InsufficientInitialBalanceException;
	//BankAccount createAccount(String accountNo, int amount) throws IllegalArgumentException;
	int showAccountBalance(String accountNo);

	void withdrawAmount(String accountNo, int withdrawAmt);

	void depositAmount(String accountNo, int depositAmt) throws IncorrectAmountEntered;

}