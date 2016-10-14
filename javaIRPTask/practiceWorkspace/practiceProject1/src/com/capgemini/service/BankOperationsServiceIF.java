package com.capgemini.service;

import com.capgemini.model.BankAccount;
import com.capgtemini.exceptions.InsufficientInitialBalaceException;

public interface BankOperationsServiceIF {

	BankAccount createAccount(String accountNo, double amount) throws InsufficientInitialBalaceException;

	int showAccountBalance(String accountNo);

	void withdrawAmount(String accountNo, double withdrawAmt);

	void depositAmount(String accountNo, double depositAmt);

}