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
	private Session sessionBean;
	private String message;
	public String title;
	public  ArrayList<Session> sessions=new  ArrayList<Session>();
	SessionService sessionService=new SessionService(); 
	
	public String execute() {
		sessions=sessionService.getSessions(4);
		return SUCCESS;
    }
 
    public Session getsessionBean() {
        return sessionBean;
    }
 
    public void setsessionBean(Session sessionBean) {
        this.sessionBean = sessionBean;
    }

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}