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

import model.Movie;
import model.MovieAll;
import model.MovieTheatre;



public class MovieDAO {

	
	private static final String ERROR = null;
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
       			director,startingDate,endDate,refMovieTheatre);
                   
                   
       	           //movie.setDuration(duration);
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
	        return listMovie;
	}
	
	public Movie getMovie(int  idMovie) {
		 Movie	movie =null;	
		//ArrayList<Movie>listMovie =new ArrayList<Movie>() ;	
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
              int refMovieTheatre;
            
	        try {
	        	String URL = "jdbc:mysql://localhost:3306/cinema";
		           Class.forName("com.mysql.jdbc.Driver");
		           conn = DriverManager.getConnection(URL, "root", "root");
		           String sql = "SELECT * FROM movie WHERE id="+idMovie+"";
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
	        	   refMovieTheatre=rs.getInt("refMovieTheatre");
                   movie=new Movie(id, title, duration,language,subtitles,mainActors,minAge,
      			director,startingDate,endDate,refMovieTheatre); 	        	  
      	           //movie.setDuration(duration);
	        	   //listMovie.add(movie);
	        	   
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
	
	
	 public String addMovie(Date duration,String language,String mainActors,int minAge,String title,String director, 
Date startingDate, Date endDate, String subtitles,int refMovieTheatre) {
	      String ret = ERROR;
	      Connection conn = null;
	      int id=0;
	      
	      try {
	    	  String URL = "jdbc:mysql://localhost:3306/cinema";
	           Class.forName("com.mysql.jdbc.Driver");
	           conn = DriverManager.getConnection(URL, "root", "root");
	         String sql = "insert into movie(title,duration,language,director,mainActors,minAge,startingDate,endDate,subtitles,refMovieTheatre) values (?,?,?,?,?,?,?,?,?,?)";
	         
	         //sql+=" user = ? AND password = ?";
	         PreparedStatement ps = conn.prepareStatement(sql);
	         
	         Timestamp ts_now = new Timestamp(duration.getTime()); 
	         ps.setTimestamp(2,ts_now );
	         ps.setString(3, language);
	         ps.setString(5, mainActors);
	         ps.setInt(6,minAge);
	         ps.setString(1,title);
	         ps.setString(4,director);
	         java.sql.Date sqlstartingDate = new java.sql.Date(startingDate.getTime());
	         ps.setDate(7,sqlstartingDate);
	         java.sql.Date sqlendDate = new java.sql.Date(endDate.getTime());
	         ps.setDate(8,sqlendDate);
	         ps.setString(9,subtitles);
	         ps.setInt(10,refMovieTheatre);

	         
	         int affectedRows = ps.executeUpdate();

				if (affectedRows == 0) {
				    throw new SQLException("Creating user failed, no rows affected.");
				}
				try (ResultSet rs = ps.getGeneratedKeys()) {
				    if (rs.next()) {
				        id = rs.getInt(1);
				        System.out.println("DAO.addAddress() - id returned: " + id);
				    }
				    else {
				        throw new SQLException("Creating user failed, no ID obtained.");
				    }
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//finally{
//				//return id;
//			}
           catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


	      return ret;
	   }

	public void deleteMovie(int idMovie){
		// TODO Auto-generated method stub
		
String sql = "DELETE FROM movie WHERE id = ?";
             String ret = ERROR;
              Connection conn = null;
		try {
			String URL = "jdbc:mysql://localhost:3306/cinema";
	        Class.forName("com.mysql.jdbc.Driver");
	        conn = DriverManager.getConnection(URL, "root", "root");
			final PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, idMovie);
			ps.executeUpdate();		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	public void updateMovie(int idMovie, Date duration, String language, String mainActors, int minAge, String title,
			String director, Date startingDate, Date endDate, String subtitles, int refMovieTheatre) {
		// TODO Auto-generated method stub
		
		String sql = "UPDATE movie SET title=?,duration=?,language=?,director=?,mainActors=?,minAge=?,startingDate=?,endDate=?,subtitles=?,refMovieTheatre=? WHERE id="+idMovie+"";
        String ret = ERROR;
         Connection conn = null;
         try {  
        	 String URL = "jdbc:mysql://localhost:3306/cinema";
        	 Class.forName("com.mysql.jdbc.Driver");
        	 conn = DriverManager.getConnection(URL, "root", "root");
        	 final PreparedStatement ps = conn.prepareStatement(sql);
        	 Timestamp ts_now = new Timestamp(duration.getTime()); 
	         ps.setTimestamp(2,ts_now );
        	 ps.setString(3, language);
	         ps.setString(5, mainActors);
	         ps.setInt(6,minAge);
	         ps.setString(1,title);
	         ps.setString(4,director);
	         java.sql.Date sqlstartingDate = new java.sql.Date(startingDate.getTime());
	         ps.setDate(7,sqlstartingDate);
	         java.sql.Date sqlendDate = new java.sql.Date(endDate.getTime());
	         ps.setDate(8,sqlendDate);
	         ps.setString(9,subtitles);
	         ps.setInt(10,refMovieTheatre);
        	 ps.executeUpdate();		
	           System.out.println(ps);
         } catch (SQLException e) {
		// TODO Auto-generated catch block
        	 e.printStackTrace();
         } catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
        	 e.printStackTrace();
         }
	}

	public ArrayList<MovieAll> getAll() {
		// TODO Auto-generated method stub
		 MovieAll	movie =null;	
			ArrayList<MovieAll>listMovie =new ArrayList<MovieAll>() ;	
		      String ret ="error";//ERROR;
		        Connection conn = null;
	               String language;
	               int id;	  
	               String adress;
	     		   String city;
	    		   String name;
	    		   String type;
	    		   int refProprio;
	               String title;
	               int refMovieTheatre;
	               
	             
		        try {
		        	String URL = "jdbc:mysql://localhost:3306/cinema";
			           Class.forName("com.mysql.jdbc.Driver");
			           conn = DriverManager.getConnection(URL, "root", "root");
			           String sql = "SELECT movie.id,movie.title,movie.language,movie.refMovieTheatre,movieTheatre.name,movieTheatre.adress,movieTheatre.city,movieTheatre.type,movieTheatre.refProprio FROM `movie` INNER JOIN `movieTheatre` ON movieTheatre.id = movie.refMovieTheatre ORDER BY movieTheatre.city"; 
			           PreparedStatement ps = conn.prepareStatement(sql);
			    
			           ResultSet rs = ps.executeQuery();
			           //System.out.println(ps);
		           while (rs.next()) {
		        	   
		        	   refProprio=rs.getInt("movieTheatre.refProprio");
	       	           id=rs.getInt("movie.id");
		        	   title=rs.getString("movie.title");
		        	   language=rs.getString("movie.language");
		        	   adress=rs.getString("movieTheatre.adress");
		        	   city=rs.getString("movieTheatre.city");
		        	   name=rs.getString("movieTheatre.name");
		        	   type=rs.getString("movieTheatre.type");
		        	   refMovieTheatre=rs.getInt("movie.refMovieTheatre");
		        	   movie =new MovieAll( language,id, adress, city, name, type,refProprio,title,refMovieTheatre);
		        	   listMovie.add(movie);
		        	   //System.out.println(movie);
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
		        return listMovie;	

	}

	

}



	
	
	
	
	

