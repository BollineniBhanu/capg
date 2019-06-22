package com.cg.service;
import com.cg.bean.Account;
public interface Transaction {
	public double withdraw(Account a,double amount);
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

	