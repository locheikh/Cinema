package domaine;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
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
	
	public Movie getMovies(int id) {              //idMovie Theatre
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
	        	   movie.setDuration(rs.getTime("duration"));
	        	   movie.setId(rs.getInt("id"));
	        	   movie.setLanguage(rs.getString("language"));
	        	   movie.setMainActors(rs.getString("mainActors"));
	        	   movie.setMinAge(rs.getInt("minAge"));
	        	   movie.setSubtitles(rs.getString("subtitles"));
	        	   movie.setTitle(rs.getString("title"));
	        	   movie.setIdSessions(rs.getInt("idSessions"));
                   movie.setDirector(rs.getString("director"));
	        	   movie.setStartingDate(rs.getTimestamp("startingDate"));
	        	   movie.setEndDate(rs.getTimestamp("endDate"));
	        	   movie.setRefMovieTheatre(rs.getInt("refMovieTheatre"));
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

	public ArrayList<Movie> getAllMovie(int  refMovieTheatre) {
		 Movie	movie =null;	
		ArrayList<Movie>listMovie =new ArrayList<Movie>() ;	
	      String ret ="edrrrrr";//ERROR;
	        Connection conn = null;
               Date duration;
               String language;
               int id;
               String mainActors;
               int minAge;
               String title;
               int idSession;
               String director; 
               Date startingDate; 
               Date endDate; 
               String subtitles;
             
	        try {
	        	String URL = "jdbc:mysql://localhost:3306/cinema";
		           Class.forName("com.mysql.jdbc.Driver");
		           conn = DriverManager.getConnection(URL, "root", "root");
		           String sql = "SELECT * FROM movie WHERE id="+1+"";
		           PreparedStatement ps = conn.prepareStatement(sql);
		           ResultSet rs = ps.executeQuery();
		           System.out.println();
	           while (rs.next()) {
	        	   
	        	   duration=rs.getTimestamp("duration");
	        	   id=rs.getInt("id");
	        	   language=rs.getString("language");
	        	   mainActors=rs.getString("mainActors");
	        	   minAge=rs.getInt("minAge");
	        	   subtitles=rs.getString("subtitles");
	        	   title=rs.getString("title");
	        	   idSession=rs.getInt("idSessions");
                   director=rs.getString("director");
	        	   startingDate=rs.getTimestamp("startingDate");
	        	   endDate=rs.getTimestamp("endDate");
	        	   movie=new Movie(id, title, duration,language,subtitles,mainActors,minAge,
	        				idSession, director,startingDate,endDate); 
	        	   System.out.println(movie);
	        	   listMovie.add(movie);
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
	        System.out.println(listMovie);
	        return listMovie;
	}
}

	
	
	
	
	

