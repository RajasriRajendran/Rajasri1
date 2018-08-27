package org.prog;

public class SumDigit {
	public static void main(String[] args) {
		int a = 12345;
		int i,j =0;
		while(a>0)
		{
			i = a%10;
			j = j+i;
			a = a/10;
			System.out.println(j);
		}
		System.out.println(j);
	}

}
