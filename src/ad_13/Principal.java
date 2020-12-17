package ad_13;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Principal {

	
	
	public static void main(String[] args) {
		List<String[]> allRegisters = new ArrayList<String[]>();
		
		File file = new File("./exercices/ad_13/registros.xml");
		String line;

		try (BufferedReader br = new BufferedReader(new FileReader(file))) {

			while ((line = br.readLine()) != null) {
				System.out.println(getData(line));
				
				if (getData(line)!=null) {
				
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static String getData(String line) {

		String[] dataToCatch = { "dni", "nombre", "apellidos", "telefono", "email" };
		for (int i = 0; i < dataToCatch.length; i++) {
			if (line.contains(dataToCatch[i])) {
				return line.substring(line.indexOf(">") + 1, line.indexOf("</"));
			}
		}
		return null;
	}
}
