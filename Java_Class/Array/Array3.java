package JavaBasics;

import java.util.Scanner;

public class Array3 {

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
		
		int min=arr[0];
		for(i=1;i<5;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		
		
			System.out.println ("The Minimum Value is:"+min);
		
		
		
	}
}

