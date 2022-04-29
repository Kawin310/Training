package occurrence;

import java.awt.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class Application {

	public static void main(String[] args) {

		Occurrence o=new Occurrence();
		//Set<Integer[]> god=new TreeSet<>();
		o.toFind();	
	}
}

class Occurrence{
	
	private int a[] ={1,5,2,1,2,6,7,1};
     
	//ArrayList<Integer>god=Arrays.asList(1,5,2,1,2,6,7,1);
	Set<Integer>aa;
	Set<Integer>ab;
	Map<Integer,Set<Integer>> name=new HashMap<>();
	
	public void toFind()
	{
		int b[]=a;
		int limit=b.length;
		for(int i=0;i<limit;i++)
		{
			int k=b[i];
			int count=0;
			aa=new TreeSet<>();
     
			for(int j=0;j<limit;j++)
			{
			if(k==b[j])
			{
				count++;
				aa.add(j);
				 name.put(k,aa);

			}	
			}
			 //Map<Integer,Set<Integer>> name;
//	        System.out.println(k+" Index "+aa.toString());
			//System.out.print("Occurrence "+k+"==" +count+"\n");
			
		}
		
		System.out.println("-------------");

		for (Map.Entry<Integer,Set<Integer>> entry : name.entrySet())
			           System.out.println( entry.getKey() +
                             ", Index = " + entry.getValue());
            
			
		
		System.out.println("-------------");
           //ab.forEach(System.out::println);
		
	
	}
	
}
	
	

