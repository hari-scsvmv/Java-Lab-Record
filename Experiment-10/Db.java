import java.sql.*;
public class Db { static Connection open() throws SQLException{return DriverManager.getConnection("jdbc:mysql://localhost:3306/scsvmv_lab","root","root");} }

/*
Sample Input:
This helper class does not take input directly.
It opens a MySQL connection to:
jdbc:mysql://localhost:3306/scsvmv_lab
username: root
password: root

Sample Output:
No console output when used successfully.
If the connection fails, the calling program catches SQLException and prints the database error message.
*/