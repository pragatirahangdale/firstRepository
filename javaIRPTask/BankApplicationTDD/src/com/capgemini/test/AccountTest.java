package com.capgemini.test;

import com.capgemini.exceptions.InsufficientInitialBalanceException;
import com.capgemini.model.Account;
import com.capgemini.repository.AccountRepository;
import com.capgemini.service.AccountService;
import com.capgemini.service.AccountServiceImpl;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

//import static  org.mockito.mock
public class AccountTest {
AccountService accountService;
	
	@Mock
	AccountRepository accountRepository;
	
	
	@Before
	public void setUp() throws Exception {
		
		MockitoAnnotations.initMocks(this);
		
		accountService = new AccountServiceImpl(accountRepository);
	}

	/*
	 * test cases for create account
	 * 1. when the amount is less than 500 system should throw exception
	 * 2. when the valid info is passed account should be created successfully
	 */
	
	@Test(expected = com.capgemini.exceptions.InsufficientInitialBalanceException.class)
	public void whenTheAmountIsLessThan500SystemShouldThrowException() throws InsufficientInitialBalanceException
	{
		accountService.createAccount(101, 400);
	}
	@Test
	public void whenValidAccountThenShouldReturnAccountCreatedSuccessfully() throws InsufficientInitialBalanceException 
	{
		Account account = new Account();
		account.setAccountNumber(101);
		account.setAmount(5000);
		when(accountRepository.save(account)).thenReturn(true);
		assertEquals(account, accountService.createAccount(101, 5000));
	}

}
