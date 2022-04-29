package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.example.dao.Customer;
import com.example.dao.LoanApplication;
import com.example.service.Service;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		try {
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@10.90.1.105:1521/DEV"
					,"HR","HR");
	Customer cus=new Customer(110,"Rishi",98786,676.0);
	LoanApplication loan=new LoanApplication(7,cus,7657);
			//System.out.println(con);
			Service service=new Service(con);
			//System.out.println(service.remove(3));
			service.findAll().forEach(System.out::println);
			//System.out.println(service.findById(105));
			System.out.println("Rows Added:"+service.add(loan));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
;

    }
}
