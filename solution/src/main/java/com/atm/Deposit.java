package com.atm;

public class Deposit extends Transaction{
	private int amount;
	
	
	public Deposit(int accountNum, Bank bankData,int amount) {
		super(accountNum, bankData);
		this.amount =amount;
	}

	@Override
	public void execute() {
		//Add your code here
		Account account = this.getBankData().getAccount(this.getAccountNum());
		account.credit(this.amount);
		System.out.println("Credit");
	}

}
