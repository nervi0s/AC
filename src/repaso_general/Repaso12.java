package repaso_general;

import java.util.Arrays;

public class Repaso12 {

	public static void main(String[] args) {
		int n = 1;
		System.out.println(Arrays.toString(toBinary(n)));
	}

	public static String[] toBinary(int number) {
		String binaryString = "";
		do {
			binaryString += number % 2;
			number /= 2;
		} while (number != 0);
		String[] binaryArray = reverseString(binaryString);
		return binaryArray;
	}

	public static String[] reverseString(String str) {
		String[] splitedString = str.split("");
		String[] arrayReversed = new String[splitedString.length];
		int j = 0;
		for (int i = splitedString.length - 1; i >= 0; i--) {
			arrayReversed[j] = splitedString[i];
			j++;
		}
		return arrayReversed;
	}
}
