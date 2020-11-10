package repaso_general;

import java.util.Scanner;

public class Repaso8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] sueldos;
		String mensaje = "";

		System.out.println("Indica número de trimestres: ");
		int trimestre = sc.nextInt();
		sueldos = new double[3 * trimestre];
		double totalSueldos = 0;

		for (int i = 0; i < sueldos.length; i++) {
			System.out.println("Ingresa sueldo " + (i + 1) + " de " + sueldos.length);
			sueldos[i] = sc.nextDouble();
			totalSueldos += sueldos[i];
			mensaje += "Sueldo en el mes " + (i + 1) + ": " + sueldos[i] + " €\n";
			if (i == sueldos.length - 1) {
				System.out.print(mensaje);
			}
		}
		sc.close();
		System.out.println("La media de sueldos es: " + totalSueldos / sueldos.length);
	}
}
