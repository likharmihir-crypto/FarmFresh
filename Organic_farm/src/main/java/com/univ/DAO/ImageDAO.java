package com.univ.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.List;
import java.util.*;
import java.sql.*;

import com.univ.DB.DBConnection;

public class ImageDAO {
	 public List<Vector> getImageData() {
	        List<Vector> lst = new ArrayList();

	        try {
	            Connection con1 = DBConnection.getConn();
	            Statement stmt = con1.createStatement();
	            ResultSet rs = stmt.executeQuery("select * from imagedata where status=0");

	            while(rs.next()) {
	                Vector v1 = new Vector();
	                v1.add(rs.getInt(1));
	                v1.add(rs.getString(2));
	                v1.add(rs.getInt(3));
	                v1.add(rs.getString(4));
	                lst.add(v1);
	            }
	        } catch (Exception tt) {
	            System.out.println(tt);
	        }

	        return lst;
	    }
}
