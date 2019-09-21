package findSubarrAscend;

//Longest Ascending SubArray
public class FindAscendSubarr {
	public int longest(int[] array) {
	    // Write your solution here
		// 数组里的每个元素表示什么意思？是到目前为止的最大subarray长度
	    if(array.length == 0){
	      return 0;
	    }
	    int max = 1;
	    int cur = 1;
	    for(int i = 1; i < array.length; i++){
	      if(array[i] > array[i-1]){
	        cur++;
	         max = Math.max(max,cur);     //use Math.max
	      }else{
	         cur = 1;                     // 东山再起
	      }
	      
	    } 
	    return max;
	    
	  }

}
