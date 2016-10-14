package com.capgemini.test;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.model.BankAccount;
import com.capgemini.repository.BankAccountRepositoryIF;
import com.capgemini.service.BankOperationsServiceIF;
import com.capgemini.service.BankOperationsServiceImpl;
import com.capgtemini.exceptions.InsufficientInitialBalaceException;

public class AccountTest {
		BankAccountRepositoryIF bankAccountRepository ;
		BankOperationsServiceIF bankOperationsService ;

		@Before
		public void setUp() throws Exception{
		bankOperationsService = new BankOperationsServiceImpl(bankAccountRepository);
		}
		
		@Test( expected = com.capgtemini.exceptions.InsufficientInitialBalaceException.class)
		public void whenAmountIsLessThan500SysytemShouldThrowException() throws InsufficientInitialBalaceException{
			bankOperationsService.createAccount("1001", 500.00);
		}
}
