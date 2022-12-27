package exerc;



public class Secondocc2 {
	 String str="bvit college";
	 char ch='l';
	 int N=2;
	void  findNthOccur()
	{
	    int occur = 0;
	
	    for (int i = 0; i < str.length(); i++)
	    {
	        if (str.charAt(i) == ch)
	        {
	            occur += 1;
	        }
	        if (occur == N) {
	        	int n=i;
	        	String s2=str.substring(0, n);
	        	String s3=str.substring(n+1);
	        	char ch3=Character.toUpperCase(ch);
	        	String s4=s2+ch3+s3;
	        	System.out.println(s4);
	        	break;
	        	
	    }

	}
	 
		
		
	}
public static void main(String[] args) {
	Secondocc2 ss=new Secondocc2();
	ss.findNthOccur();
}
	


}
