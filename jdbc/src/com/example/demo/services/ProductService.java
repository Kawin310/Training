package com.example.demo.services;
import java.sql.*;
import java.util.*;
import com.example.entity.*;

import oracle.jdbc.proxy.annotation.Pre;

public class ProductService {

           Connection con;
           
    public void getConnection(Connection con)
           {
        	   
			 this.con=con;   
               }
    
    public int updateById(int id,String name)
    {
    	int updated=0;
    	String sql="update  kawins_product set product_name=? where product_id=?";
        try(PreparedStatement pstmt=con.prepareStatement(sql)){
        pstmt.setString(1,name);
        pstmt.setInt(2,id);

        	updated=pstmt.executeUpdate();
        	
        }catch(SQLException e)
        {
        	e.printStackTrace();
        }
       	
		return updated;
     	
    }
    
    
     
       public int deleteById(int id)
       {
    	 int rowsDeleted=0;
      String sql="delete from kawins_product where product_id=?";   
      try(PreparedStatement pstmt=con.prepareStatement(sql)){
          pstmt.setInt(1, id);
          
           rowsDeleted=pstmt.executeUpdate();
      
      
      }catch(SQLException e)
      {
    	  e.printStackTrace();
      }
      
    	   
		return rowsDeleted;
    	      
       }
       public Optional<Product> findById(int id)
       {
    	  Optional< Product >obj=Optional.empty();
    	   String sql="select * from kawins_product where product_id=?";
    	   try(PreparedStatement pstmt=con.prepareStatement(sql))
    	    {	
    	    	pstmt.setInt(1,id);
         	   ResultSet rs=pstmt.executeQuery();
                if(rs.next())
                {
                	int productId=rs.getInt("product_id");
                	String productName=rs.getString("product_name");
         		   double price=rs.getInt("price");
         		   Product prod=new Product(productId,productName,price);
         		  obj=Optional.of(prod);
         			 }
    	    }catch(SQLException e)
    	    {
    	    	
    	    	e.printStackTrace();
    	    }
		   return obj;
    	   
       }
       
       
   public int addProduct(Product product)
           {
	   
        	int rowAdded=0;
       String sql="insert into kawins_product values(?,?,?)";
      try(PreparedStatement pstmt=con.prepareStatement(sql)){
            	   
            pstmt.setInt(1, product.getProductId());
            pstmt.setString(2, product.getProductName());
            pstmt.setDouble(3, product.getPrice());
             
            rowAdded=pstmt.executeUpdate(); 	   
               }
      catch(SQLException e)
               {
            	   e.printStackTrace();
               }
   
			return rowAdded;
        	   
           }
                
     public List<Product>findAll()
     {
    	List<Product>productList=new ArrayList<Product>(); 
    	
    	String sql="select * from kawins_product";
           try(	PreparedStatement pstmt=con.prepareStatement(sql))
           {
        	   ResultSet rs=pstmt.executeQuery();
        	   
        	   while(rs.next())
        	   {
        		   int productId=rs.getInt("product_id");
        		   String productName=rs.getString("product_name");
        		   double price=rs.getInt("price");
        		   Product prod=new Product(productId,productName,price);
        		   productList.add(prod);
        	   }
        	 }
           
	catch(SQLException e)
           
           {
		      e.printStackTrace();
           }       
  		return productList;
     }
}
