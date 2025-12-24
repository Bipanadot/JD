import java.sql.*;


public class MetaDataDemo {
public static void main(String[] args) {
try {
Connection con = DBConnect.getConnection();
DatabaseMetaData dbmd = con.getMetaData();
System.out.println("DB Name: " + dbmd.getDatabaseProductName());
System.out.println("DB Version: " + dbmd.getDatabaseProductVersion());
con.close();
} catch (Exception e) {
e.printStackTrace();
}
}
}