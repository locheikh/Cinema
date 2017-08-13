package service;
import java.io.Closeable;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import domaine.MovieDAO;
import model.Movie;


public class MovieService  /*implements Closeable*/ {
		private MovieDAO movieDAO;
		
		public MovieService() {
			try {
				movieDAO = new MovieDAO();
			} catch (NamingException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}


		
		public  Movie getMovies(int id)  {
			Movie movie=movieDAO.getMovies(id);
			return movie;
		}



		public ArrayList<Movie> getAllMovie(int refMovieTheatre) {
			// TODO Auto-generated method stub
			ArrayList<Movie>ListMovie=movieDAO.getAllMovie(refMovieTheatre);
			return ListMovie;
		}



	



	
		
//		@Override
//		public void close() {
//			if(movieDAO != null)movieDAO.close();
//		}


	

}
