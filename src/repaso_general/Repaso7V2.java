package repaso_general;

import java.util.Random;
import java.util.Scanner;

public class Repaso7V2 {
	public static void main(String[] args) {
		int lowerLimitNumber = 0;
		int upperLimitNumber = 1000;
		int randomNumber = new Random().nextInt(upperLimitNumber - lowerLimitNumber + 1) + lowerLimitNumber;
		int userNumber;
		boolean play = true;
		String option;
		int attempts = 0;
		Scanner sc = new Scanner(System.in);

		do {
			attempts++;
			System.out.print("Adivina un número entre 0 y 1000: ");
			userNumber = sc.nextInt();
			if (userNumber < randomNumber) {
				System.out.println("El número es mayor");
			} else if (userNumber > randomNumber) {
				System.out.println("El número es menor");
			} else {
				System.out.println("Has acertado el número!" + " [" + randomNumber + "] "
						+ " Y lo has hecho en el intento número: " + attempts);
				userNumber = -1;
				randomNumber = new Random().nextInt(upperLimitNumber - lowerLimitNumber + 1) + lowerLimitNumber;
				attempts = 0;
				System.out.println("¿Quieres jugar otra vez? (S/N)");
				option = sc.next().toUpperCase();
				play = option.equals("S") ? true : false;
			}
		} while (play && userNumber != randomNumber);
		sc.close();
		System.out.println("Fin del juego");
	}
}
