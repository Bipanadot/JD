public class TestJDBC {
    
public static void main(String[] args) {
if (DBConnect.getConnection() != null) {
System.out.println("JDBC Connection Successful");
} else {
System.out.println("Connection Failed");
}
}
}