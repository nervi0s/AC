package ad_02;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EscrituraSecuencialFichero {

	public static void main(String[] args) {

		File file = new File("Escritura.txt");

		try {
			FileWriter writer = new FileWriter(file);

			String msg = "Buenos días.\r\nLe informamos que su solicitud ha sido aprobada.\r\nUn saludo.";

			writer.write(msg);

			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
