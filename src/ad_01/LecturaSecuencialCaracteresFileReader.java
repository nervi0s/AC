package ad_01;

import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LecturaSecuencialCaracteresFileReader {

	public static void main(String[] args) {
		File file = new File("./resources/QuijoteANSI.txt");
		FileReader reader;

		int letterELowerCaseCounter = 0;
		int letterACounter = 0;
		int quijoteCounter = 0;
		String word = "";
		String content = "";

		try {
			reader = new FileReader(file);
			int i;
			while ((i = reader.read()) != -1) {

				content += (char) i;

				if (((char) (i) == 'e')) {
					letterELowerCaseCounter++;
				}
				if (((char) (i) == 'a') || (char) (i) == 'A') {
					letterACounter++;
				}

				// Una forma de hacerlo:
				if ((char) (i) != ' ') {
					word += (char) (i);
					if (word.equalsIgnoreCase("quijote")) {
						quijoteCounter++;
					}
				} else {
					word = "";
				}

				// Otra forma de hacerlo:
				/*word += (char) (i);
				if (word.toLowerCase().contains("quijote")) {
					quijoteCounter++;
					word = "";
				}*/

			}
			reader.close();
			System.out.println(content);
			System.out.println();
			System.out.println("Letra 'e': " + letterELowerCaseCounter);
			System.out.println("Letra 'a' y 'A': " + letterACounter);
			System.out.println("Palabra Quijote: " + quijoteCounter);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
