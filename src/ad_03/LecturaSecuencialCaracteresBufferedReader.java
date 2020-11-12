package ad_03;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class LecturaSecuencialCaracteresBufferedReader {

	public static void main(String[] args) {

		File file = new File("./resources/readed/QuijoteANSI.txt");

		try {
			BufferedReader buffReader = new BufferedReader(new FileReader(file));
			String msg = "";
			String line;

			while ((line = buffReader.readLine()) != null) {
				msg += line;
				msg += "\n"; // A�ade un salto de l�nea cuando este es detectado
								// ya que seg�n la API el retorno de readLine() no incluye
								// ning�n tipo de caracter de fin de l�nea
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
