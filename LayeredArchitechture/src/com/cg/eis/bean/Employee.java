package com.cg.eis.bean;

public class Employee {
	public  int Eid;
	public String Ename;
	
	
	public  Double Esalary;
	public  String Edesignation;
	
	public  String EInsuranceScheme;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int eid, String ename, Double esalary, String edesignation, String eInsuranceScheme) {
			super();
			Eid = eid;
			Ename = ename;
			Esalary = esalary;
			Edesignation = edesignation;
			EInsuranceScheme = eInsuranceScheme;
		}
	public int getEid() {
		return Eid;
	}
	public void setEid(int eid) {
		Eid = eid;
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	public Double getEsalary() {
		return Esalary;
	}
	public void setEsalary(Double esalary) {
		Esalary = esalary;
	}
	public String getEdesignation() {
		return Edesignation;
	}
	public void setEdesignation(String edesignation) {
		Edesignation = edesignation;
	}
	public String getEInsuranceScheme() {
		return EInsuranceScheme;
	}
	public void setEInsuranceScheme(String eInsuranceScheme) {
		EInsuranceScheme = eInsuranceScheme;
	}
	@Override
	public String toString() {
		return "Employee [Eid=" + Eid + ", Ename=" + Ename + ", Esalary=" + Esalary + ", Edesignation=" + Edesignation
				+ ", EInsuranceScheme=" + EInsuranceScheme + "]";
	}

	public int compareTo(Employee e) {
		int diff=this.getEid()-e.getEid();
		if(diff>0)
			return 1;
		else if(diff<0)
			return -1;
		else return 0;
		
		
	}
	}

