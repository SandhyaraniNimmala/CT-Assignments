package flowcontrols;
import java.util.*;
public class Avg {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int sum=0;
		System.out.println("enter five numbers :");
		for(int i=0;i<5;i++) {
			int n=s.nextInt();
			sum=sum+n;
		}
		int avg=sum/5;
		System.out.println("sum of the given numbers : "+sum);
		System.out.println("average of given numbers is : "+avg);
	}

}
