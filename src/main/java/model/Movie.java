package model;

import java.util.List;

public class Movie {
	private int id;
	private String title;
	private String duration;
	private String language; 
	private String subtitles;
    private String mainActors;
    private int minAge;
    private int idSessions;
    
    public Movie(int id, String title, String duration, String language, String subtitles,
			String mainActors, int minAge,int idSessions) {
		super();
		this.id = id;
		this.title = title;
		this.duration = duration;
		this.language = language;
		this.subtitles = subtitles;
		this.mainActors = mainActors;
		this.minAge = minAge;
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

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
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
	
	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", duration=" + duration + ", language=" + language
				+ ", subtitles=" + subtitles + ", mainActors=" + mainActors + ", minAge=" + minAge + "]";
	}

	public int getIdSessions() {
		return idSessions;
	}

	public void setIdSessions(int idSessions) {
		this.idSessions = idSessions;
	}
   
}
