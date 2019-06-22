package com.cg.pl;
import com.cg.bean.*;
public class MyWallet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ob = new Account(100,1111111111,"king",10000.00);
		System.out.println(ob);
		double b1=ob.withdraw(2000.00);
		System.out.println(b1);
		
		Account ob1 = new SavingAccount(101,22222222,"Raja",25000.00);
		((SavingAccount) ob1).setInterest();
		System.out.println(ob1);
		b1 = ob1.withdraw(24500.00);
		System.out.println(b1);
		
		SavingAccount s1=(SavingAccount) ob1;
		s1.setInterest();
		System.out.println(ob1);
		
		SavingAccount ob2 = new SavingAccount(105,2243432,"Neha",55000.00);
		printAcc(ob2);
		
		System.out.println((ob2 instanceof SavingAccount));
		System.out.println((ob2 instanceof Account));
		System.out.println((ob2 instanceof Object));
		//System.out.println((ob2 instanceof String));//error
	}
	public static void printAcc(Account a) {
		System.out.println(a);
	}

}
