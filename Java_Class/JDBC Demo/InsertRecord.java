package JavaBasics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class InsertRecord {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
Class.forName("com.mysql.cj.jdbc.Driver");

    Connection  con= DriverManager.getConnection("jdbc:mysql://localhost/acpjava", "root", "root");
    		
    PreparedStatement pstmt=con.prepareStatement("insert into customer values(?,?,?,?,?)");
    
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter employee id:");
     String id=sc.next();
     
     System.out.println("Enter employee Name:");
     String name=sc.next();
     
     System.out.println("Enter employee designation:");
     String desig=sc.next();
     
     System.out.print("Enter employee department:");
     String dept=sc.next();
     
     System.out.println("Enter employee salaey:");
     int sal=sc.nextInt();;
     
     pstmt.setString(1, id);
     pstmt.setString(2, name);
     pstmt.setString(3, desig);
     pstmt.setString(4, dept);
     pstmt.setInt(5, sal);
     
     int r=pstmt.executeUpdate();
     con.close();
     System.out.println(r+"record added sucessfully!!!!");
	}

}
