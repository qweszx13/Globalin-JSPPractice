package Servelt_Programer;

public class Grade {
	private int sum;
	int num1;
	int num2;
	int num3;
	
	public Grade(int korea, int english, int math) {
		this.num1 = korea;
		this.num2 = english;
		this.num3 = math;
	}

	public String sum() {
		return ((num1+num2+num3)/3)+"";
	}
	
	

}
