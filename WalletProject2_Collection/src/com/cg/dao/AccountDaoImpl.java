package com.cg.dao;

import java.util.HashMap;
import java.util.Map;

import com.cg.bean.Account;

public class AccountDaoImpl implements AccountDao{
static Map<Long,Account>accmap=new HashMap<Long,Account>();
	@Override
	public boolean addAccount(Account ob) {
		// TODO Auto-generated method stub
		accmap.put((long) ob.getMobile(), ob);
		return true;
	}

	//@Override
	public boolean updateAccount(Account ob) {
		return false;}
		// TODO Auto-generated method stub
		//return false;
	//}

	//@Override
	public boolean deleteAccount(Account ob) {
		return false;}
		// TODO Auto-generated method stub
		//return false;
	//}

	
		// TODO Auto-generated method stub
		//return false;
	//}

	//@Override
	public Map<Long, Account> getAllAccounts() {
		// TODO Auto-generated method stub
		return accmap;
	}


		@Override
		public Account findAccount(Long mobileno) {
			// TODO Auto-generated method stub
			Account ob = accmap.get(mobileno);
			return ob;
		}

		@Override
		public boolean transferMoney(Account from, Account to) {
			// TODO Auto-generated method stub
			return false;
		}
}


		//@Override
		//public boolean findAccount(Account ob) {
			// TODO Auto-generated method stub
		//	return false;
		//}

		//@Override
		//public boolean transferMoney(Account from, Account to) {
			// TODO Auto-generated method stub
			//return false;
		

	//@Override
	//public boolean transferMoney(Account from, Account to) {
		// TODO Auto-generated method stub
		//return false;
	//}}
