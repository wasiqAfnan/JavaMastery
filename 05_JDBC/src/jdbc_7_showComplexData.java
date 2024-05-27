import java.sql.*;

public class jdbc_7_showComplexData {
    public static void main(String[] args) {
        try {// loading jdbc sql drivers

            Class.forName("com.mysql.cj.jdbc.Driver");

            // setup url username and password

            String url = "jdbc:mysql://localhost:3306/my_db";
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

            String query = "select * from my_table where slno = ?";

            // creating statement

            PreparedStatement pstmt = con.prepareStatement(query);

            // setting parameter

            pstmt.setInt(1, 2); // this will fetch the data available in slno 3 only
            
            // executing query and creating object of ResultSet Class

            ResultSet rs = pstmt.executeQuery(); // executeQuery returns a resultset in which all the data is stored
            // from db

            // fetching records from result set

            while (rs.next()) {
                int id = rs.getInt("slno"); // fetching slno from resultset
                String name = rs.getString("name"); // fetching name from resultset
                String city = rs.getString("city"); // fetching city from resultset

                System.out.println(
                        "Student id = " + id + " | " + "Student name = " + name + " | " + "Student city = " + city); // printing in terminal
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
