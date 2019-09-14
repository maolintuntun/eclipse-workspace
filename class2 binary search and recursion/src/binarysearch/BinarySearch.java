package binarysearch;

public class BinarySearch {
	
	int binarySearch(int[] array, int target) {
		int left = 0;
		int right = array.length - 1;
		while(left <= right){ //whether I should add"=" use test case 用一个元素的数组来debug array={5}
			int mid = left + (right - left)/2;
			if(target == array[mid]) {
				return mid;
			}else if(target > array[mid]){
				left = mid + 1;
				
			}else if(target < array[mid]) {
				right = mid - 1;
			}
		}
		if(array[right] == target) {
			return right;
		}else if(array[left] == target) {
			return left;
		}else {
			return -1;
		}
	}

}
