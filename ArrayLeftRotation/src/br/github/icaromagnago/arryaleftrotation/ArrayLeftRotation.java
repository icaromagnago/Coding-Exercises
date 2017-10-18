package br.github.icaromagnago.arryaleftrotation;

public class ArrayLeftRotation {
	public int[] arrayLeftRotation(int rotationNumber, int[] array) {
		for(int d=0; d<rotationNumber; d++) {
			for(int i=0; i<array.length-1; i++) {
				int temp = array[i];
				array[i] = array[i+1];
				array[i+1] = temp;
			}
		}
		
		return array;
	}
}
