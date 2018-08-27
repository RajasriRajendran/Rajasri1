package org.prog;

public class PalindromeNum {
	public static void main(String[] args) {
		int a = 141;
		int temp=a;
		int i,j = 0;
		while(a>0)
		{
			i = a%10;
			j = (j*10) +i;
			a = a/10;
			System.out.println(j);
			
		}
		System.out.println(j);
		if(temp==j)
		{System.out.println("its a palindrome");
}else
{System.out.println("Not a Palindrome");}
	}
}
