package com.training.product;

import java.awt.List;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ProductService {

	
	
	Set<Product>list=new TreeSet<>();
	
	public ProductService(Set<Product>set)
	{
		
		this.list=set;
	}
	
	public Set<Product>getTopThree()
	{
		
		//System.out.println(this.list);
		Set<Product>obj2=new TreeSet<>();
		int i;
		Iterator<Product>itr=list.iterator();

		for(i=0;i<3;i++)
		{
			obj2.add(itr.next());
		
		
		//obj2.iterator();
		}
		return obj2;
		
	}
	
	/*
	 * Set<Product> modifiedSet=new TreeSet<>();
		Iterator<Product> itr= set.iterator();
		int i=1;
		while(itr.hasNext()) {
			modifiedSet.add(itr.next());
			i++;
			
			if(i>3) {
				break;
			}
		}
		return modifiedSet;
	}
	 */
}
