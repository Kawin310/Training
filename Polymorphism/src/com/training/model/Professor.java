package com.training.model;

import com.training.ifaces.Conditional;

public class Professor implements Conditional {

	
	private String qualification;
	
	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public Professor(String qualification) {
		super();
		this.qualification = qualification;
	}

	public Professor() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean test(Object value) {

		String strValue=(String)value;
		//Object val=value;
		//System.out.println(val);
		//int i=(Integer)value;
		boolean result=false;
		if(strValue.toLowerCase().equals("chennai"))
		{
			result=true;
		}
		return result;
	}
   
}
