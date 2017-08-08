package example;

import com.opensymphony.xwork2.ActionSupport;

import model.Movie;
import service.MovieService;


public class HelloWorld extends ActionSupport  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final String MESSAGE = "Struts is up and running ...";
	private String message;
	private MovieService movieService=new MovieService();
	private Movie movieBean=new Movie();
    
	
	public String execute() throws Exception {
		//movieBean.setTitle(movieService.getMovies() );
		setMessage(MESSAGE);
		return SUCCESS;
	}
      
	
	

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public Movie getMovieBean() {
		return movieBean;
	}

	public void setMovieBean(Movie movieBean) {
		this.movieBean = movieBean;
		
	}
//	public void setMovieBean() {
//		this.movieBean.setTitle("ccccc");	
//	}
	
}
