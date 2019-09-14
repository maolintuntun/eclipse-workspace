package power;

//Calculate a^b

public class pow {
	public int power(int a, int b) {
		if(b == 0) {
			return 1;
		}
		int half = power(a,b/2);
		if(b % 2 == 1) {
			return a * half * half;
		}else {
			return half * half;
		}
	}

}

//Time: O(logb)
//Space: O(logb)
