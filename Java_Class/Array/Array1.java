package JavaBasics;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //initialization of an array
		
		int arr[]=new int[5];
		int i;
		Scanner sc=new Scanner(System.in);
				
		System.out.println("Enter five numbers:"); //12 15 14 19 17 arr[0] arr[1]
		
		for(i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		
		}
		System.out.println("You Have Entered:");
		
		for(i=0;i<5;i++)
			
		{
			System.out.println ("arr["+i+"]="+arr[i]);
		}
		
		
	}
}
