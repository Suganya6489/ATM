package com.atm;

public class Bank {
	private Account[] accounts;
	private int availableBalance;
	boolean found= false;

	//initialize constructor
	public Bank(Account accounts[]){
		this.accounts=accounts;
	}
	
	

	//return the account for the corresponding account number
	public Account getAccount(int accountNum){
		Account accountFound = null;
		for(int i=0;i<accounts.length;i++){
			if(accounts[i].getAccountNumber()==accountNum){
				accountFound = accounts[i];
				break;
							}
		}
		
		
	return accountFound;
	
	}
	
	public int getAvailableBalance(){
		return availableBalance;
	}
	
	public Account[] getAccounts() {
		return accounts;
	}



	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}



	public boolean authenticateUser(int accountNum,int pin){
	
		Account accountFound = getAccount(accountNum);
		if(null==accountFound)
		{
			return false;
		}
		if(accountFound.getPin()!=pin)
		{
			return false;
		}
		
		return true;
		
	}
	
	
	
	
	

	//Add your code here
}
