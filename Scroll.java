import java.sql.*;


public class Scroll {
public static void main(String[] args) {
try {
Connection con = DBConnect.getConnection();
Statement stmt = con.createStatement(
ResultSet.TYPE_SCROLL_INSENSITIVE,
ResultSet.CONCUR_READ_ONLY
);
ResultSet rs = stmt.executeQuery("SELECT * FROM students");
rs.last();
System.out.println("Last Record: " + rs.getString(2));
rs.first();
System.out.println("First Record: " + rs.getString(2));
con.close();
} catch (Exception e) {
e.printStackTrace();
}
}
}