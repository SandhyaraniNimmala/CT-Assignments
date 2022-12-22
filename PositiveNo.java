package flowcontrols;

import java.util.*;
 public class PositiveNo {
	 public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter any number : ");
		int n=s.nextInt();
		if(n>=0) {
			System.out.println(" it is positive number");
		}
		else {
			System.out.println("it is negative number");
		}
	}
 }