package service;
import java.io.Closeable;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import domaine.MovieDAO;
import domaine.SessionDAO;
import model.Movie;



public class MovieService  /*implements Closeable*/ {
		private MovieDAO movieDAO;
		private SessionDAO sessionDAO;
		public MovieService() {
			movieDAO = new MovieDAO();
			sessionDAO=SessionDAO.getInstance();
		}


		
		public  Movie getMovie(int idMovie)  {
			Movie movie=movieDAO.getMovie(idMovie);
			movie.setSessions(sessionDAO.getSessions(idMovie));
			return movie;
		}



		public ArrayList<Movie> getAllMovie(int refMovieTheatre) {
			ArrayList<Movie>ListMovie=movieDAO.getAllMovie(refMovieTheatre);
			return ListMovie;
		}




		public void addMovie(Date duration, String language, String mainActors, int minAge, String title,
				String director, Date startingDate, Date endDate, String subtitles, int refMovieTheatre) {
			// TODO Auto-generated method stub
			movieDAO.addMovie(duration,language,mainActors,minAge,title,director, 
					startingDate,endDate,subtitles,refMovieTheatre);
			
		}



		public void deleteMovie(int idMovie) {
			// TODO Auto-generated method stub
			movieDAO.deleteMovie(idMovie);
		}



		public void updateMovie(int idMovie, Date duration, String language, String mainActors, int minAge, String title,
				String director, Date startingDate, Date endDate, String subtitles, int refMovieTheatre) {
			// TODO Auto-generated method stub
			
			movieDAO.updateMovie(idMovie,duration,language,mainActors,minAge,title,director, 
					startingDate,endDate,subtitles,refMovieTheatre);

		}



	



	
		
//		@Override
//		public void close() {
//			if(movieDAO != null)movieDAO.close();
//		}


	

}
