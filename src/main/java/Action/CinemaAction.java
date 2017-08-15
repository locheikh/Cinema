package Action;

import java.util.ArrayList;
import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

import model.Movie;
import model.MovieTheatre;
import model.Session;
import service.MovieService;
import service.MovieTheatreService;
import service.SessionService;

public class CinemaAction extends ActionSupport {

	public ArrayList<MovieTheatre> movieTheatres=null;
	public ArrayList<Session> sessions=null;
	public Movie movie=null;
	public ArrayList<Movie>movies=null;//new ArrayList<Movie>(); 
	public int refMovieTheatre;
	public int idMovie;
	public String message;

	
	public String getAllMovieTheatres() {
		MovieTheatreService movieTheatreService=new MovieTheatreService(); 
		movieTheatres=movieTheatreService.getAllMovieTheatres();
		return SUCCESS;
    }
	
	public String movieSessions() {
		SessionService sessionService=new SessionService(); 
		sessions=sessionService.getSessions(4);
		return SUCCESS;
    }
	
	public String getMovie() {
		MovieService movieService=new MovieService(); 
		//System.out.println(id);
		movie=movieService.getMovie(idMovie);  
//		System.out.println(movie);
		return SUCCESS;
    }
	public String getAllMovie() {
		MovieService movieService=new MovieService(); 
		movies=movieService.getAllMovie(refMovieTheatre);
		//movie=movies.get(refMovieTheatre);  
	
		return SUCCESS;
    }
	
	public String addMovie() {
		Date duration =null;String language ="ffrrr";String mainActors ="will";int minAge = 0;String title = "testtttt";String director ="cheikh"; 
		Date startingDate = null; Date endDate =null ; String subtitles = "fr";String refMovieTheatre = "1";
		
		
		MovieService movieService=new MovieService(); 
		movieService.addMovie(duration,language,mainActors,minAge,title,director, 
				startingDate,endDate,subtitles,refMovieTheatre);
		//movie=movies.get(refMovieTheatre);  
		return SUCCESS;
    }
	
	
	
	
	
	
	
	
	
	
	
}
