package com.training.product;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) {
     
		
		Product item1=new Product(11,"unknown",1000);
		Product item2=new Product(12,"known",2000);
		Product item3=new Product(13,"cat",3000);
		Product item4=new Product(14,"Dog",4000);
		
		Set<Product>list=new TreeSet<>();
		list.add(item1);
		list.add(item2);
		list.add(item3);
		list.add(item4);
		
		ProductService service=new ProductService(list);
		Set<Product>prod=service.getTopThree();
		for(Product obj:prod)
		{
			System.out.println(obj);
		}
	 
	}

}
