package ad_tarea_por_organizar;

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
		sc.close();

		CustomWriter cw = new CustomWriter("./listaNombres.txt", totalData);
		cw.writeInFile();
		readFile(cw.getFile());

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
