package ad_tarea_por_organizar;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

import java.util.Scanner;

public class CustomWriter {

	private final File file;
	private int data;
	private int counter = 1;

	public CustomWriter(String path, int data) {
		file = new File(path);
		this.data = data;
	}

	public File getFile() {
		return this.file;
	}

	public void writeInFile() {

		Scanner sc = new Scanner(System.in);
		String userData;

		try {
			while (counter <= data) {
				BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
				System.out.println("Nombre del usuario " + counter);
				userData = sc.nextLine();
				bw.write(userData + " ");
				System.out.println("Primer Apellido del usuario " + counter);
				userData = sc.nextLine();
				bw.write(userData + " ");
				System.out.println("Segundo Apellido del usuario " + counter);
				userData = sc.nextLine();
				bw.write(userData);

				bw.newLine();

				bw.close();
				counter++;
			}
			sc.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		counter = 1;
	}

}
