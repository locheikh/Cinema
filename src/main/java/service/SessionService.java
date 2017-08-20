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

		public void addSessions(int refMovie,Date jour) {
			sessionDAO.addSessions(refMovie,jour);
		}



		public void deleteSession(int session) {
			// TODO Auto-generated method stub
			sessionDAO.deleteSession(session);
		}



		public void updateSession(int refMovie, Date jour,int id, Date startingTime) {
			// TODO Auto-generated method stub
			 sessionDAO.updateSession(refMovie,jour,id,startingTime);
		}



		public Session getSession(int idSession) {
			return sessionDAO.getSession(idSession);
		}

	
		
//		@Override
//		public void close() {
//			if(sessionDAO != null)sessionDAO.close();
//		}


	

}