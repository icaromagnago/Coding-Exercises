package br.github.icaromagnago.arryaleftrotation;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * HackerRank
 * A left rotation operation on an array of size 
 * shifts each of the array's elements unit to the left. 
 * For example, if left rotations are performed on array [1, 2, 3, 4, 5], 
 * then the array would become [3, 4, 5, 1, 2].
 */
public class ArrayLeftRotationTest {

	@Test
	public void testArrayLeftRotationOf2() {
		int[] array = {1, 2, 3, 4, 5};
		int[] arrayAfterRotation = new ArrayLeftRotation()
				.arrayLeftRotation(2, array);
		
		//output [3, 4, 5, 1, 2]
		assertEquals(arrayAfterRotation[0], 3);
		assertEquals(arrayAfterRotation[1], 4);
		assertEquals(arrayAfterRotation[2], 5);
		assertEquals(arrayAfterRotation[3], 1);
		assertEquals(arrayAfterRotation[4], 2);
	}
	
	@Test
	public void testArrayLeftRotationOf4() {
		int[] array = {1, 2, 3, 4, 5};
		int[] arrayAfterRotation = new ArrayLeftRotation()
				.arrayLeftRotation(4, array);
		
		//output [5, 1, 2, 3, 4]
		assertEquals(arrayAfterRotation[0], 5);
		assertEquals(arrayAfterRotation[1], 1);
		assertEquals(arrayAfterRotation[2], 2);
		assertEquals(arrayAfterRotation[3], 3);
		assertEquals(arrayAfterRotation[4], 4);
	}
}
