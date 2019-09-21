package maxProductCutRope;

public class CutRope {
	public int maxProduct(int length) {
		   // Write your solution here
		    int[] M = new int[length+1];      // ���� new int array[length]
		     //M[0] = 0;
		     M[1] = 0;
		     M[2] = 1;
		      for( int i = 3; i <= length; i ++ ) {
		        int curMax = 0;                //����дint
		        for(int j = 1; j <= i/2; j++) {
		          int t = Math.max(M[j],j) * Math.max(M[ i - j ],i-j);
		       	if( t > curMax){
		            curMax = t;
		       	}
		   	   
		   	 }
		     M[i] = curMax;                //��仰���׷����ĸ�ѭ������
		    
		   }
		 return M[length];               //����return M��return�����ĸ�ѭ������
		                                 //���Ų�Ҫ���˱պ�
		}
}
