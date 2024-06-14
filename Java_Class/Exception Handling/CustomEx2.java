package JavaBasics;

import java.util.Scanner;

public class CustomEx2 {
	int age;
	String name;
	Scanner sc=new Scanner(System.in);
  public void accpet()
  {
	  System.out.println("Enter your name:");
	  name=sc.nextLine();
	  System.out.println("Enter your Age:");
	  age=sc.nextInt();
  }
  public void validate() 
  {
	  if(age>=3)
	  {
		  System.out.println("You have grown to up to take education");
	  }
	  else
	  {
		  throw new ArithmeticException("You are Lucky!!!Enjoy your childhood!!");
	  }
  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomEx2 obj=new CustomEx2();
		obj.accpet();
		obj.validate();

	}

}
