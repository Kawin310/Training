package com.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.example.entity.Member;
import com.example.ifaces.CrudRepositiory;

public class MemberRepositiory implements CrudRepositiory<Member> {

	private Connection con;
	public MemberRepositiory(Connection con) {
		super();
		this.con = con;
	}

	public int add(Member obj) {
		// TODO Auto-generated method stub
		
		return 0;
	}

	public List<Member> findAll() {
		// TODO Auto-generated method stub
     List<Member>MemberList=new ArrayList<Member>(); 
    	
    	String sql="select * from kawinmembers";
        try(PreparedStatement pstmt=con.prepareStatement(sql))
        {
     	   ResultSet rs=pstmt.executeQuery();
     while(rs.next())
          {
	int memberId=rs.getInt("member_id");
    String memberName=rs.getString("member_name");
    String memberAddress=rs.getString("member_address");
    LocalDate accountOpenDate=(rs.getDate("ACC_OPEN_DATE")).toLocalDate();
    String memberType=rs.getString("members_type");
    double feespaid=rs.getDouble("fees_paid");
    int maxBookType=rs.getInt("max_book_type");
    double penaltyAmount=rs.getDouble("penalty_amount");
    
    Member member=new Member(memberId,memberName,memberAddress,accountOpenDate,memberType,

    		feespaid,maxBookType,penaltyAmount);
    MemberList.add(member);
               }      	
        }
        catch(SQLException e)
        {
	e.printStackTrace();
        }
    	
		return MemberList;       
	}
	
	public Member findById(int id) {

		Member meme=null;
		String sql="select * from kawinmembers where member_id=?";
        try(PreparedStatement pstmt=con.prepareStatement(sql))
        {
        	pstmt.setInt(1,id);

        	ResultSet rs=pstmt.executeQuery();
        	
        	if(rs.next())
        	{
        		int memberId=rs.getInt("member_id");
        	    String memberName=rs.getString("member_name");
        	    String memberAddress=rs.getString("member_address");
        	    LocalDate accountOpenDate=(rs.getDate("ACC_OPEN_DATE")).toLocalDate();
        	    String memberType=rs.getString("members_type");
        	    double feespaid=rs.getDouble("fees_paid");
        	    int maxBookType=rs.getInt("max_book_type");
        	    double penaltyAmount=rs.getDouble("penalty_amount");
        	    meme=new Member(memberId,memberName,memberAddress,accountOpenDate,memberType,
        	    		feespaid,maxBookType,penaltyAmount);


        	}
        	
        }catch(SQLException e)
        {
        	e.printStackTrace();
        }

		return meme;
	}
	
	public int remove(int id) {
		// TODO Auto-generated method stub
		int removed=0;
		String sql="delete from kawinmembers where member_id=?";
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
	
	public int update(int id, Member member) {
		// TODO Auto-generated method stub
		int updated=0;
		String sql="update kawinmembers set memberAddress='?' where memberId=? ";		
		return 0;
	}
}
