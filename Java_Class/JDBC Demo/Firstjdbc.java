package JavaBasics;
import java.sql.*;

public class Firstjdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.cj.jdbc.Driver");
		   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/acpjava","root","root");
		  
		   
		         Statement stmt=con.createStatement();
		   
		   //step 4 execute Statement
		   
		   int a=stmt.executeUpdate("insert into emp values(5,'Saksh','Mechanical',334545)");
		   
		   System.out.println("Successfully added employee" +a);
		    //step 5
		   con.close();
	}

}
