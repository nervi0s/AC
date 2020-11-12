package ad_09;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;

import java.util.Scanner;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Indique el número de usuarios a introducir:");
		int totalData = sc.nextInt();

		CustomWriter cw = new CustomWriter("./exercices/ad_09/listaNombres.txt", totalData);
		cw.writeInFile();
		readFile(cw.getFile());

		sc.close(); // Si se cierra en la línea 20 falla

	}

	// Lee un archivo
	public static void readFile(File file) {

		try {
			BufferedReader buffReader = new BufferedReader(new FileReader(file));
			String msg = "";
			String line;

			while ((line = buffReader.readLine()) != null) {
				msg += line + "\n";
			}

			System.out.println(msg);
			buffReader.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
