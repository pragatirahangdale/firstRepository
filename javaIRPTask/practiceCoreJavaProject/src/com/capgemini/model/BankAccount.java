package com.capgemini.model;

public class BankAccount {
	private String bankId;
	private String accountNo;
	private String accountType;
	private int accountBal;
	public int getAccountBal() {
		return accountBal;
	}
	public void setAccountBal(int accountBal) {
		this.accountBal = accountBal;
	}
	public String getBankId() {
		return bankId;
	}
	public void setBankId(String bankId) {
		this.bankId = bankId;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	

}
