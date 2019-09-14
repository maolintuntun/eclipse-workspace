package selectionsort;


public class Selectionsort {
	 public int[] doSelectionsort(int[] array) 
	 {
	 	if(array == null || array.length == 0)
	 	{
	 		return array;
	 	}
	 	for( int i = 0 ; i <array.length -1;i++)
	 	{  
	 		int minIndx = i;
	 		for ( int j = i + 1 ; j < array.length ; j++)
	 		{
	 			if(array[j] <= array[minIndx])
	  			{
	 				minIndx = j;
	 			}
	 		}
	 		swap(array, minIndx , i );
	 	}
	 	return array;
	 }

	 public void swap ( int[] array , int a , int b )
	 {
	 	int temp = array[a];
	 	array[a] = array[b];
	 	array[b] = temp;
	 }


}
