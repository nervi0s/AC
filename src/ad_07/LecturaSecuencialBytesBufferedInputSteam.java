package ad_07;

import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.FileWriter;

import java.io.FileNotFoundException;
import java.io.IOException;

public class LecturaSecuencialBytesBufferedInputSteam {

	public static void main(String[] args) {

		File file = new File("./resources/readed/bytesFiles/Logo_Google.png");

		try {
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));

			int i;

			while ((i = bis.read()) != -1) {
				System.out.print((char) i);
			}

			bis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		WriteBytesInDecimalFormat(file, "./resources/bytesInDecimal2.txt");
	}

	// Método de prueba
	public static void WriteBytesInDecimalFormat(File toExtract, String pathDestiny) {
		int counter = 1; // Used to make a new line every 250 readed bytes

		File file = new File(pathDestiny);

		try {
			FileWriter writer = new FileWriter(file);
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(toExtract));

			byte[] bytes = bis.readAllBytes();

			for (int i = 0; i < bytes.length; i++) {
				writer.write(String.valueOf(bytes[i]));
				writer.write(',');

				if (counter == 250) {
					writer.write('\n');
					counter = 1;
				}

				counter++;
			}

			bis.close();
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
