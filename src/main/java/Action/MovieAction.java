package Action;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import model.Movie;
import service.MovieService;
 
public class MovieAction extends ActionSupport {
     
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Movie movieBean;
	private String message;
	public String title;
	//MovieService movieService=new MovieService(); 
	//public List<String> titleList =new List<String>();
	public String execute() {
    	
    	String ret ="edrrrrr";//ERROR;
        Connection conn = null;

        
        try {
           String URL = "jdbc:mysql://localhost:3306/cinema";
           System.out.println("boucle2hnnn");
           Class.forName("com.mysql.jdbc.Driver");
           conn = DriverManager.getConnection(URL, "root", "root");
           String sql = "SELECT * FROM movie";
           PreparedStatement ps = conn.prepareStatement(sql);
           ResultSet rs = ps.executeQuery();
           while (rs.next()) {
        	   title = rs.getString("title");
    			System.out.println(title);
    			//titleList.add(title);
           }
        } catch (Exception e) {
        	System.out.println("fffffffffffffffffff");
           //ret;
        } finally {
           if (conn != null) {
              try {
                 conn.close();
              } catch (Exception e) {
              }
           }
        }
      
    	
        System.out.println(title);
    	 
        //System.out.println("Title: " + movieBean.getTitle());
        //System.out.println("Duration: " + movieBean.getDuration());
        //System.out.println(titleList);
        // add your login procedure here...
    	//movieService.getMovies();
    	//message="test";
        //message=titleList.get(0);
        return SUCCESS;
    }
 
    public Movie getmovieBean() {
        return movieBean;
    }
 
    public void setmovieBean(Movie movieBean) {
        this.movieBean = movieBean;
    }

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}