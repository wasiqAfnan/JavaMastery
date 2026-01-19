import java.sql.*;

public class jdbc_6_showData {
    public static void main(String[] args) {
        try {// loading jdbc sql drivers

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

            // preparing query

            String query = "select * from students";

            // creating statement 

            Statement stmt = con.createStatement();

            // executing query and creating object of ResultSet Class

            ResultSet rs = stmt.executeQuery(query); // executeQuery returns a resultset in which all the data is stored from db

            // fetching records from result set

            while(rs.next()){
                int id = rs.getInt("student_id"); // fetching slno from resultset
                String name = rs.getString("student_name"); // fetching name from resultset
                String city = rs.getString("student_address"); // fetching city from resultset

                System.out.println("Student id = " + id + " | " + "Student name = " + name + " | " + "Student city = " + city ); // printing in terminal
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
