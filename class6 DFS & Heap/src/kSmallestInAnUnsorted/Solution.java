package kSmallestInAnUnsorted;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
	//return array
	public int[] kSmallest(int[] array , int k) 
	{
		if(array.length == 0 || k == 0)
		{
			return new int[0];
		}
		
		
		//max heap use constructor
		
		PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>( k, new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				if(o1.equals(o2)) {
					return 0;
				}
				return o1 > o2? -1 : 1 ;
			}
			
		});
				
				
				
				
	}

}
