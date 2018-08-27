package org.prog;

public class Factorial {
	public static void main(String[] args) {
		int sum = 1;
		for(int i = 1 ; i<7;i++)
		{
			sum = sum*i;
			System.out.println(sum);
		}
	System.out.println("The factorial is " +sum);
	}
	

}
