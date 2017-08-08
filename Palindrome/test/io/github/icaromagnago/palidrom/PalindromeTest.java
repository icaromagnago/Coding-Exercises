package io.github.icaromagnago.palidrom;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class PalindromeTest {

	private static String[] words = null;
	
	@BeforeClass
	public static void setUp() {
		words = new String[] {"level", "code", "reviver", "civic", "head", "", "life"};
	} 
	
	@Test
	public void test() {
		Palindrome palindrome = new Palindrome();
		int totalPalindromes = 0;
		int totalNonPalindromes = 0;
		
		for(int i=0; i<words.length; i++) {
			boolean isPalindrome = palindrome.testString(words[i]);
			if(isPalindrome) {
				totalPalindromes++;
			} else {
				totalNonPalindromes++;
			}
		}
		
		assertEquals(3, totalPalindromes);
		assertEquals(4, totalNonPalindromes);
	}

}
