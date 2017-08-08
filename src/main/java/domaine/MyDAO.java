package domaine;

import java.io.Closeable;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public abstract class MyDAO implements Closeable{

	protected final static String RESOURCE_JDBC ="jdbc:mysql://localhost:3306/cinema"; //"java:comp/env/jdbc/dsMyDB";
	protected final Context context;
	protected final DataSource  ds;
	protected final Connection cnx;
	public static int NB_INSTANCES = 0;
	
	
	public MyDAO() throws NamingException, SQLException {
		super();
		System.out.println("MyDAO - Open, NB_Intstances = " + NB_INSTANCES);
		
		this.context = new InitialContext();
		System.out.println("MyDAO - Constructor, lookup...");
		this.ds = (DataSource) context.lookup(RESOURCE_JDBC);
		System.out.println("MyDAO - Constructor, getConnection...");
		this.cnx = ds.getConnection();
		
		NB_INSTANCES++;
		System.out.println("MyDAO - Constructor Fin");
	}


	@Override
	public void close(){
		
		try {
			if(cnx != null)
				cnx.close();
			if(context != null)
				context.close();
			System.out.println("MyDAO - close()");
			NB_INSTANCES--;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	

}
