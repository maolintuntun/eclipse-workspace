package spiralOrderTraverse;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<Integer> spiral(int[][] matrix) {
	    // Write your solution here
	    //return a list
	    List<Integer> list = new ArrayList<Integer>();
	    recursiveTraverse(matrix, 0, matrix.length, list);
	    return list;
	  }
	  private void recursiveTraverse(int[][]matrix, int offset, int size, List<Integer> result){
	    if(size <= 1){
	      if(size == 1){
	        result.add(matrix[offset][offset]);
	        return;
	      }else{
	        return;
	      }
	    }
	    for(int i = 0; i< size-1; i++){
	      result.add(matrix[offset][offset+i]);
	   
	    }
	    for(int i = 0; i< size-1; i++){
	      result.add(matrix[offset+i][offset+size-1]);
	      
	    }
	    for(int i = size-1; i>=1; i--){
	      result.add(matrix[offset+size-1][offset+i]);
	      
	    }
	    for(int i = size-1; i>=1; i--){
	      result.add(matrix[offset+i][offset]);
	      
	    }
	    recursiveTraverse(matrix, offset+1, size-2, result);

	  }
	   

}
