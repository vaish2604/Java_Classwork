package JavaBasics;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> emp= new HashMap<String,Integer>();
		
		emp.put("Mohan01",187455);
		emp.put("Raj02",287569);
		emp.put("Rohan23",4500);
		System.out.println("Map: " + emp);
		
		System.out.println("Keys: " + emp.keySet());
		
		System.out.println("Values: " + emp.values());
		
		System.out.println("Entries: " + emp.entrySet());
		
		int value = emp.remove("Raj02");
		System.out.println("Removed Value: " + value);
		

	}

}
