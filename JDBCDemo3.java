import java.sql.*;
public class JDBCDemo3{
public static void main(String[] args){
try{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb2","root","sanju@mysql000");
Statement stmt = con.createStatement();
ResultSet rs = stmt.executeQuery("select * from studentmarks");
while(rs.next()){
System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getInt(6)+" "+rs.getInt(7)+" "+rs.getInt(8)+" "+rs.getBigDecimal(9));
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

