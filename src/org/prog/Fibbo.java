package org.prog;

public class Fibbo {
	public static void main(String[] args) {
		int a =0;
		int b = 1;
		int c;
		System.out.println(a);
		System.out.println(b);
		for(int i =0;i<100;i++)
		{
			c=a+b;
			if(c<100)
			System.out.println(c);
			a=b;
			b=c;
		}
	}

}
