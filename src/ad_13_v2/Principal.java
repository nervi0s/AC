package ad_13_v2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Principal {
	static long counter = 0;

	public static void main(String[] args) {
		List<String[]> allRegisters = new ArrayList<String[]>();

		File file = new File("./exercices/ad_13/registros.xml");
		String line;
		String register = "";

		while ((line = readLineCustom(file)) != null) {
			if (getData(line) != null) {
				register += getData(line) + ",";
			} else {
				if (register != "") {
					allRegisters.add(register.split(","));
				}
				register = "";
			}
		}
		showRegisters(allRegisters);
		// System.out.println(readLineCustom(file));
		// System.out.println(readLineCustom(file));
	}

	public static String readLineCustom(File file) {

		try (FileReader fr = new FileReader(file)) {
			fr.skip(counter);
			int c;
			String line = "";
			while ((c = fr.read()) != -1) {
				++counter;
				if ((char) c != '\n') {
					line += (char) c;
				} else {
					return line;
				}
			}
			// System.out.println(line);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;

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

	public static void showRegisters(List<String[]> allRegisters) {
		String[] data = { "-DNI:", "-NOMBRE:", "-APELLIDOS:", "-TELÉFONO:", "-EMAIL:" };
		int counter = 0;

		for (String[] strings : allRegisters) {
			System.out.println("Registro " + ++counter + ":");
			for (int i = 0; i < strings.length; i++) {
				System.out.println("\t" + data[i] + " " + strings[i]);
			}
		}
	}
}