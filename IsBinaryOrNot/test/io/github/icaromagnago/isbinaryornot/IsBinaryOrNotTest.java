package io.github.icaromagnago.isbinaryornot;

import static org.junit.Assert.*;

import org.junit.Test;

public class IsBinaryOrNotTest {
	
	private static int[] binNumbers = {100, 101, 110};
	private static int[] notBinNumbers = {102, 301, 015};

	@Test
	public void testIsBinary() {
		IsBinaryOrNot tester = new IsBinaryOrNot();
		
		for(int number : binNumbers) {
			assertTrue(tester.isBinary(number));
		}
	}
	
	@Test
	public void testIsNotBinary() {
		IsBinaryOrNot tester = new IsBinaryOrNot();
		
		for(int number : notBinNumbers) {
			assertFalse(tester.isBinary(number));
		}
	}
}
