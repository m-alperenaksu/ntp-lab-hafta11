import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Tablo {
	static final  String DB_URL = "jdbc:mysql://localhost:3306/dersb";
	static final String USER = "root";
	static final String PASS = "alperen1234";
	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
		Statement st = con.createStatement();
		String sql1 = "create table login (id integer not null, " + 
		"adi VARCHAR(30), soyadi VARCHAR(40), sifre VARCHAR(30), primary key(id))";
		st.execute(sql1);
		
		
		
	}
}