package org.prog;

public class CountNum {
	public static void main(String[] args) {
		int a = 12345;
		int count =0;
		int i,j=0;
		while(a>0) {
			i=a%10;
			j=j+1;
			a=a/10;
			System.out.println(j);
		count++;
		}
		System.out.println(count);
	}

}
