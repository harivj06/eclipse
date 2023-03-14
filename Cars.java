package hari;
import java.util.*;

public class Cars {
	String name;
	String color;
	int topspeed;
	
	public Cars(String name,String color,int topspeed) {
		this.name=name;
		this.color=color;
		this.topspeed=topspeed;
	}
	public void display() {
		System.out.println("name:" + this.name + " color:" + color + " topspeed" + topspeed);
	}
	public static void main(String []args) {
		System.out.println("enter the option 1.create,2.display,3.edit,4.delete");
		int i;
		System.out.println("enter the size");
		Scanner sc =new Scanner(System.in);
		int size =sc.nextInt();
		sc.nextLine();
		Cars looks[] =new Cars[size];
		
	
		
		System.out.println("create");
		for(i=0;i<looks.length;i++) {
			System.out.println("enter car name");
			String name=sc.nextLine();
			System.out.println("enter car color");
			String color=sc.nextLine();
			System.out.println("enter the topspeed");
			int topspeed=sc.nextInt();
			sc.nextLine();
			looks[i]=new Cars(name,color,topspeed);
		}
		
			System.out.println("display");
			for(int j=0;j<looks.length;j++) {
				looks[j].display();
			}

			System.out.println("edit");
			System.out.println("delete");
			System.out.println("enter the index to delete");
			int ind =sc.nextInt();
			for(int k=0;k<ind;k++) {
			if(ind  == looks.length) {
				for(int n=i;n<(size-1);n++) {
					looks[n]=looks[n+1];
					System.out.println("REMOVED ");
					break;
				}
			}}
			System.out.println("new list");
			for(i=0;i<(size-1);i++) {
				looks[i].display();
			}
	}

}
