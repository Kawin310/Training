package com.training;

public class Application {

	public static void main(String[] args)
	{
	PermutationOfString object1=new PermutationOfString();
	
    String []changes=object1.change("cat");
    System.out.println(changes);

	}	
}

class PermutationOfString{
 
public String[] change(String value)
{
	
	String data=value;
	int limit=data.length();
	char[]len;
	String []nq;
	
	    
	for(int i=0;i<limit;i++) {
		
		len=data.toCharArray();
		System.out.println(len);
		
		
		
		
	}
	
	
	return null;
	
	
}

public PermutationOfString() {
	super();
	// TODO Auto-generated constructor stub
}


	
	
	
}