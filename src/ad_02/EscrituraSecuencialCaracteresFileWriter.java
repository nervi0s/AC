package ad_02;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EscrituraSecuencialCaracteresFileWriter {

	public static void main(String[] args) {

		File file = new File("./resources/writed/EscrituraFileWriter.txt");

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
