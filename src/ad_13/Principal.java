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
			String register = "";
			while ((line = br.readLine()) != null) {
				// System.out.println(getData(line));

				if (getData(line) != null) {
					register += getData(line) + ",";
				} else {
					if (register != "") {
						allRegisters.add(register.split(","));
					}
					register = "";
				}
			}
			// System.out.println(allRegisters);
			showRegisters(allRegisters);
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