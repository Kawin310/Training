package com.training.model;

import com.training.ifaces.Conditional;
import com.training.utils.ObjectFactory;

public class Application {

	public static void main(String[] args) {
   
		ObjectFactory factory=new ObjectFactory();
		Conditional object= factory.getConditional(1);
		Conditional object1= factory.getConditional(2);
		
//        Conditional kawi=new Professor();
//        Conditional gg=new Student();
        
        
        
		System.out.println(object.test("chennai"));
		System.out.println(factory.getValue(object, "chennai"));
		System.out.println(factory.getValue(object1, "28"));
		NewObjectFactory newObj=new NewObjectFactory();
		//Principal prin=newObj.getConditional(3);
		Conditional con=newObj.getConditional(3);
		System.out.println(con.test("chennai"));
		//newObj.ji();
		System.out.println(factory.getValue(con, "chennai"));
		//factory.fg(kawi);
	    int i=factory.value(20);
		System.out.println(i);

		
	}

}
