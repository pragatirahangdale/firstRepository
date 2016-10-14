package com.capgemini.test;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.repository.BankAccountRepositoryIF;
import com.capgemini.service.BankOperationsServiceIF;
import com.capgemini.service.BankOperationsServiceImpl;
import com.capgtemini.exceptions.AccountAleardyExists;
import com.capgtemini.exceptions.IncorrectAmountEntered;
import com.capgtemini.exceptions.InsufficientInitialBalanceException;

public class AccountTest {
	
		@Mock
		BankAccountRepositoryIF bankAccountRepository ;
		BankOperationsServiceIF bankOperationsService ;

		@Before
		public void setUp() throws Exception{
		bankOperationsService = new BankOperationsServiceImpl(bankAccountRepository);
		}
	
		@Test( expected = com.capgtemini.exceptions.InsufficientInitialBalanceException.class)
		public void whenAmountIsLessThan500SysytemShouldThrowException() throws AccountAleardyExists, InsufficientInitialBalanceException{
			bankOperationsService.createAccount("1001", 400);
		}
		
		@Test( expected= com.capgtemini.exceptions.AccountAleardyExists.class)
		public void whenAccountNumberAlreadyExistsSystemShouldThrowException() throws AccountAleardyExists, InsufficientInitialBalanceException{
			bankOperationsService.createAccount("1001", 600);
		}
		
		@Test( expected= com.capgtemini.exceptions.IncorrectAmountEntered.class)
		public void whenAmountIsZeroOrlessThanZeroSystemShouldThrowException() throws IncorrectAmountEntered{
			bankOperationsService.depositAmount("1001", 0);
		}
		
}
