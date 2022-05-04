package com.training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con;
		
		try {
	con=DriverManager.getConnection("jdbc:oracle:thin:@10.90.1.105:1521/DEV","HR","HR");
			System.out.println(con);
			
			StreamService service=new StreamService(con);
			//SourceApp app=new SourceApp("kawin","rishh",997897);
			System.out.println(service.data());
			List<SourceApp>source=service.data();
			source.forEach(System.out::println);
			service.findByPlace("usa",source);
			service.findPopulation("usa", source);
			service.findCity("usa", source);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
