package JavaBasics;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a Character: ");
        char ch = scanner.next().charAt(0);
        
        switch (ch) {
        case 'a' :
        case 'e' :
        case 'i' :
        case 'o' :
        case 'u' :
        case 'A' :
        case 'E' :
        case 'I' :
        case 'O' :
        case 'U' :
        	System.out.println(ch + "is a vowel");
        	break;
        default:
        	System.out.println(ch + "is a consonant");
        	break;
        }
        
        scanner.close();
	}

}
