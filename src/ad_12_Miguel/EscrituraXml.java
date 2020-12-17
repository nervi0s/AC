package ad_12_Miguel;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EscrituraXml {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el número de usuarios a almacenar");
		int registros = sc.nextInt();
		sc.nextLine();

		File archivo = new File("fichero.xml");

		try {
			FileWriter fw = new FileWriter(archivo, false);

			for (int i = 0; i < registros; i++) {
				System.out.println("Introduce el DNI: ");
				String dni = sc.nextLine();

				System.out.println("Introduce el nombre: ");
				String nombre = sc.nextLine();

				System.out.println("Introduce el primer apellido: ");
				String apellido1 = sc.nextLine();
				System.out.println("Introduce el segundo apellido: ");
				String apellido2 = sc.nextLine();
				String apellidos = apellido1 + " " + apellido2;

				System.out.println("Introduce el teléfono: ");
				String telefono = sc.nextLine();

				System.out.println("Introduce el email: ");
				String email = sc.nextLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
