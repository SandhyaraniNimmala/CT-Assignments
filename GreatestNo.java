package flowcontrols;

import java.util.Scanner;

public class GreatestNo {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter three numbers");
		int x=s.nextInt();
		int y=s.nextInt();
		int z=s.nextInt();
		if(x>y) {
			if(x>z) {
				System.out.println(x+" is Greatest number");
			}
			else {
				System.out.println(z+" is greatest number");
			}
		}
		else {
			if(y>z) {
				System.out.println(y+" is greatest number");
			}
			else {
				System.out.println(z+" is greatest number");
			}
		}
		
	}

}
