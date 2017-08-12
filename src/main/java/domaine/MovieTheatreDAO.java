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

import model.MovieTheatre;



public class MovieTheatreDAO {

	
	private static final String ERROR = null;

	public MovieTheatreDAO() throws NamingException, SQLException {
		super();
	}
	
	public ArrayList<MovieTheatre> getAllMovieTheatres() {
		  MovieTheatre	movieTheatre =null;	
		  ArrayList<MovieTheatre> ListMovieTheatre=new ArrayList<MovieTheatre>(); 
		  int id; 
		  String adress;
		  String city;
		  String name;
		  String type;
	      String ret ="edrrrrr";//ERROR;
	        Connection conn = null;

	        try {
	           String URL = "jdbc:mysql://localhost:3306/cinema";
	           Class.forName("com.mysql.jdbc.Driver");
	           conn = DriverManager.getConnection(URL, "root", "root");
	           String sql = "SELECT * FROM movieTheatre";
	           PreparedStatement ps = conn.prepareStatement(sql);
	           ResultSet rs = ps.executeQuery();
	           while (rs.next()) {
	        	   adress=rs.getString("adress");
	        	   city=rs.getString("city");
	        	   id=rs.getInt("id");
	        	   name=rs.getString("name");
	        	   type=rs.getString("type");
	        	   movieTheatre =new MovieTheatre(id,name,adress,city,type);	
	        	   ListMovieTheatre.add(movieTheatre);
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
         
	        return ListMovieTheatre;
	}
}

	
	
	
	
	

