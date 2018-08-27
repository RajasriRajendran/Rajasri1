package org.prog;

public class PalindromeString {
	public static void main(String[] args) {
		String name = "RADAR";
		String Reverse = " ";
		int length = name.length();
		System.out.println(length);
		for(int i = length-1;i>=0;i--)
		{
			char ch = name.charAt(i);
			System.out.println(ch);
			Reverse = Reverse+ch;
		}
		System.out.println(Reverse);
		if(name.equals(Reverse))
		{
			System.out.println("its a palindrome String");
		}else {
			System.out.println("Not a palindrome");
		}
	}

}
