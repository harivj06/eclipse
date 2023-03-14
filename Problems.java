package hari;
import java.util.*;

public class Problems {
//	public String toString() {
//		return "Hari";
//	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the value");
		int arr[] =new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int max =arr[0];
		 for (int i=0; i < arr.length; i++) {
		      System.out.print(arr[i]+"\t");
		      if(arr[i]>max) {
		    	  max=arr[i];
		      }
		    }
		 System.out.println("largest array"  +max);
	}
}

