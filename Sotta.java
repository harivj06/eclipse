package hari;

public class Sotta {

	public static void main(String[] args) {
		
		String var = "hari badu";
		int n =var.length();
		String rev ="";
		for(int i=n-1;i>=0;i--) {
			rev = rev+var.charAt(i);
		}
		System.out.println(rev);
	}

}
