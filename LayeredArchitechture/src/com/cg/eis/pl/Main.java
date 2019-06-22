package com.cg.eis.pl;

import java.util.Scanner;
import java.io.*;
import com.cg.eis.service.*;
import com.cg.eis.bean.*;


import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;



import com.cg.eis.bean.*;


public class Main {
	public static void main(String[] args) throws IOException{
		int Eid=0;
		String EName="";
		double Salary=0L;
		String EDesignation="";
		String insuranceScheme="";
		String input="";
		Service em=new Service();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
				;
		
		//Map<Long,Account> accmap=new TreeMap<Long,Account>();
	 //AccountService service= new AccountService();
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		
		String choice="";
		
		while(true)
	
		{
		
		System.out.println("Menu");		
		System.out.println("=====");
		System.out.println("1 Create new Account");
		System.out.println("2 Print All Accounts");
		System.out.println("3 delete account");
		System.out.println("4 transfer Amount");
		System.out.println("5 withdraw Amount");
		System.out.println("Enter your choice");
		System.out.println("6 Exit");
		choice=br.readLine();
		
		switch(choice)
		
		{
		case "1":int id=0;
				long mb=0L;
				String ah="";
				double bal=0.0;
				System.out.println("Enter account number");
				while(true)
				{
					String s_id=br.readLine();
					boolean ch1=Validator.validatedata(s_id, Validator.aidpattern);
					if(ch1==true)
					{
						try
						{
							id=Integer.parseInt(s_id);
							break;
						}
						catch(NumberFormatException e)
						{
							System.out.println("Account Number must be numeric.Re Enter");
							
						}
					}
					else
					{
						System.out.println("Re Enter Account Number in 3 digits");
						
					}
				}//end of account number while
				
				System.out.println("Enter Mobile number");
				while(true)
				{
					String s_mb=br.readLine();
					boolean ch1=Validator.validatedata(s_mb, Validator.mobilepattern);
					if(ch1==true)
					{
						try
						{
							mb=Long.parseLong(s_mb);
							break;
						}
						catch(NumberFormatException e)
						{
							System.out.println("Mobile Number must be numeric.Re Enter");
							
						}
					}
					else
					{
						System.out.println("Re Enter Mobile Number in 10 digits");
						
					}
				}//end of mobile number while
				//Accepting and validating account holder
				System.out.println("Account holder name");
				
					String s_ah=br.readLine();
					System.out.println("enter initial balance");
				//String s_bal=br.readLine();
				//accepting and validating balance
				String s_bal=br.readLine();
				bal=Double.parseDouble(s_bal);
				Account ob=new Account(id,mb,ah,bal);
				accmap.put(ob.getMobile(),ob);
				boolean b=service.addAccount(ob);
				System.out.println("Successfully added"+""+b);
				
				
				break;
			
			
			
			
		case"2":
			
			Collection<Account> vc = accmap.values();
			List<Account> acclist= new ArrayList<Account>(vc);

			for(Account o: acclist)
			{
			System.out.println(o);
				
			}
			
		break;
		case "3":System.out.println("enter mobile no to delete");
		mb=Long.parseLong(br.readLine());
		accmap.remove(mb);
	
			break;
			
		case "4":
			System.out.println("enter from account ");
			long from=Long.parseLong(br.readLine());
			System.out.println("enter to account");
			long to=Long.parseLong(br.readLine());
			System.out.println("enter account to transfer");
			double amount=Double.parseDouble(br.readLine());
			service.transfer(accmap.get(from), accmap.get(to),amount);
			break;
		case "5":
			System.out.println("enter  account no");
			long a=Long.parseLong(br.readLine());
			System.out.println("enter money to withdraw ");
			break;
		case "6":
			System.out.println("exit program");
			System.exit(0);
			break;
		
		default: System.out.println("Invalid choice");
			
		}
		}
	}
}
		
		
		
		
		
		
		//Collection<Account> vc = accmap.values();
		//List<Account> acclist= new ArrayList<Account>(vc);
		//Collections.sort(acclist);
		//for(Account o: acclist)
		//{
	//		System.out.println(o);
			
		//}
		//System.out.println("================= sort by balance");
		//Comparator bc=new BalanceComparator();
	//Collections.sort(acclist,bc);
		//for(Account o: acclist)
		//{
		//	System.out.println(o);
		//}
		
	//}
//}
			