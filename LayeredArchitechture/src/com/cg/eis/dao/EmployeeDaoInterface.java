package com.cg.eis.dao;
import com.cg.eis.bean.*;
import java.util.Map;
public interface EmployeeDaoInterface {
	public boolean addEmployee(Employee e);
	public Map<Integer,Employee>getAllEmploee();
	public String getScheme(int Eid,double Esalary,String Edesignation);
}