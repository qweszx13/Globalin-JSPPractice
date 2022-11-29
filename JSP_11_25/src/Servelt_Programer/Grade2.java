package Servelt_Programer;

public class Grade2 {
	private int sum;
	int num1;
	int num2;
	int num3;
	
	public Grade2(int korea, int english, int math) {
		this.num1 = korea;
		this.num2 = english;
		this.num3 = math;
	}

	public String sum() {
		return ((num1+num2+num3)/3)+"";
	}
	
	public String result() {
		int sum = (num1+num2+num3)/3;
		
		if(sum>=90) {
			return "90점 이상 수";
		}else if(sum<90&&sum>=80) {
			return "90~80 우";
		}else if(sum<80&&sum>=70) {
			return "80~70 미";
		}else if(sum<70&&sum>=60) {
			return "70~60 양";
		}else if(sum<60) {
			return "60아래 가";
		}
		return "";
	}
	
	

}
