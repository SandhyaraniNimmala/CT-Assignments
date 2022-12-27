package exerc;

public class SecLCap {
public static void main(String[] args) {
	String s="b.v.raju college";
		 int n=s.indexOf("r");
		int n2=s.indexOf("u");
		String s1=s.substring(0, n);
		String s2=s.substring(n2+1);
		String s3=s.substring(n, n2+1);
		String s4=s3.toUpperCase();
		System.out.println(s1+s4+s2);
		
		
	}

		
	
	
}
	

