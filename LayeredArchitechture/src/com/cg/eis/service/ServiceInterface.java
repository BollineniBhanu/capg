package com.cg.eis.service;
import java.security.PublicKey;
import java.util.Map;
import com.cg.eis.bean.*;
public interface ServiceInterface {
	public boolean addEmployee(Employee e);
	public Map<Integer,Employee>getAllEmployee();
	public String getScheme(int Eid,double Esalary, String Edesignation);
	public default void printEmployeedetails(Employee e) {
		System.out.println("=================");
		System.out.println("Employee EId"+e.getEid());
		System.out.println("Employee Ename"+e.getEname());
		System.out.println("Employee ESalary"+e.getEsalary());
		System.out.println("Employee EDesignation"+e.getEdesignation());
		System.out.println("Employee Escheme"+e.getEInsuranceScheme());
		System.out.println("============");
	}

}
