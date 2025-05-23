import java.sql.*;
public class JDBCDemo2{
public static void main(String[] args){
try{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","sanju@mysql000");
Statement stmt = con.createStatement();
ResultSet rs = stmt.executeQuery("select * from employee");
while(rs.next()){
System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
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
