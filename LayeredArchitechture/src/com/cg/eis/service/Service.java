package com.cg.eis.service;
import java.util.Map;
import com.cg.eis.bean.Employee;
import com.cg.eis.dao.*;


public class Service implements ServiceInterface {
	EmployeeDaoImpl dao=new EmployeeDaoImpl();
	
	@Override
	public boolean addEmployee(Employee e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Map<Integer, Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getScheme(int Eid, double Esalary, String Edesignation) {
		// TODO Auto-generated method stub
		return null;
	}


	
	}


