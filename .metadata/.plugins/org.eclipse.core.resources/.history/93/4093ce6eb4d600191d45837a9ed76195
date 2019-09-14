package subsetsI;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<String> subSets(String set) {
		List<String> result = new ArrayList<String>();
		if(set == null) {
			return result;
		}
		char[] arraySet = set.toCharArray();
		
		//record the current subset.
		StringBuilder sb = new StringBuilder();
		helper(arraySet, sb, 0, result);
		return result;
	}
	
	// at each level, determine the character at the position"index" to be picked or not
	private void helper(char[] set, StringBuilder sb, int index, List<String>result) {
		
		if(index == set.length) {
			result.add(sb.toString());
			return;
		}
		//第一种：add set[index] to the result list
		sb.append(set[index]);
		helper(set, sb, index + 1, result);
		sb.deleteCharAt(sb.length()-1);
		
		//第二种: do not add set[index] to the result list
		helper(set, sb, index + 1, result);	
		
	}

}
