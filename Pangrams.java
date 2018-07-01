import java.util.HashSet;
import java.util.Set;

public class Pangrams {
	public boolean isPanagram(String panRef) {
		boolean isString = panRef instanceof String;
		if (!isString) {
			return false;
		}
		String str = panRef.toLowerCase().replaceAll("[^a-zA-Z]+", "");
		char[] panChar = str.toCharArray();
		Set panSet = new HashSet();
		for (char c : panChar) {
			panSet.add(c);
		}
		if (panSet.size() == 26)
			return true;
		else
			return false;
	}
}
