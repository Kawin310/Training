package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.example.dao.MemberRepositiory;
import com.example.demo.services.Inovoice;
import com.example.demo.services.ProductService;
import com.example.entity.Product;
import com.example.util.ConnectionFactory;

public class App 
{
	public static void member()
	{
			
		Connection con;
//	    //DriverManager.getConnection("jdbc:oracle:thin:@10.90.1.105:1521/DEV","HR","HR");
	try {
	 //con=ConnectionFactory.getOracleConnection();
	   con=ConnectionFactory.getPostGressConnection();
	 System.out.println(con);
	   }
	
	catch(Exception e)
	{
	e.printStackTrace();
	}
	////   MemberRepositiory rep=new MemberRepositiory(con);
	////   System.out.println(con);
////	                        //rep.findAll().forEach(System.out::println);
////	                        //System.out.println(rep.remove(5));
	////   
	////   System.out.println(rep.findById(1));
////	     
	//}
		
	}
	public static void product()
	{
		Connection con=ConnectionFactory.getPostGressConnection();
		ProductService service=new ProductService(con);
		Product toadd=new Product(9494,"ups",1740.00);
		service.findAll().forEach(System.out::println);
		//int rowAdded=service.addProduct(toadd);
		//System.out.println("Row Added:"+rowAdded);
		
	}
public static void main( String[] args )
   
{
   Connection con;
//    //DriverManager.getConnection("jdbc:oracle:thin:@10.90.1.105:1521/DEV","HR","HR");
//try {
       con=ConnectionFactory.getOracleConnection();
    // con=ConnectionFactory.getPostGressConnection();
//   System.out.println(con);
//   }
//
//catch(Exception e)
//{
//	e.printStackTrace();
//}
////   MemberRepositiory rep=new MemberRepositiory(con);
////   System.out.println(con);
////                        //rep.findAll().forEach(System.out::println);
////                        //System.out.println(rep.remove(5));
////   
//   System.out.println(rep.findById(1));
////     
//}
     ProductService service=new ProductService(con);
     Product product=new Product(869,"kawin",1050);
     Product productNew=new Product(234,"Rishi",101);
     Inovoice invoice=new Inovoice(302,"kawin",767,104);
     //service.usingTxn(product, productNew);
     service.usingTnxWithCatchBlock(product, invoice);

	          //product();
    
}}
