package model;

public class MovieAll {
	 private String language;
	 private int id;	  
	 private String adress;
	 private String city;
	 private String name;
	 private String type;
	 private int refProprio;
	 private String title;
	 private int refMovieTheatre;
	 
	 public MovieAll(String language, int id, String adress, String city, String name, String type, int refProprio,
			String title, int refMovieTheatre) {
		super();
		this.language = language;
		this.id = id;
		this.adress = adress;
		this.city = city;
		this.name = name;
		this.type = type;
		this.refProprio = refProprio;
		this.title = title;
		this.setRefMovieTheatre(refMovieTheatre);
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getRefProprio() {
		return refProprio;
	}

	public void setRefProprio(int refProprio) {
		this.refProprio = refProprio;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "MovieAll [language=" + language + ", id=" + id + ", adress=" + adress + ", city=" + city + ", name="
				+ name + ", type=" + type + ", refProprio=" + refProprio + ", title=" + title + "]";
	}

	public int getRefMovieTheatre() {
		return refMovieTheatre;
	}

	public void setRefMovieTheatre(int refMovieTheatre) {
		this.refMovieTheatre = refMovieTheatre;
	}
	 
	 
	 
	 

}
