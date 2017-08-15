package Action;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import model.MovieTheatre;
import service.MovieTheatreService;
 
public class MovieTheatreAction extends ActionSupport {
     
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private MovieTheatre movieTheatreBean;
	private String message;
	public String title;
	public  ArrayList<MovieTheatre> movieTheatres=new  ArrayList<MovieTheatre>();
	MovieTheatreService movieTheatreService=new MovieTheatreService(); 
	
	public String getAllMovieTheatres() {
		movieTheatres=movieTheatreService.getAllMovieTheatres();
		return SUCCESS;
    }
 
    public MovieTheatre getmovieTheatreBean() {
        return movieTheatreBean;
    }
 
    public void setmovieTheatreBean(MovieTheatre movieTheatreBean) {
        this.movieTheatreBean = movieTheatreBean;
    }

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}