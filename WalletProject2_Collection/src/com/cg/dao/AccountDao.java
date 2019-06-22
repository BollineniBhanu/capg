package com.cg.dao;
import java.util.*;
import com.cg.bean.Account;

public interface AccountDao {
public boolean addAccount(Account ob);
public boolean updateAccount(Account ob);
public boolean deleteAccount(Account ob);
public Account findAccount(Long mobileno);
public Map<Long,Account>getAllAccounts();
public boolean transferMoney(Account from,Account to);
}
