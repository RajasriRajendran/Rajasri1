package org.prog;

public class PalindromeFrom1to1000 {
	public static void main(String[] args) {
		for(int k = 1; k<1000;k++) {
			int a = k;
			int temp = a;
			int i,j = 0;
			while(a>0)
			{
				i=a%10;
				j=(j*10)+i;
				a=a/10;
			}
			if(temp==j)
				System.out.print(j+",");
		}
	}

}
