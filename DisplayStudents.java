import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class DisplayStudents {
public static void main(String[] args) {
try {
Connection con = DBConnect.getConnection();
Statement stmt = con.createStatement();
ResultSet rs = stmt.executeQuery("SELECT * FROM students");
while (rs.next()) {
System.out.println(
rs.getInt(1) + " " + rs.getString(2)
);
}
con.close();
} catch (Exception e) {
e.printStackTrace();
}
}
}