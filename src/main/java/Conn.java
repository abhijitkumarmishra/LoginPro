   
import java.sql.*;
public class Conn{
	
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
    	String url="jdbc:mysql://localhost:3308/welcome";
    	String uname="root";
    	String pass ="india@123";
    	
    	
		Connection con = DriverManager.getConnection(url,uname,pass);
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from users");
		System.out.println("+----------+---------------------------------+");
        System.out.println("  USERNAME       PASSWORD");
		while(rs.next())
		 {  
			System.out.println("+----------+---------------------------------+");
			 String username = rs.getString("uname");
			 String password=rs.getString("Pass");
			  
			 System.out.println("|      "+username+"           "+password)+"     |";
		 }
		System.out.println("+----------+---------------------------------+");
		
	}

	
}
