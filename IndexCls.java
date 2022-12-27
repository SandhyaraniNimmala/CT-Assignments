package exerc;
import java.util.*;
public class IndexCls {
	public static void main(String[] args) {
		
		
		Scanner obj =new Scanner(System.in);
		System.out.println("enter your string");
		String str = obj.nextLine();
		System.out.println("Original String = " + str);
		
		System.out.println("enter the index of character from 0 to "+str.length());
		int index = obj.nextInt();
		
		System.out.println("The character at position "+index +" is :"+str.charAt(index));
		

}

}
