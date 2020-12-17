package ad_14;

import java.util.Map;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;

public class Principal {

	public static void main(String[] args) {
		Map<String, String[]> mapa = new LinkedHashMap<String, String[]>();
		mapa = Map.of("<personas>", "persona".split(","), "<persona ",
				"dni,nombre,apellidos,telefono,email".split(","));

		System.out.println(Arrays.toString(mapa.get("<personas>")));

		File file = new File("./exercices/ad_14/fichero.xml");
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {

			String line;
			int lineCounter = 0;
			boolean isError = false;
			while ((line = br.readLine()) != null) {
				lineCounter++;
				if (mapa.containsKey(line)) {
					if (line.contains("<personas>")) {
						if (br.readLine().contains(mapa.get(line)[0])) {
							for (int i = 0; i < mapa.get("<persona ").length; i++) {
								lineCounter++;
								String line2 = br.readLine();
								if (line2.contains(mapa.get("<persona ")[i])) {
									System.out.println("ok");
								} else {
									System.out.println("Fallo en linea: " + (lineCounter + 1));
									isError = true;
									break;
								}
							}
							line = br.readLine();
							lineCounter++;
						}
					}
					if (isError) {
						break;
					}
					line = br.readLine();
					lineCounter++;
					if (line.contains("<persona ")) {
						for (int i = 0; i < mapa.get("<persona ").length; i++) {
							lineCounter++;
							String line2 = br.readLine();
							if (line2.contains(mapa.get("<persona ")[i])) {
								System.out.println("ok");
							} else {
								System.out.println("Fallo en linea: " + (lineCounter + 1));
								isError = true;
								 break;
							}
						}
					}

				}

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}