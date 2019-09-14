//Find an element that is closest to the target number.
// this can be the target itself
// L  T  R
// ↑  ↑  
package closesttoTarget;

public class Closest {
	public int close(int[] array, int target) {
		if(array == null || array.length == 0) {
			return -1;
		}
		int left = 0;
		int right = array.length - 1;
		while( left < right - 1) {
			int mid = left + (right - left)/2;
			if(array[mid] < target) {
				left = mid;
			}else if(array[mid] > target) {
				right = mid;
			}else {
				return mid;
			}
			
		}
		int dis_left = Math.abs(target - array[left]);
		int dis_right = Math.abs(target - array[right]);
		if( dis_left >= dis_right) {
			return left;
		}else {
			return right;
		}
		
	}
}
