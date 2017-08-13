package domaine;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import model.Session;



public class SessionDAO {

	
	private static final String ERROR = null;

	public SessionDAO() throws NamingException, SQLException {
		super();
	}
	
	public ArrayList<Session> getSessions(int id) {
		  Session	session =null;	
		  ArrayList<Session>ListSession=new ArrayList<Session>();
		  String jour;
		  int idSession;
		  int refMovie;
		  Date startingTime;
		  
	      String ret ="edrrrrr";//ERROR;
	        Connection conn = null;

	        try {
	           String URL = "jdbc:mysql://localhost:3306/cinema";
	           Class.forName("com.mysql.jdbc.Driver");
	           conn = DriverManager.getConnection(URL, "root", "root");
	           String sql = "SELECT * FROM session WHERE refMovie="+id+"";
	           PreparedStatement ps = conn.prepareStatement(sql);
	           ResultSet rs = ps.executeQuery();
	           while (rs.next()) { 
	        	  jour=rs.getString("jour");        
	        	  idSession=rs.getInt("id");
	        	  refMovie=rs.getInt("refMovie");;
	        	  startingTime=rs.getTimestamp("startingTime");
	        	  session =new Session(idSession,jour, startingTime,refMovie);
	        	  ListSession.add(session);
	           }
	        } catch (Exception e) {
	        	System.out.println("ERROR");
	        } finally {
	           if (conn != null) {
	              try {
	                 conn.close();
	              } catch (Exception e) {
	              }
	           }
	        } 
	        return ListSession;
	}
}

	
	
	
	
	

