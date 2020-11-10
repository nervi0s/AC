package repaso_general;

import java.util.Scanner;

public class Repaso11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		int number = sc.nextInt();
		if (isPair(number)) {
			System.out.println(number + " es par");
		} else {
			System.out.println(number + " es impar");
		}
		sc.close();
	}

	public static boolean isPair(int number) {
		return number % 2 == 0 ? true : false;
	}
}
