package ad_03;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

import java.io.BufferedReader;

public class LecturaSecuencialBufferedReader {

	public static void main(String[] args) {

		File file = new File("./El Quijote - Cap 1.txt");

		try {
			BufferedReader buffReader = new BufferedReader(new FileReader(file));
			String msg = "";
			String line = buffReader.readLine();

			while (line != null) {
				msg += line;
				msg += "\n"; // Añade un salto de línea cuando este es detectado
				line = buffReader.readLine();
			}

			buffReader.close();

			System.out.println(msg);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
