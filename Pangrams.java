import java.util.HashSet;
import java.util.Set;

public class Pangrams {

	public static void main(String[] args) {
		String panRef = "The quick brown fox jumps over the lazy dog";
		String str=panRef.toLowerCase().replaceAll(" ", "");
		char [] panChar=str.toCharArray();
		Set panSet=new HashSet();
		for (char c : panChar) {
			panSet.add(c);
		}
		  if(panSet.size() == 26)
	           System.out.println("pangram");
	        else
	            System.out.println("not pangram");
	}

}
	

