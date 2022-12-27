package exerc;

public class Capitalize {
		public static void main(String[] args) {
			String str="java standard edition";
			String[] str1=str.split(" ");
			for (String s: str1) {
				String str2=s.substring(0,1);
				String str3=str2.toUpperCase();
				String str4=s.substring(1,s.length());
				System.out.print(str3+str4+" ");
			}
		
		}

	}


