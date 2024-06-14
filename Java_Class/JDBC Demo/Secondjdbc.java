package JavaBasics;
import java.sql.*;

public class Secondjdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
     
		String driverClassName = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/acpjava";
		String username = "root";
		String password = "root";
		
		
		Class.forName(driverClassName);
		
		Connection con = DriverManager.getConnection(url, username, password);
		
		Statement st = con.createStatement();
		
		int data=st.executeUpdate ("insert into Students values(509,'Ramesh')");
		System.out.println("record inserted sucessfully");
		
		con.close();
	}

}
