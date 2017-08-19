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
				sessionDAO = SessionDAO.getInstance();
		}


		
		public  ArrayList<Session> getSessions(int id)  {
			ArrayList<Session> session=sessionDAO.getSessions(id);
			return session;
		}                 

		public void addSessions(int refMovie,String jour) {
			sessionDAO.addSessions(refMovie,jour);
		}



		public void deleteSession(int session) {
			// TODO Auto-generated method stub
			sessionDAO.deleteSession(session);
		}



		public void updateSession(int refMovie, String jour,int id) {
			// TODO Auto-generated method stub
			 sessionDAO.updateSession(refMovie,jour,id);
		}



		public Session getSession(int idSession) {
			return sessionDAO.getSession(idSession);
		}

	
		
//		@Override
//		public void close() {
//			if(sessionDAO != null)sessionDAO.close();
//		}


	

}
