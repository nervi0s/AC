package ad_10;

import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Indica el número total de nombres a ingresar:");
		int numTotal = sc.nextInt();
		sc.nextLine();

		File file = new File("./exercices/ad_10/listaNombres.txt");

		try {
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file));

			for (int i = 1; i <= numTotal; i++) {
				String nombreCompleto;
				System.out.println("Nombre del usuaruario " + i);
				nombreCompleto = sc.nextLine().concat(" ");
				System.out.println("Primer apellido del usuaruario " + i);
				nombreCompleto += sc.nextLine().concat(" ");
				System.out.println("Segundo apellido del usuaruario " + i);
				nombreCompleto += sc.nextLine().concat("\n");

				// Una forma de hacerlo
				// bos.write(nombreCompleto.getBytes());

				// Otra forma de hacerlo
				for (int j = 0; j < nombreCompleto.length(); j++) {
					bos.write(Integer.valueOf(nombreCompleto.charAt(j)));
				}

			}
			bos.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		readFile(file);
	}

	public static void readFile(File file) {

		try {
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
			byte[] bytes = bis.readAllBytes();
			String msg = "";
			for (int i = 0; i < bytes.length; i++) {
				msg += (char) bytes[i];
			}
			bis.close();
			System.out.println(msg);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
