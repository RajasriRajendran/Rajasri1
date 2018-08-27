package org.prog;

public class Amstrong {
	public static void main(String[] args) {
		int a = 153;
		int temp = a;
		int i ,j = 0;
		while(a>0)
		{
			i = a%10;
			j=(i*i*i)+j;
			a = a/10;
			System.out.println(j);
		}
	System.out.println(j);
	
	if(temp==j) {
		System.out.println("Amstrong");
	}else
	{System.out.println("Not amstong");

	}
	}
}
