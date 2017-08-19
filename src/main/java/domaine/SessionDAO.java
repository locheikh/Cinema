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
	private static SessionDAO instanceUnique;
	private static Connection conn;

	private SessionDAO() throws NamingException, SQLException, ClassNotFoundException {
		super();
		 String URL = "jdbc:mysql://localhost:3306/cinema";
         Class.forName("com.mysql.jdbc.Driver");
         conn = DriverManager.getConnection(URL, "root", "root");
	}
	
	public ArrayList<Session> getSessions(int id) {
		  Session	session =null;	
		  ArrayList<Session>ListSession=new ArrayList<Session>();
		  String jour;
		  int idSession;
		  int refMovie;
		  Date startingTime;
		  
	      String ret ="edrrrrr";//ERROR;

	        try {
	          
	           String sql = "SELECT * FROM session WHERE refMovie="+id+"";
	           PreparedStatement ps = conn.prepareStatement(sql);
	           ResultSet rs = ps.executeQuery();
	           while (rs.next()) { 
	        	  jour=rs.getString("jour");        
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
	
	public String addSessions(int refMovie,String jour) {
				      String ret = ERROR;
				      int id=0;
				      
				      try {
				         String sql = "insert into session(refMovie,jour) values (?,?)";
				         
				         //sql+=" user = ? AND password = ?";
				         PreparedStatement ps = conn.prepareStatement(sql);
				         
				         ps.setInt(1,refMovie);
				         ps.setString(2,jour);
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

				      System.out.println("addmoviefinb");
				      return ret;
				   }

	public void deleteSession(int session) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM session WHERE id = ?";
        String ret = ERROR;
         try {
        	 final PreparedStatement ps = conn.prepareStatement(sql);
        	 ps.setInt(1, session);
        	 ps.executeUpdate();		
		
         } catch (SQLException e) {
		// TODO Auto-generated catch block
        	 e.printStackTrace();
         }

   }

	public void updateSession(int refMovie, String jour,int id) {
// TODO Auto-generated method stub
				String sql = "UPDATE session SET jour=? WHERE id="+id+"";
		        String ret = ERROR;
		         try {  
		        	
		        	 final PreparedStatement ps = conn.prepareStatement(sql);
		        	 ps.setString(1,jour);
		        	 ps.executeUpdate();		
				
		         } catch (SQLException e) {
				// TODO Auto-generated catch block
		        	 e.printStackTrace();
		         }

	
	}

	public Session getSession(int idSession) {
		// TODO Auto-generated method stub
		  Session	session =null;	
		  String jour;
		  int refMovie;
		  Date startingTime;
		  
	      String ret ="edrrrrr";//ERROR;

	        try {
	           String sql = "SELECT * FROM session WHERE id="+idSession+"";
	           PreparedStatement ps = conn.prepareStatement(sql);
	           ResultSet rs = ps.executeQuery();
	           while (rs.next()) { 
	        	  jour=rs.getString("jour");        
	        	  //idSession=rs.getInt("id");
	        	  refMovie=rs.getInt("refMovie");;
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

	public static SessionDAO getInstance() {
		synchronized (instanceUnique) {
			if (instanceUnique == null) {
				try {
					instanceUnique = new SessionDAO();
				} catch (ClassNotFoundException | NamingException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return instanceUnique;
	}
   
}

	
	
	
	
	

