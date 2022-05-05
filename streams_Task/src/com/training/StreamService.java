package com.training;
import static java.util.stream.Collectors.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamService {

	Connection con;
	//List<SourceApp>list=new ArrayList<>();

	public StreamService(Connection con) {
		super();
		this.con = con;
	}
	
	public  List<SourceApp> data()
	{
		//System.out.println(con);
		List<SourceApp>newlist=new ArrayList<>();
		
		String sql="select * from kawins_world";
		
        try(PreparedStatement pstmt=con.prepareStatement(sql))
        {	
     	   ResultSet rs=pstmt.executeQuery();
    	   while(rs.next())
    	   {
    		   
    		   String country=rs.getString("Country");
    		   String place=rs.getString("place");
                long population=rs.getLong("population");
                SourceApp source=new SourceApp(country,place,population);
                newlist.add(source);
              //  System.out.println(newlist);
    	   }
        }
        
        catch(SQLException e)
        {
        	e.printStackTrace();
        }

		return newlist;
	}
	
	public List<String> findByPlace(String country,List<SourceApp>lists)
	{
		List<String>list=new ArrayList<>();
		List<SourceApp>source=lists;
		
		list=source.stream().filter(e-> e.getCountry().equals(country))
				.map((e)->e.getPlace()).collect(toList());
				
						
		return list;
	}
	
	public void findPopulation(String popu,List<SourceApp>lists)
	
	{
		long sum=0;
		List<Long> res=lists.stream().filter(e->e.getCountry().equals(popu))
				.map((e)->e.getPopulation()).collect(toList());
		
				for(long l:res)
				{
					sum+=l;
				}
				
				System.out.println(sum);
	}
	
	public void findCity(String city,List<SourceApp>lists) {
		
//	Map<String,String>map=lists.stream()
//			.map((e)->e.getCountry().equals(city))
//	.collect(toMap(SourceApp::getCountry,SourceApp::getPlace)));
//			map.forEach((key,value)->System.out.println(key+","+value));
		long res=lists.stream().filter(e->e.getCountry().equalsIgnoreCase(city))
				.count();				
		System.out.println(res);
				//.map((e)->e.getPopulation()).collect(toList());

	}

	
}
