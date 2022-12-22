package flowcontrols;

import java.util.Scanner;

public class DisplayProductDetails {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter product ID");
	int id=s.nextInt();
	System.out.println("enter product name");
	String name=s.next();
	System.out.println("enter product price");
	int pr=s.nextInt();
	System.out.println("enter product quantity");
	int n=s.nextInt();
	System.out.println("enter product category");
	String c=s.next();
	System.out.println("enter product Brand");
	String b=s.next();
	System.out.println("product ID"+id);
	System.out.println("product name"+name);
	System.out.println("product price"+pr);
	System.out.println("product quantity"+n);
	System.out.println("product category"+c);
	System.out.println("product brand"+b);
}
}
