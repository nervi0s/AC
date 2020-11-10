package repaso_general;

import java.util.Random;
import java.util.Scanner;

public class Repaso7 {

	public static void main(String[] args) {
		int intentos = 1;
		String continuar = "SI";
		int randomNumber = getRandomNum(0, 1000);
		System.out.println(randomNumber);
		int userNumber;
		do {
			System.out.println("Adivima un número entre 1 y el 1000");
			userNumber = new Scanner(System.in).nextInt();
			if (userNumber < randomNumber) {
				System.out.println("El número es mayor");
			} else if (userNumber > randomNumber) {
				System.out.println("El número es menor");
			} else {
				randomNumber = getRandomNum(0, 1000);
				System.out.println(randomNumber);
				System.out.println("Has adivinado el número en el intento: " + intentos);
				System.out.println("Quieres continuar? (SI/NO): ");
				continuar = new Scanner(System.in).nextLine();
				intentos = 0;
			}
			intentos++;
		} while (userNumber != randomNumber && continuar.equals("SI"));

		System.out.println("Fin del programa");

	}

	public static int getRandomNum(int a, int b) {
		Random r = new Random();
		int result = r.nextInt(b - a) + a;
		return result;
	}
}
