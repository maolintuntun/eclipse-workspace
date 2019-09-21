package maxProductCutRope;

public class CutRope {
	public int maxProduct(int length) {
		   // Write your solution here
		    int[] M = new int[length+1];      // 不是 new int array[length]
		     //M[0] = 0;
		     M[1] = 0;
		     M[2] = 1;
		      for( int i = 3; i <= length; i ++ ) {
		        int curMax = 0;                //忘记写int
		        for(int j = 1; j <= i/2; j++) {
		          int t = Math.max(M[j],j) * Math.max(M[ i - j ],i-j);
		       	if( t > curMax){
		            curMax = t;
		       	}
		   	   
		   	 }
		     M[i] = curMax;                //这句话到底放在哪个循环别搞错
		    
		   }
		 return M[length];               //不是return M；return放在哪个循环别搞错
		                                 //括号不要忘了闭合
		}
}
