package com.cg.service;
import com.cg.bean.Account;
import com.cg.exception.InsufficientFundException;

public class AccountService implements gst, Transaction {

	@Override
	public double withdraw(Account a, double amount) throws InsufficientFundException {
		// TODO Auto-generated method stub
		double new_balance=a.getBalance()-amount;
		if(new_balance<1000) {
			new_balance = a.getBalance();
			
			//System.out.println("Insufficient Balance");
			//throw new RuntimeException("Insufficient Fund.Can not process withdrawl");
		
			throw new InsufficientFundException("Insufficient Fund.Can not process withdrawl",new_balance);
		
		}
		
		
	a.setBalance(new_balance);
		return new_balance;
		
	}

	@Override
	public double deposite(Account a, double amount) {
		// TODO Auto-generated method stub
	
		return 0;
	}

	@Override
	public double transfer(Account from, Account to, double amount) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calculateTax(double percent, double amount) {
		// TODO Auto-generated method stub
		return amount * gst.PERCENT_5;
	}

}
