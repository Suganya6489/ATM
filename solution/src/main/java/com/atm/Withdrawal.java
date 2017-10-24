package com.atm;

public class Withdrawal extends Transaction {
	private int amount;

	//initialize constructor
	public Withdrawal(int accountNum, Bank bankData,int amount) {
		super(accountNum, bankData);
		this.amount =amount;
	}

	//check if withdrawal possible
	public boolean isWithdrawalPossible(Account account){
		if(account.getCurrentBalance()<this.amount)
		{
			return false;
		}
		
	  return true;
	}
	@Override
	public void execute() {
		//Add your code here
		Account account = this.getBankData().getAccount(this.getAccountNum());
		if(isWithdrawalPossible(account)){
			account.debit(this.amount);
		}
		
	}

}
