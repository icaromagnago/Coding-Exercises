package io.github.icaromagnago.isbinaryornot;

public class IsBinaryOrNot {

	public boolean isBinary(int number) {
		Integer integer = new Integer(number);
		return integer.toString().matches("[0-1]*");
	}
}
