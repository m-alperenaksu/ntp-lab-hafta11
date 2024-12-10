import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Anasayfa {
	static final  String DB_URL = "jdbc:mysql://localhost:3306/";
	static final String USER = "root";
	static final String PASS = "alperen1234";
	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
		Statement st = con.createStatement();
		String sql = "CREATE DATABASE DERSB";
		st.execute(sql);
		System.out.println("Database oluşturuldu....\n");
		
		

	}

}
