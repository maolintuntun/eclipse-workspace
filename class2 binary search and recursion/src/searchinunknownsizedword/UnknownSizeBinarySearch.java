//Search in Unknown Sized sorted array
/*
 * Binary search implementation on an dictionary with unknown size.
 * 
 * Assumption:
 * 
 * 1). The dictionary is an unknown sized sorted array, it only provides get(int index) functionality,
 *  if the index asked for is out of right bound, it will return null.
 * 
 * 2). The elements in the dictionary are all Integers.
 */
package searchinunknownsizedword;

import java.util.Arrays;

// what is this??
interface Dictionary {
	public Integer get(int index);
}

public class UnknownSizeBinarySearch {
	
	public static void main(String[] args) {
		UnknownSizeBinarySearch sol = new UnknownSizeBinarySearch();
		// test cases
		Dictionary dict = new DictImpl(new int[0]);
		int target = 0;
		System.out.println("Expect: -1, Actual: " + sol.search(dict, target));
		//expected -1
		
		dict = new DictImpl(new int[] { 1 });
		target = 0;
		System.out.println("Expect: -1, Actual: " + sol.search(dict, target));
		
		dict = new DictImpl(new int[] { 1 });
		target = 1;
		System.out.println("Expect: 0, Actual: " + sol.search(dict, target));
		
		dict = new DictImpl(new int[] { 1, 3, 4, 4, 6, 10, 11, 12, 15, 15 });
		target = 0;
		System.out.println("Expect: -1, Actual: " + sol.search(dict, target));	
	
	public int search(Dictionary dictionary, int target) {
		if(dictionary == null) {
			return -1;
		}
		int left = 0;
		int right = 1;
		//find the right boundary for binary search.
		//extends until we sure the target is within the [left,right] range.
		
		while (dictionary.get(right) != null && dictionary.get(right) < target) {
			// 1. move left to right
			// 2. double right index
			left = right;
			right = 2 * right;
		}
		return binarySearch(dictionary, target, left, right);
		
	}
	private int binarySearch(Dictionary dict, int target, int left, int right) {
		//classical binary search
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if(dict.get(mid) == null || dict.get(mid) > target) {
				right = mid - 1;
			} else if (dict.get(mid) < target) {
				left = mid + 1;
			} else {
				return mid;
			}
		};
		return -1;
	}

}

class DictImpl implements Dictionary {
	private int[] array;
	
	public DictImpl(int[] array) {
		this.array = array;
	}
	
	//if the index is out of bound, null will be returned.
	@Override
	public Integer get(int index) {
		if(array == null || index >= array.length) {
			return null;
		}
		return array[index];
	}
	
	// For pretty printout.
	@Override
	public String toString() {
		if (array == null) {
			return String.valueOf(null);
		}
		if (array.length <= 10) {
			return Arrays.toString(array);
		}
		
		//Truncate output if array is too large.
		
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < 5; i++) {
			sb.append(array[i]).append(", ");
			
		}
		sb.append("......, ");
		for (int i = array.length - 4; i < array.length; i++) {
			sb.append(array[i]);
			if(i != array.length - 1) {
				sb.append(", ");
			}
		}
		sb.append("]");
		return sb.toString();
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



