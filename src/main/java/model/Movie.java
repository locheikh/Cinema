package model;

import java.util.Date;
import java.util.List;

public class Movie {
	private int id;
	private String title;
	private Date duration;
	private String language; 
	private String subtitles;
    private String mainActors;
    private int minAge;
    private int idSession;
    private String director; 
    private Date startingDate; 
    private Date endDate; 
    private int refMovieTheatre; 
  
    
	public Movie(int id, String title, Date duration, String language, String subtitles, String mainActors, int minAge,
			int idSession, String director, Date startingDate, Date endDate, int refMovieTheatre) {
		super();
		this.id = id;
		this.title = title;
		this.duration = duration;
		this.language = language;
		this.subtitles = subtitles;
		this.mainActors = mainActors;
		this.minAge = minAge;
		this.idSession = idSession;
		this.director = director;
		this.startingDate = startingDate;
		this.endDate = endDate;
		this.refMovieTheatre = refMovieTheatre;
	}
	
	

	public Movie(int id, String title, Date duration, String language, String subtitles, String mainActors, int minAge,
			int idSession, String director, Date startingDate, Date endDate) {
		super();
		this.id = id;
		this.title = title;
		this.duration = duration;
		this.language = language;
		this.subtitles = subtitles;
		this.mainActors = mainActors;
		this.minAge = minAge;
		this.idSession = idSession;
		this.director = director;
		this.startingDate = startingDate;
		this.endDate = endDate;
	}



	public Movie() {	
	}
    
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public String getSubtitles() {
		return subtitles;
	}

	public void setSubtitles(String subtitles) {
		this.subtitles = subtitles;
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
	
	public int getIdSessions() {
		return idSession;
	}

	public void setIdSessions(int idSession) {
		this.idSession = idSession;
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

		public int getRefMovieTheatre() {
			return refMovieTheatre;
		}

		public void setRefMovieTheatre(int refMovieTheatre) {
			this.refMovieTheatre = refMovieTheatre;
		}

		@Override
		public String toString() {
			return "Movie [id=" + id + ", title=" + title + ", duration=" + duration + ", language=" + language
					+ ", subtitles=" + subtitles + ", mainActors=" + mainActors + ", minAge=" + minAge + ", idSession="
					+ idSession + ", director=" + director + ", startingDate=" + startingDate + ", endDate=" + endDate
					+ ", refMovieTheatre=" + refMovieTheatre + "]";
		}
		
		

   
}
