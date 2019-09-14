// k Closest in Sorted Array 
// myself version

package closestKelementoTarget;

public class ClosestK {
	
	public int[] solution(int[] array, int target,int k) {
		
		int close_element;
		if(array == null || array.length == 0) {
			return array; //how to write null use array format
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
				close_element = mid;
				
			}
			
		}
		int dis_left = Math.abs(target - array[left]);
		int dis_right = Math.abs(target - array[right]);
		if( dis_left >= dis_right) {
			close_element = left;
		}else {
			close_element = right;
		}
		int i = close_element + 1;
		int j = close_element - 1;
		int[] a = { close_element };
		int m = 1;
		while( a.length < k - 1) {
			if(array[i] == array[j]) {
				//put array[i] into new;
				a[m] = array[i];
				m++;
			}else if(array[i]<array[j]){
				//put array[i] into new;
				a[m] = array[i];
				m++;
			}else {
				//put array[j] into new;
				a[m] = array[j];
				m++;
			}
			
		}
		return a;
		
	}
	


}
