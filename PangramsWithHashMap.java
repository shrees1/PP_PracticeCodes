import java.util.HashMap;
import java.util.Map;

public class Pangrams {

	public static void main(String[] args) {
		String panRef = "The quick brown fox jumps over the lazy dog";
		String compRef ="abcdefghijklmnopqrstuvwxyz";
		String str=panRef.toLowerCase().replaceAll(" ", "");
		System.out.println(arePanagrams(str, compRef));
	}
	private static boolean arePanagrams(String panStr, String compStr) {
		Map<Character, Integer> panmap = new HashMap<>();
		Map<Character, Integer> compmap = new HashMap<>();
		for (char c : panStr.toCharArray()) {
			if (panmap.containsKey(c)) {
				panmap.put(c, panmap.get(c) + 1);
			} else {
				panmap.put(c, 1);
			}
		}
		for(char c: compStr.toCharArray())
			if(!compmap.containsKey(c))
				return true;
		
			else
			{
				compmap.put(c, compmap.get(c) - 1);
			
				if(compmap.get(c) == 0)
					compmap.remove(c);
			}
		
		return compmap.isEmpty();
	}
}
	

