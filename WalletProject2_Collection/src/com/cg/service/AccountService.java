package com.cg.service;
import java.util.Map;

import com.cg.bean.Account;
import com.cg.dao.AccountDao;
import com.cg.dao.AccountDaoImpl;
import com.cg.exception.InsufficientFundException;

public class AccountService implements gst, Transaction {
	AccountDao dao=new AccountDaoImpl();
	//implemented withdraw,deposite,transferMoney
	//public double withdraw(Account ob,double amount)throws InsufficientFundException {
	//return dao.addAccount(ob);
//	}
	//public boolean deleteAccount(Account ob){
	//	return false;}
	//public Account findAccount(Long mobileno){
	//	return null;}
	//public Map<Long,Account>getAllAccounts(){
	//	return dao.getAllAccounts();
//}

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
	a.setBalance(a.getBalance() + amount);
		return a.getBalance();
	}

	@Override
	public double transfer(Account from, Account to, double amount) {
		double newBalance=from.getBalance()-amount;
		if(newBalance<1000.00) {
		System.out.println("Insufficient balance");
		return 1;
		}
		from.setBalance(newBalance);
		double b2=to.getBalance()+amount;
		to.setBalance(b2);
		String ans="from account" + from.getAid()+"balance" + from.getBalance() +"\n"+"to account" +to.getAid()+"balance";
		return 1;
	
		// TODO Auto-generated method stub
	
	}

	@Override
	public double calculateTax(double percent, double amount) {
		// TODO Auto-generated method stub
		return amount * gst.PERCENT_5;
	}

	@Override
	public boolean addAccount(Account ob) {
		// TODO Auto-generated method stub
		return dao.addAccount(ob);
	}
	
		
	@Override
	public boolean deleteAccount(Account ob) {
		// TODO Auto-generated method stub
		return dao.deleteAccount(ob);
	}

	@Override
	public Account findAccount(Long mobileno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<Long, Account> getAllAccounts() {
		// TODO Auto-generated method stub
		return null;
	}

}
