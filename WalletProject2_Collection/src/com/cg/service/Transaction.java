package com.cg.service;
import com.cg.bean.Account;
import com.cg.exception.InsufficientFundException;
import com.cg.service.AccountOperation;
public interface Transaction extends AccountOperation {
	public double withdraw(Account a,double amount) throws InsufficientFundException;
	public double deposite(Account a,double amount);
	public double transfer(Account from,Account to,double amount);
	public default void printStatement(Account a) {
		System.out.println("=================");
		System.out.println();
		System.out.println(a.getAid());
		System.out.println(a.getAccountholder());
		System.out.println(a.getBalance());
		System.out.println("=================");
	}
}

	