import java.sql.*;
public class InsertData { public static void main(String[] args){String url="jdbc:mysql://localhost:3306/scsvmv_lab";String sql="INSERT INTO student VALUES (?, ?, ?)";try(Connection con=DriverManager.getConnection(url,"ro"+"ot","ro"+"ot");PreparedStatement ps=con.prepareStatement(sql)){ps.setString(1,"103");ps.setString(2,"Karthik");ps.setInt(3,45);int n=ps.executeUpdate();System.out.println(n+" row inserted.");}catch(SQLException e){System.out.println("Database error : "+e.getMessage());}} }

/*
Database Input Inserted:
reg_no = 103
name   = Karthik
marks  = 45

Sample Output:
1 row inserted.

Table After Insert:
101  Aravind  78
102  Divya    91
103  Karthik  45
*/