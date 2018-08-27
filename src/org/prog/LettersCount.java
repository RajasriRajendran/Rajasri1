package org.prog;

public class LettersCount {
	public static void main(String[] args) {
		String name = "Welcome To Java Class @123";
		int capsLetter = 0;
		int smallLetter =0;
		int digit =0;
		int splchar = 0;
		//int splcount =0;
		int length=name.length();
		System.out.println(length);
		for(int i =0;i<name.length();i++) {
			char ch = name.charAt(i);
			
		if(Character.isUpperCase(ch)) {
			capsLetter++;
		}
		else if(Character.isLowerCase(ch)){
			smallLetter++;
		}else if(Character.isDigit(ch)){
			digit++;
		}else {
			splchar++;
		}
	
		}
		System.out.println(capsLetter);
		System.out.println(smallLetter);
		System.out.println(digit);
		System.out.println(splchar);
	}
}
