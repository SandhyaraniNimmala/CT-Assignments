package exerc;

import java.util.Scanner;

public class NoOfWords {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter your string");
		String str=s.nextLine();
		String[] str1=str.split(" ");
		int count=0;
		for(int i=0;i<str1.length;i++) {
			count=count+1;
			
		}
		System.out.println("the no.of words in given string are : "+count);
	}

}