package com.cg.eis.dao;
import java.util.HashMap;
import java.util.Map;
import org.omg.Messaging.SyncScopeHelper;
import com.cg.eis.bean.Employee;
public class EmployeeDaoImpl implements EmployeeDaoInterface {
	static Map<Integer,Employee> emmap=new HashMap<Integer,Employee>();

	@Override
	public boolean addEmployee(Employee e) {
		Map<Integer, Employee> emap = null;
		// TODO Auto-generated method stub
		emap.put(e.getEid(),e);
		
		return true;
	}

	@Override
	public Map<Integer, Employee> getAllEmploee() {
		Map<Integer, Employee> emap = null;
		// TODO Auto-generated method stub
		return  emap;
		
	}

	@Override
	public String getScheme(int Eid, double Esalary, String Edesignation) {
		// TODO Auto-generated method stub
		if(((Esalary>=5000)&&(Esalary<20000))&&(Edesignation.equalsIgnoreCase("System Associate"))) {
			return "scheme C";
		}
		else if(((Esalary>=20000)&&(Esalary<4000))&&(Edesignation.equalsIgnoreCase("Programmer"))) {
	    return "scheme B";
		}
		else if((Esalary>4000)&&(Edesignation.equalsIgnoreCase("Manager"))) {
			return "scheme A";
		}
		else if((Esalary<5000)&&(Edesignation.equalsIgnoreCase("Clerk"))) {
			return "No scheme";
		}
		else
		{
			return "Invalid Details";
		}
			
	}
}
	