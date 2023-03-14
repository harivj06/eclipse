import java.util.*;
public class Billing {
	int b,c,s,g;
	int quantity;
	Scanner sc =new Scanner(System.in);
	public void order() {
		System.out.println("Welcome to Great Girikalan Restaurant");
		System.out.println("what do you want to have?");
		ArrayList<String> al =new ArrayList<String>();
		al.add("1.briyani");
		al.add("2.chicken fired rice");
		al.add("3.shawarma");
		al.add("4.grill chicken");
		for(String choice :al) {
			System.out.println(choice);
		}
		int menu=sc.nextInt();
		while(menu<5) {
			System.out.println("how much you need?");
			int quantity =sc.nextInt();
		switch(menu) {
		case 1:
			System.out.println("Briyani:250");
			b=250*quantity;
			System.out.println(b);
			break;
		case 2:
			System.out.println("chicken fired rice :200");
			c=200*quantity;
			System.out.println(c);
			break;
		case 3:
			System.out.println("shawarma :100");
			s=100*quantity;
			System.out.println(s);
			break;
		case 4:
			System.out.println("grill chicken :180");
			g=180*quantity;
			System.out.println(g);
			break;
		default :
			System.out.println("Invalid ,Re confirm your order");
		}
		System.out.println("do you want to order again 1.yes, 2.no");
		int o =sc.nextInt();
		if( o==1) {
		System.out.println("1.briyani ,2.chicken fired rice , 3.sharwarma, 4.grill chicken");
		menu =sc.nextInt();
		}
		else {
			System.out.println("Thank you");
			break;
		}
	}
		System.out.println("your bill");
		double total =b+c+s+g;
		System.out.println(total);
		
}
	public static void main(String[] args) {
		Billing call =new Billing();
		call.order();
		

	}

}
