package hari;

public class AccountHolder {

	public static void main(String args[]) {
		Bank bb =new Bank();
		int min =bb.getMinimumbalance();
		System.out.println(min);
		bb.setMinimumbalance(200);
		min =bb.getMinimumbalance();
		System.out.println(min);
	}
}
