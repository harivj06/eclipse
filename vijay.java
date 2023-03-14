package hari;
import java.util.*;

public class vijay {
	String name;
	int rollno;
	
	public  vijay(String name , int rollno) {
	 this.name=name;
	 this.rollno=rollno;
	 
		
	}

	public static void main(String[] args) {
		Scanner user =new Scanner(System.in);
		System.out.println("enter the username");
		String id=user.next();
		System.out.println("enter the rollno");
		int num =user.nextInt();
		vijay s1=new vijay(id,num);
		System.out.println("student name:"+s1.name+" and rollno:"+s1.rollno);
	}

}
