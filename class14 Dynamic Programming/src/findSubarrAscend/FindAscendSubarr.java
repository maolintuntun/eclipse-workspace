package findSubarrAscend;

//Longest Ascending SubArray
public class FindAscendSubarr {
	public int longest(int[] array) {
	    // Write your solution here
		// �������ÿ��Ԫ�ر�ʾʲô��˼���ǵ�ĿǰΪֹ�����subarray����
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
	         cur = 1;                     // ��ɽ����
	      }
	      
	    } 
	    return max;
	    
	  }

}
