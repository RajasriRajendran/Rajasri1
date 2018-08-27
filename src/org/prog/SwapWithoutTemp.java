package org.prog;

public class SwapWithoutTemp {
	public static void main(String[] args) {
		int a =70,b =50;
		a = a+b;
		b= a-b;
		a= a-b;
		System.out.println(a);
		System.out.println(b);
	}

}
