package com.example.demo;
import java.sql.*;
import java.util.Optional;

import com.example.demo.services.ProductService;
import com.example.entity.Product;

public class Application {

	public static void main(String[] args) {
		Connection con = null;
		ProductService ser=new ProductService();
		
		try {
			
		 con=DriverManager.getConnection("jdbc:oracle:thin:@10.90.1.105:1521/DEV","HR","HR");
		System.out.println(con);
		ser.getConnection(con);
		ser.findAll().forEach(System.out::println);
	       
        Product prod=new Product(651,"Eps",5002.0);
      //  int added=ser.addProduct(prod);
        System.out.println("*********************");

		System.out.println(ser.deleteById(651));
		
	       System.out.println("*********************");
          Optional<Product>cut=ser.findById(11);
          if(cut.isPresent()) 
               {  	  
               System.out.println(cut.get());
                    }
          else 
          {
        	  System.out.println("product with given id is not present");
          }
       System.out.println("*********************");
       
       System.out.println(ser.updateById(101,"Kaiwn"));
 
         //System.out.println(added);
		
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
