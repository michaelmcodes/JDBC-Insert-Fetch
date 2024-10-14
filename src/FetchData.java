import java.sql.*;


// Java Database Connectivity 

/* 
 * 1. import --> java.sql
 * 2. load and register the driver --> com.mysql.jdbc.Driver
 * 3. create connection --> Connection
 * 4. create a statement --> Statement
 * 5. execute the query
 * 6. process the results
 * 7. close
 */

public class FetchData {

	public static void main(String[] args) throws Exception{
		
		String url = "jdbc:mysql://localhost:3306/aliens";
		String uname = "root";
		String pass = "";
		String query = "SELECT * FROM student;";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		
		Statement st = con.createStatement();
		
		ResultSet rs= st.executeQuery(query);
		
        while(rs.next()){
            String userData = rs.getInt(1) + ": " + rs.getString(2);
            System.out.println(userData);
        }
		
		st.close();
		con.close();

	}

}