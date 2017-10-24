package com.atm;

public class BalanceInquiry extends Transaction {
	private int balance;

	public BalanceInquiry(int accountNum, Bank bankData) {
		super(accountNum, bankData);
	}

	// Print current balance using System.out.println only
	@Override
	public void execute() {

		// Add your code here
		Account account = this.getBankData().getAccount(this.getAccountNum());

		balance = account.getCurrentBalance();
		System.out.println(balance);

	}


}
