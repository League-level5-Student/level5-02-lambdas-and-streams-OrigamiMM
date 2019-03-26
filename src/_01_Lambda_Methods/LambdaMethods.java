package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s)->{
			String a = "";
			for(int i = s.length()-1; i >-1; i --) {
				a += s.charAt(i) + "";
			}
			System.out.println(a);
		}, "backwards");
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s)->{
			String a = "";
			for(int i = 0; i < s.length(); i ++) {
				Character c = s.charAt(i);
				if(i % 2 ==0) {
					a += Character.toUpperCase(c) + "";
				}else {
					a += Character.toLowerCase(c) + "";
				}
			}
			System.out.println(a);
		}, "This should mix");
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((s)->{
			String a = "";
			for(int i = 0; i < s.length(); i ++) {
				a += s.charAt(i) + ".";
			}
			System.out.println(a);
		}, "There should be a period after each character");
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((s)->{
			String a = "";
			char[] vowels = new char[] {'a','e','i','o','u'};
			for(int i = 0; i < s.length(); i ++) {
				char c = s.charAt(i);
				for (int j = 0; j < vowels.length; j++) {
					if(c == vowels[j]) {
						break;
					}else if (c != vowels[j] && j == vowels.length-1) {
						a += c + "";
					}
				}
			}
			System.out.println(a);
		}, "There should be no vowels");
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
