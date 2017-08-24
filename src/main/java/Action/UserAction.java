package Action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
 
import com.opensymphony.xwork2.ActionSupport;

import model.User;
import service.MovieTheatreService;
import service.UserService;
 
public class UserAction extends ActionSupport implements SessionAware {
     
    private Map<String, Object> sessionMap;
    private String userName="null";
    private String password="null";
    private User user;
    private int test;
    
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
        if(user!=null)
        if (userName != null && userName.equals(/*"admin"*/user.getLogin())
                && password != null && password.equals(user.getPassword())) {
             
            // add userName to the session
        	sessionMap.put("Name",user.getName());
            sessionMap.put("userName",user.getPrenom());
            sessionMap.put("id",user.getId()); 
//            userName="null";
//            password="null";
             
            return SUCCESS; // return welcome page
        }
       
        userName=null;
        password=null;
         
        // in other cases, return login page
        return INPUT;
    }
     
    public String logout() {
    	
        // remove userName from the session
        if (sessionMap.containsKey("userName")) 
        {
        	sessionMap.remove("Name");
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
	
	public void validate()
	   {  
		sessionMap.put("lastlogin",userName); 

		  if(test==1){
			 
			  if (userName == null || userName.trim().equals(""))
			   {
			    addFieldError("userName","The name is required");
			   }

			   if (password == null || password.trim().equals(""))
			   {
		         addFieldError("password","The password is incorrect");
		       }
		  }
	   }

	public int getTest() {
		return test;
	}

	public void setTest(int test) {
		this.test = test;
	}
}