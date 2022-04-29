package com.example.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.example.dao.Customer;
import com.example.dao.LoanApplication;
import com.example.ifaces.Repositiory;

public class Service implements Repositiory<LoanApplication> {
	
     Connection con;
     
	public Service(Connection con)
	{
	super();
	this.con = con;
       }

	public List<LoanApplication> findAll() {
		// TODO Auto-generated method stub
		List<LoanApplication>loan=new ArrayList<LoanApplication>();
		String sql="select * from kawin_loan_application l left outer join kawins_customer c on c.customer_id=l.customer_ref";
        try(PreparedStatement pstmt=con.prepareStatement(sql))
        {
        	ResultSet rs=pstmt.executeQuery();
        	while(rs.next())
        	{
        	int applicationNo=rs.getInt("application_no");
        	int customerRef=rs.getInt("customer_ref");
        	int loanAmount=rs.getInt("loan_amount");
        	int customerId=rs.getInt("customer_id");
        	String customerName=rs.getString("customer_name");
        	long phoneNumber=rs.getLong("phone_number");
        	int creditScore=rs.getInt("credit_score");
        		
        	Customer cus=new Customer(customerId, customerName, phoneNumber, creditScore);	
        	LoanApplication loanapp=new LoanApplication(applicationNo, cus, loanAmount);
        	loan.add(loanapp);	
        	}
        	
        }catch(SQLException e)
        {
        	e.printStackTrace();
        }
			
		return loan;
	}

	public int remove(int id) {
		// TODO Auto-generated method stub
		int removed=0;
	String sql="delete from kawin_loan_application where application_no=?";
        try(PreparedStatement pstmt=con.prepareStatement(sql))
        {
        	pstmt.setInt(1,id);
        	removed=pstmt.executeUpdate();
        	
        	   	
        }catch(SQLException e)
        {
        	e.printStackTrace();
        }

		return removed;
	
	}

	public LoanApplication findById(int id) {
		
		LoanApplication loanapp=null;
	String sql="select * from kawin_loan_application l left outer join kawins_customer c on c.customer_id=l.customer_ref where c.customer_id=?";
        try(PreparedStatement pstmt=con.prepareStatement(sql))
        {
        	pstmt.setInt(1,id);
        	ResultSet rs=pstmt.executeQuery();
        	if(rs.next())
        	{
        		int applicationNo=rs.getInt("application_no");
            	int customerRef=rs.getInt("customer_ref");
            	int loanAmount=rs.getInt("loan_amount");
            	int customerId=rs.getInt("customer_id");
            	String customerName=rs.getString("customer_name");
            	long phoneNumber=rs.getLong("phone_number");
            	int creditScore=rs.getInt("credit_score");
            	
      	Customer cus=new Customer(customerId, customerName, phoneNumber, creditScore);	
      	 loanapp=new LoanApplication(applicationNo, cus, loanAmount);
            	
        	}
    	
        }catch(SQLException e)
        {
        	e.printStackTrace();
        }

		return loanapp;
	}

	@Override
	public int add(LoanApplication obj) {
		// TODO Auto-generated method stub
		int added=0;
		String sqlLoan="insert into kawin_loan_application values(?,?,?)";
		String sqlCustomer="insert into kawins_customer values(?,?,?,?)";
		Customer cus=obj.getCustomer();
		
        try(PreparedStatement pstmt1=con.prepareStatement(sqlCustomer);
        		PreparedStatement pstmt2=con.prepareStatement(sqlLoan))
        {
        	pstmt1.setInt(1,cus.getCustomerId());
        	pstmt1.setString(2,cus.getCustomerName());
        	pstmt1.setLong(3,cus.getPhoneNumber());
        	pstmt1.setDouble(4,cus.getCreditScore());

        	added=pstmt1.executeUpdate();
   	
        	pstmt2.setInt(1, obj.getApplicationNumber());
        	pstmt2.setInt(2, cus.getCustomerId());
        	pstmt2.setDouble(3, obj.getLoanAmount());
        	
        	added=added+pstmt2.executeUpdate();
        }
        catch(SQLException e)
        {
        	e.printStackTrace();
        }

		return added;
	}

	@Override
	public int update(int id, LoanApplication Customer) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
