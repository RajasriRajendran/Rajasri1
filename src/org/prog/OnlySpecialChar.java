package org.prog;

public class OnlySpecialChar {
	public static void main(String[] args) {
		String name = "asd yu @#$ hj*9 pl)&%$#";
		int splchar =0;
		for(int i = name.length()-1;i>0;i--)
		{
			char ch = name.charAt(i);
			if(!(Character.isAlphabetic(ch))||(Character.isDigit(ch)))
				splchar++;
		}
		
		System.out.println(splchar);
	}

}
