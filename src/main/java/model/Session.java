package model;

import java.util.Date;

public class Session {
	private int id; 
	private Date jour; 
	private Date startingTime ;
	private int refMovie; 
   
	 
	public Session(int id, Date jour, Date startingTime, int refMovie) {
		super();
		this.id = id;
		this.jour = jour;
		this.startingTime = startingTime;
		this.refMovie = refMovie;
	}
	
	
	public Session() {
		super();
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getJour() {
		return jour;
	}
	public void setJour(Date jour) {
		this.jour = jour;
	}
	public Date getStartingTime() {
		return startingTime;
	}
	public void setStartingTime(Date startingTime) {
		this.startingTime = startingTime;
	}
	public int getrefMovie() {
		return refMovie;
	}
	public void setrefMovie(int refmovie) {
		refMovie = refmovie;
	}
	
	@Override
	public String toString() {
		return "Session [id=" + id + ", jour=" + jour + ", startingTime=" + startingTime + ", refMovie=" + refMovie
				+ "]";
	}

}
