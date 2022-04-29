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
    
    public ProductService(Connection con) {
		super();
		this.con = con;
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

     public void usingTxn(Product prd1,Product prd2)
     {
    	 String sql="insert into kawins_product values(?,?,?)";
    	 
         try(PreparedStatement pstmt=con.prepareStatement(sql))
    	 {
			con.setAutoCommit(false);
    		pstmt.setInt(1, prd1.getProductId());
    		pstmt.setString(2,prd1.getProductName());
    		pstmt.setDouble(3,prd1.getPrice());
    		
    		int rowAdded=pstmt.executeUpdate();
    		
    		pstmt.setInt(1, prd2.getProductId());
    		pstmt.setString(2,prd2.getProductName());
    		pstmt.setDouble(3,prd2.getPrice());  
    		
    		int rowAdded1=pstmt.executeUpdate();

            if(prd2.getPrice()>prd1.getPrice())
            {
    		con.commit();
            }
            else {
            	con.rollback();
            }
    		//int rowAdded=pstmt.executeUpdate();
    		System.out.println("Row Added:="+ rowAdded);			
		} 
         catch(SQLException e) 
         {
		
			e.printStackTrace();
		}
     }
     
     public void usingTnxWithCatchBlock(Product prd1,Inovoice prd2)
     {
    	 String prodsql="insert into kawins_product values(?,?,?)";
    	 String invoicesql="insert into kaiwn_invoice values(?,?,?,?)";

    	 
         try(PreparedStatement prodstmt=con.prepareStatement(prodsql);
         PreparedStatement invoicestmt=con.prepareStatement(invoicesql))
    	 {
			con.setAutoCommit(false);
    		prodstmt.setInt(1, prd1.getProductId());
    		prodstmt.setString(2,prd1.getProductName());
    		prodstmt.setDouble(3,prd1.getPrice());
    		
    		int rowAdded=prodstmt.executeUpdate();
    		
    	invoicestmt.setInt(1, prd2.getInvoiceNumber());
    invoicestmt.setString(2,prd2.getCustomerName());
    	invoicestmt.setInt(3,prd2.getQuantity());  
    	invoicestmt.setInt(4, prd2.getProductRef());
    		
    		int rowAdded1=invoicestmt.executeUpdate();

            con.commit();
    		//System.out.println("Row Added:="+ rowAdded);			
		} 
         
    catch(SQLException e) 
         {
			e.printStackTrace();
        	try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
         }	 
    	 
     }
}
