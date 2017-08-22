package model;

public class User {
	private int id;
	private String name;
	private String prenom;
	private String login;
	private String password;
	private int proprio;
	
	public User(int id, String name, String prenom, String login, String password,int proprio) {
		super();
		this.id = id;
		this.name = name;
		this.prenom = prenom;
		this.login = login;
		this.password = password;
		this.proprio = proprio;
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

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public int getProprio() {
		return proprio;
	}

	public void setProprio(int proprio) {
		this.proprio = proprio;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", prenom=" + prenom + ", login=" + login + ", password="
				+ password + ", proprio=" + proprio + "]";
	}
	
	
	
}
