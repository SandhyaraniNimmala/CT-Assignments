package exerc;
import java.util.Scanner;

public class CapitalLetters {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter your string");
		String s=scan.next();
		for(int i=0;i<s.length();i++) {
			if(Character.isUpperCase(s.charAt(i)) ){
				System.out.println(s.charAt(i));
			}
		}
	}

}
 