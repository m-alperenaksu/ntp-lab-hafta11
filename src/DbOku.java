import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbOku {

	static final  String DB_URL = "jdbc:mysql://localhost:3306/dersb";
	static final String USER = "root";
	static final String PASS = "alperen1234";
	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
		Statement st = con.createStatement();
		//String query = "select * from login";
		//String query = "select * from login where id = 101";
		String query = "select * from login where like '%li%'";
		ResultSet rs = st.executeQuery(query);
		while(rs.next()) {
			System.out.print(" ID: " + rs.getInt("id"));
			System.out.print(" ADI : " + rs.getString("adi"));
			System.out.print(" SOYADI : " + rs.getString("soyadi"));
			System.out.println(" ŞİFRE : " + rs.getString("sifre"));
		}
} 
	}
