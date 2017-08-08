package domaine;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import model.Movie;



public class MovieDAO {

	
	private static final String ERROR = null;

	public MovieDAO() throws NamingException, SQLException {
		super();
	}
	
	//public List<Movie> getMoviesByIdGroupe(String idGroupe) {
	//@SuppressWarnings("null")
	public ArrayList<String>getMovies(/*String idGroupe*/) {
	      ArrayList<String> titleList=new  ArrayList<String>();
		  String title ;
	    	
	    	String ret ="edrrrrr";//ERROR;
	        Connection conn = null;

	        
	        try {
	           String URL = "jdbc:mysql://localhost:3306/cinema";
	           Class.forName("com.mysql.jdbc.Driver");
	           conn = DriverManager.getConnection(URL, "root", "root");
	           String sql = "SELECT * FROM movie";
	           PreparedStatement ps = conn.prepareStatement(sql);
	           ResultSet rs = ps.executeQuery();
	           while (rs.next()) {
	        	 title = rs.getString("title");
	    			//System.out.println(title);
	    			titleList.add(title);
	           }
	        } catch (Exception e) {
	        	System.out.println("ERROR");
	           //ret;
	        } finally {
	           if (conn != null) {
	              try {
	                 conn.close();
	              } catch (Exception e) {
	              }
	           }
	        } 
	        //System.out.println("domaine:"+titleList);
	        return titleList;
	
	}



}

	
	
	
	
	

