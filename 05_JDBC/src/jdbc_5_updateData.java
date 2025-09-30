import java.sql.*;
import java.util.Scanner;
public class jdbc_5_updateData {
    public static void main(String[] args) {
        try{// loading jdbc sql drivers

            Class.forName("com.mysql.cj.jdbc.Driver");

            // setup url username and password

            String url = "jdbc:mysql://localhost:3406/my_db";
            String userName = "root";
            String password = "root";

            // creating connenction to the database named my_db

            Connection con = DriverManager.getConnection(url, userName, password);

            // checking connection has established or not.

            if(con.isClosed()){
                System.out.println("Connection failed");
            }
            else{
                System.out.println("Connection Successful");
            }

            // preparing sql query

            String query = "update my_table set name = ?, city = ? where slno = ?";

            // preparing query

            PreparedStatement pstmt = con.prepareStatement(query);

            // taking input from user

            Scanner in = new Scanner(System.in);
            String name,city;
            int id;

            name = in.nextLine();
            city = in.nextLine();
            id = in.nextInt();

            // setting up values in query

            pstmt.setString(1, name);
            pstmt.setString(2, city);
            pstmt.setInt(3, id);

            // executing query

            pstmt.executeUpdate();

            System.out.println("Updated successful");

        }catch(Exception e){
            e.printStackTrace();
        }

    }
    
}
