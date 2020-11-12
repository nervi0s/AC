package ad_04;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class EscrituraSecuencialCaracteresBufferedWriter {

	public static void main(String[] args) {

		File file = new File("./resources/writed/EscrituraBufferedWriter.txt");

		try {
			BufferedWriter buffWriter = new BufferedWriter(new FileWriter(file));

			String msg = "Hola esto es un mensaje de prueba.";
			buffWriter.write(msg);

			buffWriter.newLine();

			msg = "Esto está en otra línea.";
			buffWriter.write(msg);

			buffWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
