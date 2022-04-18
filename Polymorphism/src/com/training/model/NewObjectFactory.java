package com.training.model;

import com.training.ifaces.Conditional;
import com.training.utils.ObjectFactory;

public class NewObjectFactory extends ObjectFactory {
	
	@Override
	public Conditional getConditional(int key) {
		// TODO Auto-generated method stub
		Object obj = null;
		
	if(key<=2)
	{
		obj=super.getConditional(key);
		
	}
	else if(key==3)
	{
		
		obj=  new Principal();
	}
		return (Conditional) obj;
		
	}
	

	
//
//		switch (key) {
//		case 3:
//			
//		return new Principal("chennai");
//
//		default:
//			return super.getConditional(key);
//		}
	}
	
//public void ji()
//{
//	System.out.println("hii");
//}
	
			
	
	
	
	
	


