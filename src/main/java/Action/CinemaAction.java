package Action;

import java.util.ArrayList;
import java.util.Date;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

import com.opensymphony.xwork2.ActionSupport;

import model.Movie;
import model.MovieAll;
import model.MovieTheatre;
import model.Session;
import service.MovieService;
import service.MovieTheatreService;
import service.SessionService;

public class CinemaAction extends ActionSupport {

	private ArrayList<MovieTheatre> movieTheatres=null;
	private ArrayList<Session> sessions=null;
	private ArrayList<Movie>movies=null;
	private ArrayList<MovieAll>moviesAll=null;
	private Movie movi=null;
	         
	//readMovies
	private String MT;
	private int refMovieTheatre;
	         
	         //readMovie
	private int idMovie;

	
        //	addMovie
	private Date duration;
	private String language ;
	private String mainActors ;
	private int minAge;
	private String title;
	private String director; 
	private Date startingDate ; 
	private Date endDate; 
	private String subtitles;
	
       //  addSessions

	private int refMovie;
	private Date jour=null;
	private Date startingTime=null;
	
	  //UpdateSession
	private int idSession;       
	private Session sess ;  	
	
	private int test;
	
	 
	 public String getAll() {
			MovieService movieService=new MovieService(); 
			setMoviesAll(movieService.getAll());
			return SUCCESS;
	    } 
	
	public String getAllMovieTheatres() {
		MovieTheatreService movieTheatreService=new MovieTheatreService(); 
		setMovieTheatres(movieTheatreService.getAllMovieTheatres());
		return SUCCESS;
    }
	
	public String getMovie() {
		MovieService movieService=new MovieService(); 
		this.setMovi(movieService.getMovie(idMovie));
		return SUCCESS;
    }
	
	public String deleteMovie() {
		MovieService movieService=new MovieService();
		this.setMovi(movieService.getMovie(idMovie));
		movieService.deleteMovie(idMovie);
		refMovieTheatre=movi.getRefMovieTheatre();
		return SUCCESS;
    }
	
	public String getAllMovie() {
		MovieService movieService=new MovieService(); 
		movies=movieService.getAllMovie(refMovieTheatre);
//		MovieTheatreService movieTheatreService=new MovieTheatreService(); 
//		setMovieTheatres(movieTheatreService.getAllMovieTheatres());
//		int i=movieTheatres.id.
//		setMT(movieTheatres.get(i).getName());
		return SUCCESS;
    }
	
	public String addMovie() {
		MovieService movieService=new MovieService(); 
		//if(language.trim().equals(""))return INPUT;
		
		
		
		
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
		sessionService.addSessions(idMovie,jour,startingTime);
		return SUCCESS;
    }
	
	public String deleteSession() {
		SessionService sessionService=new SessionService(); 
		sess=sessionService.getSession(idSession);
		sessionService.deleteSession(idSession);
		idMovie=sess.getrefMovie();
		return SUCCESS;
    }
	
	public String updateSession() {
		SessionService sessionService=new SessionService(); 
//		SimpleDateFormat formater = null;
//		formater = new SimpleDateFormat("EEEE, d MMM yyyy");
//		System.out.println(formater.format(aujourdhui));
		 
		sessionService.updateSession(idMovie,jour,idSession,startingTime);
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

	public Date getStartingTime() {
		return startingTime;
	}

	public void setStartingTime(Date startingTime) {
		this.startingTime = startingTime;
	}

	public ArrayList<MovieAll> getMoviesAll() {
		return moviesAll;
	}

	public void setMoviesAll(ArrayList<MovieAll> moviesAll) {
		this.moviesAll = moviesAll;
	}
	
	public void validate()
	   {  
		  if(test==1){

			  if (title == null || title.trim().equals(""))
			   {
			    addFieldError("title","The name is required");
			   }
			  if (language== null || language.trim().equals(""))
			   {
		         addFieldError("language","The language  is required");
		       }
			   if (subtitles== null || subtitles.trim().equals(""))
			   {
		         addFieldError("subtitles","The subtitles is required");
		       }
			   if (minAge ==0)
			   {
		         addFieldError("minAge","The minAge is required");
		       }
			   if (director== null || director.trim().equals(""))
			   {
		         addFieldError("director","The director is  required");
		       }
			   if (director== null || director.trim().equals(""))
			   {
		         addFieldError("mainActors","The mainActors is required");
		       }
			   if (duration== null /*|| duration.trim().equals("")*/)
			   {
		         addFieldError("duration","The duration is required");
		       }
			   if(endDate==null)
			   {
				   addFieldError("endDate","The endDate is required");
			   }
			   if(startingDate==null)
			   {
				   addFieldError("startingDate","The startingDate is required");
			   }
			   
		  }
		  
		  if(test==2){
			  if(jour==null)
			   {
				   addFieldError("jour","The Date is required");
			   }
			  if(startingTime==null)
			   {
				   addFieldError("startingTime","The startingDate is required");
			   }

		  }
	   }

	public int getTest() {
		return test;
	}

	public void setTest(int test) {
		this.test = test;
	}

	public String getMT() {
		return MT;
	}

	public void setMT(String mT) {
		MT = mT;
	}
	
	
	
}
