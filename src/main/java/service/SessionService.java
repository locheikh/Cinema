package service;
import java.io.Closeable;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import domaine.SessionDAO;
import model.Session;


public class SessionService  /*implements Closeable*/ {
		private SessionDAO sessionDAO;
		
		public SessionService() {
			try {
				sessionDAO = new SessionDAO();
			} catch (NamingException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}


		
		public  ArrayList<Session> getSessions(int id)  {
			ArrayList<Session> session=sessionDAO.getSessions(id);
			return session;
		}



	
		
//		@Override
//		public void close() {
//			if(sessionDAO != null)sessionDAO.close();
//		}


	

}
