package Action;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import model.Session;
import service.SessionService;
 
public class SessionAction extends ActionSupport {
     
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	public String title;
	public  ArrayList<Session> sessions=new  ArrayList<Session>();
	SessionService sessionService=new SessionService(); 
	
	public String movieSessions() {
		sessions=sessionService.getSessions(4);
		return SUCCESS;
    }
 

}