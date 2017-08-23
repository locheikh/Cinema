package domaine;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import model.User;

public class UserDAO {
	
	public User getUser(String login,String password) {
		String ret ="error";
	    Connection conn = null;
		User user =null;	
		 int id;
		 String name;
		 String prenom;
		 int proprio;
	        try {
	        	String URL = "jdbc:mysql://localhost:3306/cinema";
		        Class.forName("com.mysql.jdbc.Driver");
		           conn = DriverManager.getConnection(URL, "root", "root");
		           String sql = "SELECT * FROM user WHERE login=? AND password=?";
		           PreparedStatement ps = conn.prepareStatement(sql);
		           ps.setString(1,login);
		           ps.setString(2,password);
		           ResultSet rs = ps.executeQuery();
	           while (rs.next()) {
     	           id=rs.getInt("id");
	        	   name=rs.getString("nom");
	        	   prenom=rs.getString("prenom");
           	       proprio=rs.getInt("proprio");
           	       user=new User(id,name,prenom,login,password,proprio);
	           }
	        } catch (Exception e) {
	        	System.out.println("ERROR");
	        } finally {
	           if (conn != null) {
	              try {
	                 conn.close();
	              } catch (Exception e) {
	              }
	           }
	        } 
	        return user;
	}
	
}
