package arrayHopperI;

public class Jump {
	public boolean canJump(int[] array) {
	    // Write your solution here
	    boolean[] M = new boolean[array.length];  // zero,false,null/ this is a false array
	    M[array.length-1]=true;
	    
	    for(int i=array.length-2;i>=0;i--){
	    	
	      if(i+array[i]>=array.length-1){   // ���if �ǳ���Ҫ ��Ҫ����
	        M[i] = true;
	      }
	      else{
	    	  
	        for(int j=i+1;j<=i+array[i];j++){
	          if(M[j]==true){
	            M[i]=true;
	            break;                     // �ǵ�break
	          }
	        }
	        
	      }
	    }
	    return M[0];

	  }

}
