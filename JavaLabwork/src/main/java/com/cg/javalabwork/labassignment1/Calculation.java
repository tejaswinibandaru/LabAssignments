package com.cg.javalabwork.labassignment1;

public class Calculation {
	public int calculateSum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		return sum;
	}
	
	public boolean validateNumber(int number) {
		int[] numberIntegerArray=new int[10];
		int i=0;
		while(number!=0) {
			numberIntegerArray[i]=number%10;
			i++;
			number=number%10;
		}
		for(int j=0;j<i;j++) {
			if(numberIntegerArray[j]>=numberIntegerArray[j+1]) {
				return true;
			}
		}
		return false;
	}

	public int calculateDifference(int n) {
		int sum1 = (n * (n + 1) * (2 * n + 1)) / 6;
		int sum2 = 0;
		for (int i = 1; i <= n; i++) {
			sum2 += i;
		}
		sum2 = sum2 * sum2;
		return (sum2 - sum1);
	}

	public static void main(String[] args) {
		Calculation c = new Calculation();
		int n = Integer.parseInt(args[0]);
		int sum = c.calculateSum(n);
		System.out.println(sum);
		int diff = c.calculateDifference(n);
		System.out.println(diff);
		int number=133468;
		if(c.validateNumber(number)) {
			System.out.println("Valid number");
		}else {
			System.out.println("Not a valid number");
		}
	}
}