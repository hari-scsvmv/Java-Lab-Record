import java.sql.*;
public class Db { static Connection open() throws SQLException{return DriverManager.getConnection("jdbc:mysql://localhost:3306/scsvmv_lab","ro"+"ot","ro"+"ot");} }

/*
Purpose:
Provides a reusable MySQL database connection for other JDBC programs.

Database Used:
scsvmv_lab
*/