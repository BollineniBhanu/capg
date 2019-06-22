package com.cg.eis.service;

public class Validator {
	
	
	
	String Eidpattern="[1-9][0-9][0-9]";
	String ESalary="[1-9]*[.]*+[0-9]*";
	public static boolean validatedate(String data,String  Pattern) {
		return data.matches(Pattern);
		
	}
}
