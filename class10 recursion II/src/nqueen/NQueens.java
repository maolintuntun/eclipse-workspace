package nqueen;

import java.util.ArrayList;
import java.util.List;

public class NQueens {
	public List<List<Integer>> nqueens(int n){
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		
		List<Integer> cur = new ArrayList<Integer>();
		helper(n, cur, result);
		return result;
	}
	private void helper(int n, List<Integer> cur, List<List<Integer>> result) {
		//base case: when for all the rows we know where the queen is positioned.
		if(cur.size()==n) {
			result.add(new ArrayList<Integer>(cur));
			return;
		}
		for(int i = 0; i < n; i++) {
			//check if putting a queen at column i at current row is valid.
			if(valid(cur, i)) {
				cur.add(i);
				helper(n, cur, result);
				cur.remove(cur.size()-1);
			}
		}
		
	}
	private boolean valid(List<Integer> cur, int column) {
		int row = cur.size();
		for(int i = 0; i < row; i++) {
			if(cur.get(i)==column || Math.abs(cur.get(i)-column)==row-i) {
				return false;
			}
		}
		return true;
	}

}
