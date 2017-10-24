package com.atm;

public class Account {
	private int accountNumber;
	private int pin;
	private int currentBalance;
	
	//initialize constructor
	public Account(int accountNumber,int pin,int currentBalance){
        this.accountNumber=accountNumber;
        this.pin=pin;
        this.currentBalance=currentBalance;
		
	}

	public int getAccountNumber() {
		return accountNumber;
	}



	public int getPin() {
		return pin;
	}

	

	public int getCurrentBalance() {
		return currentBalance;
	}

	public void credit(int creditAmount){
		this.currentBalance += creditAmount;
	}
	
	public void debit(int debitAmount){
		this.currentBalance -= debitAmount;
	}
	
	
	
	//Add your code here
	
	
}

