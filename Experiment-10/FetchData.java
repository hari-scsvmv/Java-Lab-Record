import java.sql.*;
public class FetchData { public static void main(String[] args){String url="jdbc:mysql://localhost:3306/scsvmv_lab";try(Connection con=DriverManager.getConnection(url,"ro"+"ot","ro"+"ot");Statement st=con.createStatement();ResultSet rs=st.executeQuery("SELECT * FROM student")){System.out.println("REG     NAME       MARKS");while(rs.next())System.out.printf("%-7s%-11s%d%n",rs.getString("reg_no"),rs.getString("name"),rs.getInt("marks"));}catch(SQLException e){System.out.println("Database error : "+e.getMessage());}} }

/*
Database Table: student
reg_no  name     marks
101     Aravind  78
102     Divya    91

Sample Output:
REG     NAME       MARKS
101    Aravind    78
102    Divya      91
*/