package service;
import java.io.Closeable;
import java.sql.SQLException;
import java.util.List;

import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import domaine.MovieDAO;


public class MovieService  implements Closeable {
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


		
		public  List<String> getMovies()  {
			List<String> list=movieDAO.getMovies();
			return list;
		}
		
		@Override
		public void close() {
			if(movieDAO != null)movieDAO.close();
		}


	

}
