package ad_01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class LecturaSecuancialFichero {

	public static void main(String[] args) {
		File file = new File("El Quijote - Cap 1.txt");
		FileInputStream input;
		int letterELowerCaseCounter = 0;
		int letterACounter = 0;
		int quijoteCounter = 0;
		String word = "";
		try {
			input = new FileInputStream(file);
			InputStreamReader reader = new InputStreamReader(input, "UTF-8");
			int i;
			while ((i = reader.read()) != -1) {

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
				
				/*// Otra forma de hacerlo:
				word += (char) (i);
				if (word.toLowerCase().contains("quijote")) {
					word = "";
					quijoteCounter++;
				}*/
			}
			reader.close();
			System.out.println("Letra 'e': " + letterELowerCaseCounter);
			System.out.println("Letra 'a' y 'A': " + letterACounter);
			System.out.println("Palabra Quijote: " + quijoteCounter);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
