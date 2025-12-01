package Model;

import java.beans.beancontext.BeanContext;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao {
 
	String url="jdbc:mysql://localhost:3306/sumit",user="root",pass="root";
	
	Connection con;
	PreparedStatement ps;
	
	
	public LoginDao() throws ClassNotFoundException,SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		con=DriverManager.getConnection(url,user,pass);
		
	}
	
	public  boolean validate(Login bean) throws SQLException{
		String q ="select *from login where uname=? AND pass=?";
		
		ps=con.prepareStatement(q);
		
		ps.setString(1,bean.getUname());
		ps.setString(2,bean.getPass());
		
	   ResultSet rs =ps.executeQuery();
	   
	   if(rs.next()) {
		   return true;
	   }else {
		   return false;
	   }
		
	} 
	
	public boolean createuser(Login bean)throws SQLException{
		
		String q ="insert into login values(?,?)";
		
		ps=con.prepareStatement(q);
		ps.setString(1,bean.getUname());
		ps.setString(2,bean.getPass());
		
		int r = ps.executeUpdate();
		if(r>0) {
			return true;
		}else {
			return false;
		}
	}
	
	
}
