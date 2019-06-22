package com.cg.service;
import com.cg.bean.Account;

public class AccountService implements gst, Transaction {

	@Override
	public double withdraw(Account a, double amount) {
		// TODO Auto-generated method stub
		double new_balance=a.getBalance()-amount;
		if(new_balance<1000) {
			new_balance = a.getBalance();
			
			System.out.println("Insufficient Balance");
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
		return 0;
	}

}
