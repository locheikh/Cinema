package model;

import java.util.List;

public class Movie {
	private int id;
	private String title;
	private String duration;
	private List<String> language; 
	private List<String> subtitles;
    private List<Integer>mainActors;
    private int minAge;
    
    public Movie(int id, String title, String duration, List<String> language, List<String> subtitles,
			List<Integer> mainActors, int minAge) {
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

	public List<String> getLanguage() {
		return language;
	}

	public void setLanguage(List<String> language) {
		this.language = language;
	}

	public List<String> getSubtitles() {
		return subtitles;
	}

	public void setSubtitles(List<String> subtitles) {
		this.subtitles = subtitles;
	}

	public List<Integer> getMainActors() {
		return mainActors;
	}

	public void setMainActors(List<Integer> mainActors) {
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
   
}
