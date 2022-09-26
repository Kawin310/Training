package occurrence;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Application {

	public static void main(String[] args) {

		int array[] ={1,5,2,1,2,6,7,1};   		                                                                                           //ArrayList<Integer>god=Arrays.asList(1,5,2,1,2,6,7,1);
		Set<Integer>set;
		Map<Integer,Set<Integer>> map=new HashMap<>();
		
			int limit=array.length;
			
			for(int i=0;i<limit;i++)
			{
				int k=array[i];			
				set=new TreeSet<>();
	     
				for(int j=0;j<limit;j++)
				{
				if(k==array[j])
				{
					set.add(j);
					map.put(k,set);
				}	
				}			
			}			
			System.out.println("-------------");

			for (Map.Entry<Integer,Set<Integer>> entry : map.entrySet())
		
	       System.out.println( entry.getKey() + "->  "+entry.getValue().size()+ " Times" +
	                             ", Index = " + entry.getValue());            	
			System.out.println("-------------");	
		}			
	}





//Map<Integer,Set<Integer>> name;
//System.out.println(k+" Index "+aa.toString());
	//System.out.print("Occurrence "+k+"==" +count+"\n");


//
//Iterator<Entry<Integer, Set<Integer>>> iterator = map.entrySet().iterator();
//By using Iterator We can give Condition.		
//while (iterator.hasNext()) {
//    Entry<Integer, Set<Integer>> entry = iterator.next();
//    //int i=entry.getKey();
//    System.out.println(entry.getKey() + ":" + entry.getValue());
//}
	