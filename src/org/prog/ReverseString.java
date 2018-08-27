package org.prog;

public class ReverseString {
	public static void main(String[] args) {
		String name ="RAJASRI";
		String name1=" ";
		int length = name.length();
		System.out.println(length);
		for(int i = length-1;i>=0;i--)
		{
			char ch = name.charAt(i);
			name1=name1+ch;
		}
		System.out.println(name1);
	}

}
