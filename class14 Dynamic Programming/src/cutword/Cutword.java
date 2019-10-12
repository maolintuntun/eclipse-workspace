package cutword;

import java.util.HashSet;

public class Cutword {
	public boolean wordSolver(String word, HashSet<String> dict) {
		boolean[] M = new boolean[word.length()+1];
		
		for(int i=1; i<=word.length();i++) {
			
			if(dict.contains(word.substring(0,i))) {
				M[i] = true;
				continue;
			}
			
			for(int j=1;j<i;j++) {
				if(M[j]==true && dict.contains(word.substring(j,i))) {
					M[i]=true;
					break;
				}
			}
		}
		return M[word.length()];
	}

}
