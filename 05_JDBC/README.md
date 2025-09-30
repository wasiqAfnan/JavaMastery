# Java JDBC & MySQL Connection Setup Guide

This guide will help you connect a Java program to a MySQL database using JDBC step-by-step. It is intended for beginners.

---

## Step 1: Install Java JDK

1. Download the latest Java JDK from the official Oracle website: [https://www.oracle.com/java/technologies/javase-jdk.html](https://www.oracle.com/java/technologies/javase-jdk.html)
2. Install it on your system following the installation instructions.
3. Verify installation:

   ```bash
   java -version
   javac -version
   ```

---

## Step 2: Set Java Environment Variables

1. Go to your JDK installation directory, e.g., `C:\Program Files\Java\jdk-<version>\bin`.
2. Copy the full path of the `bin` folder.
3. Open **Advanced System Settings → Environment Variables → System Variables → Path → New**.
4. Paste the path you copied.
5. Click **OK** to save.

---

## Step 3: Install MySQL

1. Download MySQL Community Server from [https://dev.mysql.com/downloads/mysql/](https://dev.mysql.com/downloads/mysql/).
2. During installation, choose **Custom Installation**:

   * Select **MySQL Server**, **Workbench**, **MySQL Shell**
   * You can also include **MySQL Connector/J (JAR)** if available.
3. Complete installation and remember your **root password**.

---

## Step 4: Download MySQL Connector/J

1. Download the **MySQL Connector/J (JAR)** file from [https://dev.mysql.com/downloads/connector/j/](https://dev.mysql.com/downloads/connector/j/)
2. Make sure the version matches your MySQL Server version.
3. Copy the **full path including file name**, e.g.,
   `C:\mysql-connector-java-8.1.0\mysql-connector-java-8.1.0.jar`

---

## Step 5: Set CLASSPATH Environment Variable

1. Go to **Advanced System Settings → Environment Variables → User Variables → New**
2. Set **Variable Name:** `CLASSPATH`
3. Set **Variable Value:** full path to `mysql-connector-java-<version>.jar` including the file name.
4. Click **OK** to save.

---

## Step 6: Verify MySQL Driver Installation

Open CMD and type:

```bash
javap com.mysql.cj.jdbc.Driver
```

* If output shows:

  ```
  Compiled from "Driver.java"
  public class com.mysql.cj.jdbc.Driver {
      public com.mysql.cj.jdbc.Driver() throws java.sql.SQLException;
      static {};
  }
  ```

  ✅ Driver is installed correctly.

* If it says **class not found**, re-check your CLASSPATH.

---

## Step 7: Verify MySQL Port

1. Default port is usually **3306**, but it may differ.
2. Ways to check port:

   * Open MySQL config file `my.ini` → look for `port=`
   * Run in terminal:

     ```bash
     netstat -ano | findstr mysqld
     ```
   * Check **MySQL Workbench → Server Status**

Make sure the port number matches your JDBC connection URL.

---

## Step 8: Create Database

Before running Java code, create a database named `my_db` in MySQL:

```sql
CREATE DATABASE my_db;
```

---

## Step 9: Java Code for JDBC Connection

```java
import java.sql.*;

public class jdbc_1_connection {
    public static void main(String[] args) {
        try {
            // Step 1: Load JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Setup URL, username, and password
            String url = "jdbc:mysql://localhost:3306/my_db"; // Replace port if needed
            String userName = "root"; // MySQL username
            String password = "root"; // MySQL password

            // Step 3: Create connection
            Connection con = DriverManager.getConnection(url, userName, password);

            // Step 4: Verify connection
            if(con.isClosed()) {
                System.out.println("Connection failed");
            } else {
                System.out.println("Connection Successful");
            }

            // Step 5: Close connection
            con.close();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
```

**Expected Output:**

```
Connection Successful
```

✅ Confirms successful connection to MySQL.

---

## Additional Tips for Beginners

1. **Use try-with-resources** for automatic resource management:

   ```java
   try(Connection con = DriverManager.getConnection(url, userName, password)) {
       // use connection
   } catch(Exception e) {
       e.printStackTrace();
   }
   ```
2. Always close **ResultSet** and **Statement** objects after use.
3. Check **firewall settings** if MySQL connection fails.
4. Keep **JDBC driver version compatible** with MySQL server version.
5. Use **PreparedStatement** for queries to prevent SQL injection.
