package Action;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import model.Movie;
import service.MovieService;
 
public class MovieAction extends ActionSupport {
     
	private static final long serialVersionUID = 1L;
	private Movie movieBean;
	private String message;
	public String title;
	public int refMovieTheatre;
	public int id;
	public  Movie movie=null;
	public ArrayList<Movie>movies=new ArrayList<Movie>(); 
	MovieService movieService=new MovieService(); 
	
	/*public String execute() {
		movie=movieService.getMovies(4);        
		return SUCCESS;
    }*/
	
	public String getMovie() {
		System.out.println(id);
		movie=movieService.getMovie(id);  
		System.out.println(movie);
		return SUCCESS;
    }
	public String getAllMovie() {
		
		movies=movieService.getAllMovie(refMovieTheatre);
		//movie=movies.get(refMovieTheatre);  
		return SUCCESS;
    }
 
    public Movie getmovieBean() {
        return movieBean;
    }
 
    public void setmovieBean(Movie movieBean) {
        this.movieBean = movieBean;
    }

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}