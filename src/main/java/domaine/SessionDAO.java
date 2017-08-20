package domaine;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
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
		  Date jour;
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
	        	  jour=rs.getTimestamp("jour");        
	        	  idSession=rs.getInt("id");
	        	  refMovie=rs.getInt("refMovie");;
	        	  startingTime=rs.getTimestamp("startingTime");
	        	  java.sql.Date startingTimeDate = rs.getDate("startingTime");
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
	
	public String addSessions(int refMovie,Date jour) {
				      String ret = ERROR;
				      Connection conn = null;
				      int id=0;
				      
				      try {
				    	  String URL = "jdbc:mysql://localhost:3306/cinema";
				           Class.forName("com.mysql.jdbc.Driver");
				           conn = DriverManager.getConnection(URL, "root", "root");
				         String sql = "insert into session(refMovie,jour) values (?,?)";
				         
				         //sql+=" user = ? AND password = ?";
				         PreparedStatement ps = conn.prepareStatement(sql);
				         
				         ps.setInt(1,refMovie);
				         java.sql.Date sqlDate = new java.sql.Date(jour.getTime());
				         ps.setDate(2,sqlDate);
				         System.out.println(ps);
	
				         
				         int affectedRows = ps.executeUpdate();

							if (affectedRows == 0) {
							    throw new SQLException("Creating user failed, no rows affected.");
							}
							try (ResultSet rs = ps.getGeneratedKeys()) {
							    if (rs.next()) {
							        id = rs.getInt(1);
							        System.out.println("DAO.addAddress() - id returned: " + id);
							    }
							    else {
							        throw new SQLException("Creating user failed, no ID obtained.");
							    }
							}
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}//finally{
//							//return id;
//						}
			           catch (ClassNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

				      System.out.println("addmoviefinb");
				      return ret;
				   }

	public void deleteSession(int session) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM session WHERE id = ?";
        String ret = ERROR;
         Connection conn = null;
         try {
        	 String URL = "jdbc:mysql://localhost:3306/cinema";
        	 Class.forName("com.mysql.jdbc.Driver");
        	 conn = DriverManager.getConnection(URL, "root", "root");
        	 final PreparedStatement ps = conn.prepareStatement(sql);
        	 ps.setInt(1, session);
        	 ps.executeUpdate();		
		
         } catch (SQLException e) {
		// TODO Auto-generated catch block
        	 e.printStackTrace();
         } catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
        	 e.printStackTrace();
         }

   }

	public void updateSession(int refMovie, Date jour,int id, Date startingTime) {
// TODO Auto-generated method stub
				String sql = "UPDATE session SET jour=?,startingTime=? WHERE id="+id+"";
		        String ret = ERROR;
		         Connection conn = null;
		         try {  
		        	 String URL = "jdbc:mysql://localhost:3306/cinema";
		        	 Class.forName("com.mysql.jdbc.Driver");
		        	 conn = DriverManager.getConnection(URL, "root", "root");
		        	 final PreparedStatement ps = conn.prepareStatement(sql);
		        	 java.sql.Date sqlDate = new java.sql.Date(jour.getTime());
			         ps.setDate(1,sqlDate);
			         java.sql.Date sqlTime = new java.sql.Date(startingTime.getTime());
			         ps.setDate(2,sqlTime);
			         System.out.println(ps);
		        	 ps.executeUpdate();		
				
		         } catch (SQLException e) {
				// TODO Auto-generated catch block
		        	 e.printStackTrace();
		         } catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
		        	 e.printStackTrace();
		         }

	
	}

	public Session getSession(int idSession) {
		// TODO Auto-generated method stub
		  Session	session =null;	
		  Date jour;
		  int refMovie;
		  Date startingTime;
		  
	      String ret ="edrrrrr";//ERROR;
	        Connection conn = null;

	        try {
	           String URL = "jdbc:mysql://localhost:3306/cinema";
	           Class.forName("com.mysql.jdbc.Driver");
	           conn = DriverManager.getConnection(URL, "root", "root");
	           String sql = "SELECT * FROM session WHERE id="+idSession+"";
	           PreparedStatement ps = conn.prepareStatement(sql);
	           ResultSet rs = ps.executeQuery();
	           while (rs.next()) { 
	        	  jour=rs.getTimestamp("jour");        
	        	  //idSession=rs.getInt("id");
	        	  refMovie=rs.getInt("refMovie");
	        	  startingTime=rs.getTimestamp("startingTime");
	        	  session =new Session(idSession,jour, startingTime,refMovie);
	        	  //ListSession.add(session);
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
	        return session;
			
	}
   
}