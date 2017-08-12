package service;
import java.io.Closeable;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import domaine.MovieTheatreDAO;
import model.MovieTheatre;


public class MovieTheatreService  /*implements Closeable*/ {
		private MovieTheatreDAO movieTheatreDAO;
		
		public MovieTheatreService() {
			try {
				movieTheatreDAO = new MovieTheatreDAO();
			} catch (NamingException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}


		
		public  ArrayList<MovieTheatre> getAllMovieTheatres()  {
			ArrayList<MovieTheatre> ListMovieTheatre=movieTheatreDAO.getAllMovieTheatres();
			return ListMovieTheatre;
		}



	
		
//		@Override
//		public void close() {
//			if(movieTheatreDAO != null)movieTheatreDAO.close();
//		}


	

}
