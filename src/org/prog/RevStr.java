package org.prog;

public class RevStr {
	public static void main(String[] args) {
		String name = "Rajasri";
		String rev = "";
		int len = name.length();
		System.out.println(len);
		for (int i = len-1;i>=0;i--)
		{
			char ch = name.charAt(i);
			rev = rev+ch;
		}
System.out.println(rev);
		}

}
