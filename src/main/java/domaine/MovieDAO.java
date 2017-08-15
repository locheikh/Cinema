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
//	private Date duration;
//	private String language;
//	private int id;
//	private String mainActors;
//	private int minAge;
//	private String title;
//	private String director; 
//	private Date startingDate; 
//	private Date endDate; 
//	private String subtitles;
	//private String refMovieTheatre;

	public MovieDAO() throws NamingException, SQLException {
		super();
	}
	
//	public Movie getMovie(int id) {              //idMovie Theatre
//		  Movie	movie =new Movie();	
//	      String ret ="edrrrrr";//ERROR;
//	        Connection conn = null;
//	        Date duration;
//            String language;
//            String mainActors;
//            int minAge;
//            String title;
//            String director; 
//            Date startingDate; 
//            Date endDate; 
//            String subtitles;
//            int refMovieTheatre;
//            
//	        try {
//	           String URL = "jdbc:mysql://localhost:3306/cinema";
//	           Class.forName("com.mysql.jdbc.Driver");
//	           conn = DriverManager.getConnection(URL, "root", "root");
//	           String sql = "SELECT * FROM movie WHERE id="+id+"";
//	           PreparedStatement ps = conn.prepareStatement(sql);
//	           ResultSet rs = ps.executeQuery();
//	           while (rs.next()) {
//	        	   duration=rs.getTime("duration");
//	        	   language=rs.getString("language");
//	        	   mainActors=rs.getString("mainActors");
//	        	   minAge=rs.getInt("minAge");
//	        	   subtitles=rs.getString("subtitles");
//	        	   title=rs.getString("title");
//                   director=rs.getString("director");
//	        	   startingDate=rs.getTimestamp("startingDate");
//	        	   endDate=rs.getTimestamp("endDate");
//	        	   movie=new Movie(id, title, duration,language,subtitles,mainActors,minAge,
//	              			director,startingDate,endDate); 
//	           }
//	        } catch (Exception e) {
//	        	System.out.println("ERROR");
//	        } finally {
//	           if (conn != null) {
//	              try {
//	                 conn.close();
//	              } catch (Exception e) {
//	              }
//	           }
//	        } 
//	        System.out.println("movie");
//	        return movie;
//	}

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
               String director; 
               Date startingDate; 
               Date endDate; 
               String subtitles;
             
	        try {
	        	String URL = "jdbc:mysql://localhost:3306/cinema";
		           Class.forName("com.mysql.jdbc.Driver");
		           conn = DriverManager.getConnection(URL, "root", "root");
		           String sql = "SELECT * FROM movie WHERE refMovieTheatre="+refMovieTheatre+"";
		           PreparedStatement ps = conn.prepareStatement(sql);
		           ResultSet rs = ps.executeQuery();
	           while (rs.next()) {

       	           duration=rs.getTimestamp("duration");
       	           id=rs.getInt("id");
	        	   language=rs.getString("language");
	        	   mainActors=rs.getString("mainActors");
             	   minAge=rs.getInt("minAge");
          	       subtitles=rs.getString("subtitles");
	        	   title=rs.getString("title");
                   director=rs.getString("director");
	        	   startingDate=rs.getTimestamp("startingDate");
	        	   endDate=rs.getTimestamp("endDate");
                       movie=new Movie(id, title, duration,language,subtitles,mainActors,minAge,
       			director,startingDate,endDate); 	        	  
       	           movie.setDuration(duration);
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
	        System.out.println("movie");
	        return listMovie;
	}
	
	public Movie getMovie(int  refMovieTheatre) {
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
              String director; 
              Date startingDate; 
              Date endDate; 
              String subtitles;
            
	        try {
	        	String URL = "jdbc:mysql://localhost:3306/cinema";
		           Class.forName("com.mysql.jdbc.Driver");
		           conn = DriverManager.getConnection(URL, "root", "root");
		           String sql = "SELECT * FROM movie WHERE id="+refMovieTheatre+"";
		           PreparedStatement ps = conn.prepareStatement(sql);
		           ResultSet rs = ps.executeQuery();
	           while (rs.next()) {

      	           duration=rs.getTimestamp("duration");
      	           id=rs.getInt("id");
	        	   language=rs.getString("language");
	        	   mainActors=rs.getString("mainActors");
            	   minAge=rs.getInt("minAge");
         	       subtitles=rs.getString("subtitles");
	        	   title=rs.getString("title");
                  director=rs.getString("director");
	        	   startingDate=rs.getTimestamp("startingDate");
	        	   endDate=rs.getTimestamp("endDate");
                      movie=new Movie(id, title, duration,language,subtitles,mainActors,minAge,
      			director,startingDate,endDate); 	        	  
      	           movie.setDuration(duration);
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
	        System.out.println("test1");
	        System.out.println("test2");
	        return movie;
	}
	
	
	 public String addMovie(Date duration,String language,String mainActors,int minAge,String title,String director, 
Date startingDate, Date endDate, String subtitles,String refMovieTheatre) {
	      String ret = ERROR;
	      Connection conn = null;
	      System.out.println("addmovie");
	      try {
	    	  String URL = "jdbc:mysql://localhost:3306/cinema";
	           Class.forName("com.mysql.jdbc.Driver");
	           conn = DriverManager.getConnection(URL, "root", "root");
	         String sql = "insert into movie (title,duration,language,director,mainActors,minAge,startingDate,endDate,idSession,subtitles,refMovieTheatre) VALUES values(?,?,?,?,?,?,?,?,?,?)";
	         
	         //sql+=" user = ? AND password = ?";
	         PreparedStatement ps = conn.prepareStatement(sql);
	         ps.setDate(2,(java.sql.Date) duration);
	         ps.setString(3, language);
	         ps.setString(5, mainActors);
	         ps.setInt(4,minAge);
	         ps.setString(5,title);
	         ps.setString(4,director);
	         ps.setDate(7,(java.sql.Date) startingDate);
	         ps.setDate(8,(java.sql.Date) endDate);
	         ps.setString(9,subtitles);
	         ps.setString(10,refMovieTheatre);
	         System.out.println(ps);
	         ResultSet rs = ps.executeQuery();
	         System.out.println("addmoviebb");
	         while (rs.next()) {
	        	 System.out.println("addmovieinb");
//	            String name = 
	        	 rs.getString(1);
	            //ret = SUCCESS;
	         }
	         System.out.println("addmovieab");
	      } catch (Exception e) {
	         ret = ERROR;
	      } finally {
	         if (conn != null) {
	            try {
	               conn.close();
	            } catch (Exception e) {
	            }
	         }
	      }
	      System.out.println("addmoviefinb");
	      return ret;
	   }

	
	
	
	
	
	
	
	
	
	
	
	
}



	
	
	
	
	

