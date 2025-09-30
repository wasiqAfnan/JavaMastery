import java.sql.*;
import javax.swing.*;

public class jdbc_1_connection {
    public static void main(String[] args) {
        try {
            /* Step 1 */
            // loading jdbc sql drivers

            Class.forName("com.mysql.cj.jdbc.Driver");

            /* Step 2 */
            // setup url username and password

            // IMPORTANT: Verify MySQL port before setting the URL.
            // Default is 3306, but it can differ (e.g., 3406).
            // To check the port being used:
            // Path => C:\ProgramData\MySQL\MySQL Server 8.4\my.ini
            // 1. Open MySQL config file (my.ini) → look for "port="
            // 2. Or run in terminal: netstat -ano | findstr mysqld
            // 3. Or check MySQL Workbench → "Server Status"
            // Make sure the port here matches the actual MySQL port.

            String url = "jdbc:mysql://localhost:3406/my_db";
            String userName = "root";
            String password = "root";

            /* Step 3 */
            // creating connenction to the database named my_db

            Connection con = DriverManager.getConnection(url, userName, password);

            /* Step 4 */
            // checking connection has established or not.

            if (con.isClosed()) {
                System.out.println("Connection failed");
                JOptionPane.showMessageDialog(null, "Connection Successful", "Message", JOptionPane.ERROR_MESSAGE);
            } else {
                System.out.println("Connection Successful");
                JOptionPane.showMessageDialog(null, "Connection Successful", "Message", 1);
            }

            /* Step 5 */
            // closing the connection.

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
