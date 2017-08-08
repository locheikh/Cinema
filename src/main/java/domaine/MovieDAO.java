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



public class MovieDAO extends MyDAO {

	
	private static final String ERROR = null;

	public MovieDAO() throws NamingException, SQLException {
		super();
	}
	
	//public List<Movie> getMoviesByIdGroupe(String idGroupe) {
	//@SuppressWarnings("null")
	public List<String>getMovies(/*String idGroupe*/) {
		 ArrayList<Movie> MovieList = new ArrayList<Movie>();
		 ArrayList<String> titleList = new ArrayList<String>();
	        Movie Movie = null;
	        ResultSet rs = null;
	        int id;
	        String title = null;
	      
	       // String sql = "SELECT Movie.id,Movie.firstname,Movie.lastname,Movie.email FROM `Movie` INNER JOIN `groupeMovie` ON Movie.id = groupeMovie.id_Movie INNER JOIN `groupe`ON groupe.id =groupeMovie.id_group WHERE groupeMovie.id_group="+idGroupe+"";
	        String sql = "SELECT * FROM movie";
	        try {
				final PreparedStatement ps = cnx.prepareStatement(sql);
				rs = ps.executeQuery();
				while (rs.next()){
					//id = Integer.parseInt(rs.getString("id"));
					//title=rs.getString("title");
					System.out.println(rs.next());
					titleList.add(title);
					//Movie = new Movie(id,firstname,lastname,email);
					//System.out.println(Movie);
					//MovieList.add(Movie);
					//System.out.println(title);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
	        
	       // return MovieList;
	        return titleList;
	
	
	
	
	
	
	
	
	}



}

	
	
	
	
	

