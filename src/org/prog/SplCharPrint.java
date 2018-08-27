package org.prog;

public class SplCharPrint {
	public static void main(String[] args) {
		String name = "rajasri @ 12 *&^";
		String splchar = "";
		int spcount=0;
		
		System.out.println("Len of string" + name.length());
		for(int i=0;i<name.length();i++)
		{
			char ch = name.charAt(i);
			if(!(Character.isLowerCase(ch)||Character.isDigit(ch))) {
			System.out.println(ch);
			spcount++;
			splchar = splchar+ch;
			}
		}
		System.out.println("Total count of special character " + splchar);
				System.out.println(spcount);
}

}
