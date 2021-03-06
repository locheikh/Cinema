package model;

public class MovieTheatre {
	private int id;
	private String name;
	private String adress; 
	private String city;
    private String type;
    private String refProprio;
	
    public MovieTheatre(int id, String name, String adress, String city, String type, String refProprio) {
		super();
		this.id = id;
		this.name = name;
		this.adress = adress;
		this.city = city;
		this.type = type;
		this.refProprio = refProprio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRefProprio() {
		return refProprio;
	}

	public void setRefProprio(String refProprio) {
		this.refProprio = refProprio;
	}

	@Override
	public String toString() {
		return "MovieTheatre [id=" + id + ", name=" + name + ", adress=" + adress + ", city=" + city + ", type=" + type
				+ ", refProprio=" + refProprio + "]";
	}
    
    
    


    

}
