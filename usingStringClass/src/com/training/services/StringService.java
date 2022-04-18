package com.training.services;

public class StringService {

	
	//String s="ram";
	//String k="ram";
	public void stringEquals(String str1,String str2)
	{
		
		System.out.println("Is value same :="+str1.equals(str2));
		System.out.println("are they pointing to same location :="+(str1==str2));

		
	}
	
	public void stringObjectEquals()
	{
		
		String ram=new String("ram");
		String ramesh=new String("ram");

		System.out.println("Is value same :="+ram.equals(ramesh));
		System.out.println("are they pointing to same location :="+(ram==ramesh));
		
	}
	
	public String usingTrim(String name)
	{
		System.out.println("Without trim=:"+name);
		System.out.println("Left Trim:="+name.trim());
		return name.trim();
		
	}
	public void lengthOfString(String name)
	{
		String value=usingTrim(name);

		System.out.println("String lenght:="+value.length());
	}
	
	public void usingSubString(String name)
	{
		
		System.out.println(name.substring(3));
		System.out.println(name.substring(0, 2));
	}
	
	public void usingCharAtAndIndexof(String name)
	{
		
		System.out.println("Index Position of @:=" +name.indexOf('@'));
		
		System.out.println("Character At Position 3:="+name.charAt(3));
	}
	
	public void usingReplace(String str1,String str2)
	{
		System.out.println(str1.replace(".com", ".org"));
		System.out.println(str2.replace('c', 'm'));
	}
	
	public void usingConcat(String str1,String str2)
	{
		System.out.println(str1.concat(str2));
		StringBuilder builder=new StringBuilder(str1);
		builder.append(str2);
		//String k=builder.toString();
		System.out.println(builder.toString());
	}
	public void usingCompareTo(String str1,String str2)
	{
		System.out.println(str1.compareTo(str2));
	}
	public void  usingStringFormat(String str1,double mark)
	{
		String frmString=String.format("%S",str1);
		System.out.println(frmString);
		
		System.out.println(String.format("mark %.2f",mark));
		
	}
	public void  usingStringFormat(int mark)
	{
		System.out.println(String.format("Octal %o",mark));
		System.out.println(String.format("Hexca Decimal %X",mark));
			
	}
	
	public void usingStringFormat(String str1,String str2)
	{
		System.out.println(String.format("%1$s,%2$S",str1,str2));
	}

	public void usingStringformat(int mark1,int marks2)
	{
		System.out.println(String.format("octal %1$o,Hexa %2$x",mark1,marks2));
	}
	{
			
	}
}
