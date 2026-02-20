package com.univ.DAO;

import java.sql.*;
import java.io.*;
import java.util.*;

import com.univ.DB.DBConnection;
import com.univ.DTO.CustomerDTO;

public class CustomerDAO {
	public int insert(CustomerDTO dto)
	{
		int x=0;
		try {
		Connection con1=DBConnection.getConn();	
		PreparedStatement ps=con1.prepareStatement("insert into customer(cname,cadd,email,mob,username,pw) value(?,?,?,?,?,?)");	
		   ps.setString(1,dto.getCname());
		   ps.setString(2,dto.getCadd());
		   ps.setString(3,dto.getEmail());
		   ps.setLong(4,dto.getMob());
		   ps.setString(5,dto.getUnm());
		   ps.setString(6,dto.getPw());
		   x=ps.executeUpdate();
		}catch(Exception tt)
		{System.out.println(tt);}
		return x;
        
	}
	public List checkLogin(String unm,String pw)
	{
		List lst=new ArrayList();
		try {
			Connection con1=DBConnection.getConn();
			PreparedStatement ps=con1.prepareStatement("select * from customer where username=? AND pw=?");
			ps.setString(1,unm);
			ps.setString(2,pw);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				lst.add(rs.getInt(1));
				lst.add(rs.getString(2));
				lst.add(rs.getString(3));
				lst.add(rs.getString(4));
				lst.add(rs.getLong(5));
				lst.add(rs.getString(6));
				lst.add(rs.getString(7));
			}
		}catch(Exception tt)
		{System.out.println(tt);}
		return lst;
	}
	public int uploadFile(String fnm,String price,String type,InputStream in)
	{
		int x=0;
		int price1=Integer.parseInt(price);
		try {
			Connection con1=DBConnection.getConn();
		   PreparedStatement ps=con1.prepareStatement
			("insert into imagedata(imagenm,price,type) values(?,?,?)");
		  ps.setString(1, fnm);
		  ps.setInt(2, price1);
		  ps.setString(3, type);
		 x= ps.executeUpdate();
		 if(x==1)
		 {
	    String path="C:\\Users\\mihir\\eclipse-workspace\\Organic_farm\\src\\main\\webapp\\assets\\img\\"+fnm;
	    FileOutputStream fos=new FileOutputStream(path);
	     byte bt[]= in.readAllBytes();
		 fos.write(bt);
		 fos.close();
		 }

		}catch(Exception tt)
		{System.out.println(tt);}
		return x;
	}//upload

	public List<Vector> getCustData()
	{
	  List<Vector> lst4=new ArrayList<Vector>();
	  try {
	  Connection con3=DBConnection.getConn();
	  Statement stmt=   con3.createStatement();
	  ResultSet rs=	 stmt.executeQuery("select * from customer"); 
	  while(rs.next())
	  {
	   Vector v1=new Vector();
	   v1.add(rs.getInt(1));
	   v1.add(rs.getString(2));
	   v1.add(rs.getString(3));
	   v1.add(rs.getString(4));
	   v1.add(rs.getLong(5));
	   v1.add(rs.getString(6));
	   v1.add(rs.getString(7));
	   v1.add(rs.getString(8));
	   lst4.add(v1);
	  }
	  
	  }catch(Exception tt)
	  {System.out.println(tt);}
	  return lst4;
	}
}
