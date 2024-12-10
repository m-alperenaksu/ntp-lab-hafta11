import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LabSoru {

	static final  String DB_URL = "jdbc:mysql://localhost:3306/dersb";
	static final String USER = "root";
	static final String PASS = "alperen1234";
	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
		Statement st = con.createStatement();
		String query = "select * from login where like '%li%'";
		ResultSet rs = st.executeQuery(query);
		String ad1,soyad1,sifre1;
		
		System.out.println("Adınızı giriniz: ");
		System.out.println("Soyadınızı giriniz: ");
		System.out.println("Şifre giriniz: ");
		
		
		
		
		
		
		
		
		
		
		while(rs.next()) {
			System.out.print(" ID: " + rs.getInt("id"));
			System.out.print(" ADI : " + rs.getString("adi"));
			System.out.print(" SOYADI : " + rs.getString("soyadi"));
			System.out.println(" ŞİFRE : " + rs.getString("sifre"));
		}
} 
	}