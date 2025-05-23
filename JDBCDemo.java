import java.sql.*;
public class JDBCDemo{
public static void main(String[] args){
try{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","sanju@mysql000");
Statement stmt = con.createStatement();
ResultSet rs = stmt.executeQuery("Select * from Student");
while(rs.next()){
System.out.println(rs.getInt(1)+" "+rs.getString(2));
}
rs.close();
stmt.close();
con.close();
}
catch(Exception e){
e.printStackTrace();
}
}
}
