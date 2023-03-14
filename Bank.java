package hari;

public class Bank {

	private	int minimumbalance =2500;
	
public int getMinimumbalance() {
	return this.minimumbalance;
}
public void setMinimumbalance(int value) {
	if(value>2500){
	this.minimumbalance=value;
	}
}
}
