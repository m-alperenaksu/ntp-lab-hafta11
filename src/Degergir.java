import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Degergir {
	static final  String DB_URL = "jdbc:mysql://localhost:3306/dersb";
	static final String USER = "root";
	static final String PASS = "alperen1234";
	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
		Statement st = con.createStatement();
		String sql1 = "insert into login values (101,'Ahmet1','Mehmet1','123456db')";
		st.executeUpdate(sql1);
		String sql2 = "insert into login values (102,'Ahmet1','Mehmet1','123456db')";
		st.executeUpdate(sql2);
		String sql3 = "insert into login values (103,'Ali','Veli','12345db')";
		st.executeUpdate(sql3);
}
	}
