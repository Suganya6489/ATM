package com.atm;

public class Execution {

	public static void main(String[] args) {
		Account[] acc1= new Account[3];
		 acc1[0]=new Account(121,1,1000);
		 acc1[1]=new Account(122,2,2000);
		
		Bank bank=new Bank(acc1);
		Account acc=bank.getAccount(121);
		if(null != acc){
			acc.credit(20000);
			int currentBalance=acc.getCurrentBalance();
			System.out.println("CurrentBalance" + currentBalance);
		}
		
		
	
		
		
		
		
		
		
		
		

	}

}
