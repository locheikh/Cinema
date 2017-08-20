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

	private ArrayList<MovieTheatre> movieTheatres=null;
	private ArrayList<Session> sessions=null;
	//private Movie movie=null;
	private ArrayList<Movie>movies=null;
	private Movie movi=null;
	         //readMovies
	private int refMovieTheatre;
	         
	         //readMovie
	private int idMovie;

	
        //	addMovie
	private Date duration =null;
	private String language ;
	private String mainActors ;
	private int minAge;
	private String title;
	private String director; 
	private Date startingDate = null; 
	private Date endDate =null ; 
	private String subtitles;
	
       //  addSessions

	private int refMovie;
	private Date jour=null;
	private Date startingTime=null;
	
	  //UpdateSession
	private int idSession;       
	private Session sess ;  	
	
	
	
	public String getAllMovieTheatres() {
		MovieTheatreService movieTheatreService=new MovieTheatreService(); 
		setMovieTheatres(movieTheatreService.getAllMovieTheatres());
		return SUCCESS;
    }
	
	public String movieSessions() {
		SessionService sessionService=new SessionService(); 
		setSessions(sessionService.getSessions(4));
		return SUCCESS;
    }
	
	public String getMovie() {
		MovieService movieService=new MovieService(); 
		this.setMovi(movieService.getMovie(idMovie));
		return SUCCESS;
    }
	
	public String deleteMovie() {
		MovieService movieService=new MovieService(); 
		movieService.deleteMovie(idMovie);
		return SUCCESS;
    }
	
	public String getAllMovie() {
		MovieService movieService=new MovieService(); 
		movies=movieService.getAllMovie(refMovieTheatre);
		return SUCCESS;
    }
	
	public String addMovie() {
		MovieService movieService=new MovieService(); 
		movieService.addMovie(duration,language,mainActors,minAge,title,director, 
				startingDate,endDate,subtitles,refMovieTheatre);   //1 refMovieTheatre
		return SUCCESS;
    }
	
	public String updateMovie() {

		MovieService movieService=new MovieService(); 
		movieService.updateMovie(idMovie,duration,language,mainActors,minAge,title,director, 
				startingDate,endDate,subtitles,refMovieTheatre);
		return SUCCESS;
    }
	
	public String addSessions() {
		SessionService sessionService=new SessionService(); 
		sessionService.addSessions(refMovie,jour);
		return SUCCESS;
    }
	
	public String deleteSession() {
		SessionService sessionService=new SessionService(); 
		sessionService.deleteSession(idSession);
		return SUCCESS;
    }
	
	public String updateSession() {
		System.out.println(idMovie);
		SessionService sessionService=new SessionService(); 
		sessionService.updateSession(refMovie,jour,idSession,startingTime);
		return SUCCESS;
    }
	
	public String getSession() {
		
		SessionService sessionService=new SessionService(); 
		sess=sessionService.getSession(idSession);
	    refMovie=sess.getrefMovie();
		return SUCCESS;
    }
	
	
	
	
	
	

	public ArrayList<MovieTheatre> getMovieTheatres() {
		return movieTheatres;
	}

	public void setMovieTheatres(ArrayList<MovieTheatre> movieTheatres) {
		this.movieTheatres = movieTheatres;
	}

	public ArrayList<Session> getSessions() {
		return sessions;
	}

	public void setSessions(ArrayList<Session> sessions) {
		this.sessions = sessions;
	}


	

	public ArrayList<Movie> getMovies() {
		return movies;
	}

	public void setMovies(ArrayList<Movie> movies) {
		this.movies = movies;
	}

	public int getRefMovieTheatre() {
		return refMovieTheatre;
	}

	public void setRefMovieTheatre(int refMovieTheatre) {
		this.refMovieTheatre = refMovieTheatre;
	}

	public int getIdMovie() {
		return idMovie;
	}

	public void setIdMovie(int idMovie) {
		this.idMovie = idMovie;
	}

	public Date getDuration() {
		return duration;
	}

	public void setDuration(Date duration) {
		this.duration = duration;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getMainActors() {
		return mainActors;
	}

	public void setMainActors(String mainActors) {
		this.mainActors = mainActors;
	}

	public int getMinAge() {
		return minAge;
	}

	public void setMinAge(int minAge) {
		this.minAge = minAge;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public Date getStartingDate() {
		return startingDate;
	}

	public void setStartingDate(Date startingDate) {
		this.startingDate = startingDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getSubtitles() {
		return subtitles;
	}

	public void setSubtitles(String subtitles) {
		this.subtitles = subtitles;
	}

	public int getRefMovie() {
		return refMovie;
	}

	public void setRefMovie(int refMovie) {
		this.refMovie = refMovie;
	}

	public Date getJour() {
		return jour;
	}

	public void setJour(Date jour) {
		this.jour = jour;
	}


	public Movie getMovi() {
		return movi;
	}

	public void setMovi(Movie movi) {
		this.movi = movi;
	}
	
	 public int getIdSession() {
			return idSession;
		}

		public void setIdSession(int idSession) {
			this.idSession = idSession;
		}

	public Session getSess() {
		return sess;
	}

	public void setSess(Session sess) {
		this.sess = sess;
	}
	
}
