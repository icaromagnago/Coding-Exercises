package io.github.icaromagnago.palidrom;

public class Palindrome {

	public boolean testString(String string) {
		if(string == null || string.isEmpty()) {
			return false;
		}
		
		char[] charArray = string.toCharArray();
		StringBuilder stringBuilder = new StringBuilder();
		for(int i=charArray.length-1; i>=0; i--) {
			stringBuilder.append(charArray[i]);
		}
		
		return stringBuilder.toString().equals(string);
	}
}
