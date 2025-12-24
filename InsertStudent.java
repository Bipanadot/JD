import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertStudent {
public static void main(String[] args) {
try {
Connection con = DBConnect.getConnection();
String sql = "INSERT INTO students VALUES (?, ?)";
PreparedStatement ps = con.prepareStatement(sql);
ps.setInt(1, 1);
ps.setString(2, "Ram");
ps.executeUpdate();
System.out.println("Student inserted successfully");
con.close();
} catch (Exception e) {
e.printStackTrace();
}
}
}