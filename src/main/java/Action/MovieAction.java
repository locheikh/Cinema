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
     
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Movie movieBean;
	private String message;
	public String title;
	public  ArrayList<String> titleList=new  ArrayList<String>();
	MovieService movieService=new MovieService(); 
	public String execute() {
      
    	
        //System.out.println(titleList);
    	 
        //System.out.println("Title: " + movieBean.getTitle());
        //System.out.println("Duration: " + movieBean.getDuration());
        //System.out.println(titleList);
        // add your login procedure here...
		titleList=movieService.getMovies();
		//System.out.println(movieService.getMovies());
    	//message="test";
        //message=titleList.get(0);
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