package mostCommonWord;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
	public String mostCommonWord(String paragraph, String[] banned) {
		paragraph += ".";

		Set<String> banset = new HashSet();
		for (String word: banned) banset.add(word);
		Map<String, Integer> count = new HashMap();

		String ans = "";
		int ansfreq = 0;

		StringBuilder word = new StringBuilder();
		for (char c: paragraph.toCharArray()) {
		    if (Character.isLetter(c)) {
		        word.append(Character.toLowerCase(c));
		    } else if (word.length() > 0) {
		        String finalword = word.toString();
		        if (!banset.contains(finalword)) {
		            count.put(finalword, count.getOrDefault(finalword, 0) + 1);
		            if (count.get(finalword) > ansfreq) {
		                ans = finalword;
		                ansfreq = count.get(finalword);
		            }
		        }
		        word = new StringBuilder();
		    }
		}

		return ans;
		
		
	}
	

}




       //split paragraph
		String[] words = paragraph.toLowerCase().split("\\W+");
		
		//add banned words to Set
		Set<String> set = new HashSet<>();
		for(String word:banned) {
			set.add(word);
		}
		
		//add paragraph words to hash map
		Map<String, Integer> map = new HashMap<>();
		for(String word:words) {
			if(!set.contains(word)) {
				map.put(word, map.getOrDefault(word, 0) + 1);
			}
		}
		
		// get the most frequent word
		int max = 0; // max frequent
		String res = "";
		for(String str:map.keySet()) {
			if(map.get(str)<max) {
				max = map.get(str);
				res = str;
			}
		}
		
		return res;




