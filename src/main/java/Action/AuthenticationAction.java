package Action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
 
import com.opensymphony.xwork2.ActionSupport;

import model.User;
import service.MovieTheatreService;
import service.UserService;
 
public class AuthenticationAction extends ActionSupport implements SessionAware {
     
    private Map<String, Object> sessionMap;
    private String userName;
    private String password;
    private User user;
    
    public String login() {
        String loggedUserName = null;
        
        //System.out.println(userName+"     "+password);
       UserService userService=new UserService();
       setUser(userService.getUser(userName,password));
       
//        System.out.println(user);
       
        // check if the userName is already stored in the session
        if (sessionMap.containsKey("userName")) {
            loggedUserName = (String) sessionMap.get("userName");
        }
        if (loggedUserName != null /*&& loggedUserName.equals("admin")*/) {
            return SUCCESS; // return welcome page
        }
         
        // if no userName stored in the session,
        // check the entered userName and password
        if (userName != null && userName.equals(/*"admin"*/user.getLogin())
                && password != null && password.equals(user.getPassword())) {
             
            // add userName to the session
            sessionMap.put("userName",user.getPrenom());
            sessionMap.put("id",user.getId()); 
            return SUCCESS; // return welcome page
        }
         
        // in other cases, return login page
        return INPUT;
    }
     
    public String logout() {
    	
        // remove userName from the session
        if (sessionMap.containsKey("userName")) {
            sessionMap.remove("userName");
            sessionMap.remove("id");
        }
        return SUCCESS;
    }
 
    @Override
    public void setSession(Map<String, Object> sessionMap) {
        this.sessionMap = sessionMap;
    }
     
    public void setUserName(String userName) {
        this.userName = userName;
    }
     
    public void setPassword(String password) {
        this.password = password;
    }

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}