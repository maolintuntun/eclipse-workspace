package arrayHopperII;
//JUmp Game II
//一道思路非常奇怪的hard题，利口的更好办法是BFS O(n)
// this Time = n^2
public class MinJump {
	public int minJump(int[] array) {
		 
	    int[] minJump = new int[array.length];
	    minJump[0] = 0;
	    // notice!! i is not index, it is distance from the end
	    for(int i=1;i<array.length;i++){ 
	    	
	    	// this mean i can't reach out
	      	 minJump[i] = -1;
	      	 
	   	 for(int j=i-1; j>=0; j--){
	   		 
	   		      // if j guarantee to jump out(it jump number>i) && j can reach end
	    		  if( j+array[j]>=i && minJump[j]!=-1 ){
	    			  // if i can't reach out || i can reachout but go bridge through j is faster
	        			if(minJump[i]==-1||minJump[i]>minJump[j]+1){
	          				 minJump[i] = minJump[j]+1;
	        			}
	      		}
	   	 }
	    }
	    // not M[0] but M[last], the most left one.it means most far from destination
	    return minJump[array.length -1];
	  }
}
