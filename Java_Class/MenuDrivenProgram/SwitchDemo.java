package JavaBasics;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a,b,ans,choice;
    Scanner sc =new Scanner(System.in);
    System.out.println("Welcome to Omline Calculator!!!");
    System.out.println("Press 1.Addition  /n 2.Substraction /n3.Multiplication /n 4.Division");
    System.out.println("Enter your choice");
    choice=sc.nextInt();
    
    switch(choice)
    {
    
    case 1:
    	System.out.println("Enter two numbers:");
    	a=sc.nextInt();
    	b=sc.nextInt();
    	ans=a+b;
    	System.out.println("The addition is:"+ans);
    	break;
    	
    case 2:
    	System.out.println("Enter two numbers:");
    	a=sc.nextInt();
    	b=sc.nextInt();
    	ans=a-b;
    	System.out.println("The Substraction is:"+ans);
    	break;
    	
    case 3:
    	System.out.println("Enter two numbers:");
    	a=sc.nextInt();
    	b=sc.nextInt();
    	ans=a*b;
    	System.out.println("The Multiplication is:"+ans);
    	break;
    	
    case 4:
    	System.out.println("Enter two numbers:");
    	a=sc.nextInt();
    	b=sc.nextInt();
    	ans=a/b;
    	System.out.println("The Division is:"+ans);
    	break;
    default:
    	System.out.println("Please enter proper choice!!!");
    	break;
    	
    }
    
	}

}
