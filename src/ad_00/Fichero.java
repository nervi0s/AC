package ad_00;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Fichero extends File {

	// Constructor, make a file in specific path
	public Fichero(String path) {
		super(path);
		try {
			if (createNewFile()) {
				System.out.println("Archivo creado: " + this.getName());
			} else {
				System.out.println("El archivo " + getName() + " ya existe");
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	// Write in file
	public void writeInFile(String str) {
		try {
			FileWriter writer = new FileWriter(this, true);
			writer.write(str);
			writer.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
