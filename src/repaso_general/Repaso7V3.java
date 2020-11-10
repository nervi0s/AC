package repaso_general;

import java.util.Scanner;

public class Repaso7V3 {
	public static void main(String[] args) {

		boolean continuar = true;
		Scanner sc = new Scanner(System.in);

		while (continuar) {
			int numeroAleatorio = (int) Math.floor(Math.random() * 1001);
			System.out.println(numeroAleatorio);
			int intentos = 0;
			int num;
			do {
				System.out.print("Adivina un número entre 0 y 1000: ");
				num = sc.nextInt();
				if (num > numeroAleatorio) {
					System.out.println("El número aleatorio es menor");
				} else {
					System.out.println("El número aleatorio es mayor");
				}
				intentos = intentos + 1;
			} while (num != numeroAleatorio);
			System.out.println("Intentos: " + intentos);
			System.out.println("¿Jugar otra vez? (SI/NO)");
			String opcionContinuar = sc.next();
			if (!opcionContinuar.equals("SI")) {
				continuar = false;
			}
		}
		sc.close();
		System.out.println("Fin del programa");
	}
}
