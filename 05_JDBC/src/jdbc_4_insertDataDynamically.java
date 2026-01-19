import java.sql.*;
import java.util.Scanner;

public class jdbc_4_insertDataDynamically {
    public static void main(String[] args) {
        try {
            // loading jdbc sql drivers

            Class.forName("com.mysql.cj.jdbc.Driver");

            // setup url username and password

            String url = "jdbc:mysql://localhost:3406/records";
            String userName = "root";
            String password = "root";

            // creating connenction to the database named my_db

            Connection con = DriverManager.getConnection(url, userName, password);

            // checking connection has established or not.

            if (con.isClosed()) {
                System.out.println("Connection failed");
            } else {
                System.out.println("Connection Successful");
            }

            // preparing sql query

            String query = "insert into courses(course_name, course_instructor) VALUES (?,?);";

            // creating a statement

            PreparedStatement pstmt = con.prepareStatement(query);

            // getting values from user

            System.out.print("Enter course name and instructor name: ");

            Scanner in = new Scanner(System.in);
            String name, address;

            name = in.nextLine();
            address = in.nextLine();

            // setup values

            pstmt.setString(1, name);
            pstmt.setString(2, address);

            // executing query

            /*
             * executeUpdate() excutes the query and returns the number of rows affected in
             * the db
             * if we fetch (select query) data from the db then we have to use
             * executeQuery() instead of executeUpdate()
             */

            pstmt.executeUpdate();

            System.out.println("Data Insertion Successful");

            // closing the connection.

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
