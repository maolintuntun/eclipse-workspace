package hashmapAPI;

import java.util.HashMap;
import java.util.Map;

public class main {
	public static void main(String[] args) {
		Map<String, Integer> employerNumbers = new HashMap<>();
		employerNumbers.put("snapchat", 3);
		
		System.out.println(employerNumbers.get("snapchat"));
		
		employerNumbers.put("google", 2);
		System.out.println(employerNumbers);
		
		//sc is 3, which is overlapped value
		Integer sc = employerNumbers.put("snapchat", 2);
		System.out.println(sc);
		
		sc = employerNumbers.get("snapchat");
		Integer fc = employerNumbers.get("facebook");
		
		//fc is null
		System.out.println(fc);
		
		//fe is false
		boolean fe = employerNumbers.containsKey("google");
		System.out.println(fe);
		
		
		
	}

}
