// import sql package
import java.sql.*;
import java.util.Scanner;



public class InsertData {

    public static void main(String[] args) throws Exception {
        // database info
        String url = "jdbc:mysql://localhost:3306/aliens";
        String uname = "root";
        String pass = "";

        // get data
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter user ID: ");
        int userid = sc.nextInt();
        sc.nextLine(); // fixed error where couldn't input username

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        // query
        String query = "INSERT INTO student values(?,?);";

        // load and register the driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);

        // use PreparedStatement interface to run the insert query
        PreparedStatement st = con.prepareStatement(query);
        st.setInt(1, userid);
        st.setString(2, username);

        // track how many rows inserted
        int count = st.executeUpdate();

        //print the rows inserted
        System.out.println(count + "row/s affected");

        //close resources
        sc.close();
        st.close();
        con.close();
    }

}