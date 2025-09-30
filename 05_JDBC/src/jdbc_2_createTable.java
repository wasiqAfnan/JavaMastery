/*
 * In this file we will learn how we can create a table using jdbc
 * first we need to connect to database which we discuss earlier in the code
 * now there are 3 methods to excute a query in jdbc
 * 1) using Statement class -> we use this method to execute a simple query
 * 2) using PreparedStatement class -> we use this method to excute more complex or dynamic queries
 * 3) usning CallableStatement class -> we use this method if we want to call any function in the database 
 * 
 */

import java.sql.*;

public class jdbc_2_createTable {
    public static void main(String[] args) {
        try {
            // loading jdbc sql drivers

            Class.forName("com.mysql.cj.jdbc.Driver");

            // setup url username and password

            String url = "jdbc:mysql://localhost:3406/my_db";
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

            String query = "Create table my_table (slno int(20) primary key auto_increment,name varchar(30) not null,city varchar(20) not null)";

            // craeting a statement

            Statement stmt = con.createStatement();

            // executing query

            /*
             * executeUpdate() excutes the query and returns the number of rows affected in
             * the db
             * if we fetch (select query) data from the db then we have to use
             * executeQuery() instead of executeUpdate()
             */

            stmt.executeUpdate(query);

            System.out.println("Query executed successful");

            // closing the connection.

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
