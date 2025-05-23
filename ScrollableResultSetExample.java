import java.sql.*;

public class ScrollableResultSetExample{
    public static void main(String[] args) {
        String url = "jdbc:mysql://Localhost:3306/rsdb";
        String uid = "root";
        String pwd = "sanju@mysql000";
        try{
            Connection con = DriverManager.getConnection(url,uid,pwd);
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery("Select * from employees");
            if(rs.first()){
                System.err.println("emp_id"+rs.getInt(1)+"name:"+rs.getString(2)+"salary="+rs.getFloat(3));
            }
            if(rs.last()){
                System.err.println("emp_id"+rs.getInt(1)+"name:"+rs.getString(2)+"salary="+rs.getFloat(3));
            }
            if(rs.previous()){
                System.err.println("emp_id"+rs.getInt(1)+"name:"+rs.getString(2)+"salary="+rs.getFloat(3));
            }
            if(rs.absolute(3)){
                System.err.println("emp_id"+rs.getInt(1)+"name:"+rs.getString(2)+"salary="+rs.getFloat(3));
            }
            if(rs.relative(2)){
                System.err.println("emp_id"+rs.getInt(1)+"name:"+rs.getString(2)+"salary="+rs.getFloat(3));
            }
            rs.close();
            stmt.close();
            con.close();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}

