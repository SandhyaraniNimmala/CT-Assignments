package exerc;
import java.util.*;
public class MatchesEx {

		public static void main(String[] args) {
			Scanner obj = new Scanner(System.in);
			String s="'welcome to careertuner'";
			System.out.println("the given string is "+s);
			System.out.println("enter the specified sequence of characters ");
		    String seq=obj.next();
		    String seq1="(.*)"+seq+"(.*)";
			boolean b=s.matches(seq1);
			System.out.println(b);
	        		
		}

	}

