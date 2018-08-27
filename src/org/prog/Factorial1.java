package org.prog;

public class Factorial1 {
	public static void main(String[] args) {
		int sum = 1,i=1;
		while(i<7)
		{
			//i=1;
			sum=sum*i;
			i++;
			System.out.println(sum);
		}
	System.out.println("The Factorial is" +sum);
	}

}
