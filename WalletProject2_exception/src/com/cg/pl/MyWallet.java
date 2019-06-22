package com.cg.pl;
import com.cg.bean.*;
import com.cg.exception.InsufficientFundException;
import com.cg.service.AccountService;
import com.cg.service.gst;
public class MyWallet {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
	AccountService service = new AccountService();
	SavingAccount ob = new SavingAccount(105, 655,"fdhty",50000.00);
	service.printStatement(ob);

try
{

	double b1 = service.withdraw(ob,50000);
	System.out.println("balance after withdraw: "+b1);
	}
	catch(InsufficientFundException e)
	{
		System.err.println(e.getMessage());
		System.err.println(e);
	double b1 = 0.0;
	double tax = service.calculateTax(gst.PERCENT_5, b1);
	System.out.println("GST is " + tax);
	}
	}
}
