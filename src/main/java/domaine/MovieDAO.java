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
	
	public Movie getMovies(int id) {
		  Movie	movie =new Movie();	
	      String ret ="edrrrrr";//ERROR;
	        Connection conn = null;

	        try {
	           String URL = "jdbc:mysql://localhost:3306/cinema";
	           Class.forName("com.mysql.jdbc.Driver");
	           conn = DriverManager.getConnection(URL, "root", "root");
	           String sql = "SELECT * FROM movie WHERE id="+id+"";
	           PreparedStatement ps = conn.prepareStatement(sql);
	           ResultSet rs = ps.executeQuery();
	           while (rs.next()) {
	        	   movie.setDuration(rs.getString("duration"));
	        	   movie.setId(rs.getInt("id"));
	        	   movie.setLanguage(rs.getString("language"));
	        	   movie.setMainActors(rs.getString("mainActors"));
	        	   movie.setMinAge(rs.getInt("minAge"));
	        	   movie.setSubtitles(rs.getString("subtitles"));
	        	   movie.setTitle(rs.getString("title"));
	        	   movie.setIdSessions(rs.getInt("idSessions"));
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
	        return movie;
	}
}

	
	
	
	
	

