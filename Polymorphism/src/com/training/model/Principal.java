package com.training.model;

import com.training.ifaces.Conditional;

public class Principal implements Conditional  {
	
	public String principalAge;

	public Principal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Principal(String principalAge) {
		super();
		this.principalAge = principalAge;
	}

	public String getPrincipalAge() {
		return principalAge;
	}

	public void setPrincipalAge(String principalAge) {
		this.principalAge = principalAge;
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
		return result;	}

		

}
