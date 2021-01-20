package ad_16;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;

public class HashMapJava {

	public static void main(String[] args) {

		File file = new File("./exercices/ad_16/registros");
		String[] keys = null; // Se almacenarán los nombres de las claves
		List<HashMap<String, Object>> listaRegistros = new ArrayList<HashMap<String, Object>>();
		int totalKeys = -1; // Se almacenará el número total de pares de valores

		if (file.exists()) {
			String option = JOptionPane.showInputDialog("¿Desea leer el fichero o introducir un nuevo registro? (L/I)");

			// En caso de introducir un valor que no sea L ni I
			while (!option.equalsIgnoreCase("L") && !option.equalsIgnoreCase("I")) {
				option = JOptionPane.showInputDialog(
						"Valor incorrecto.\n¿Desea leer el fichero o introducir un nuevo registro? (L/I)");
			}

			// Copiamos el contenido del archivo que es un objeto de tipo ArrayList
			listaRegistros = leerObjetoDeArchivo(file);
			// --->String[] y = x.toArray(new String[0]);<---
			// Guardamos los nombres de las claves existentes
			keys = listaRegistros.get(0).keySet().toArray(new String[0]);

			if (option.equalsIgnoreCase("L")) {

				System.out.println("Contenido del archivo: " + listaRegistros);
				String repetir = "";
				do {
					repetir = JOptionPane.showInputDialog("¿Desea introducir otro registro? (S/N)");
					// En caso de introducir un valor que no sea S ni N
					while (!repetir.equalsIgnoreCase("S") && !repetir.equalsIgnoreCase("N")) {
						repetir = JOptionPane
								.showInputDialog("Valor incorrecto.\n¿Desea introducir otro registro? (S/N)");
					}
					if (repetir.equalsIgnoreCase("S")) {
						addNewEntry(keys, listaRegistros, false);
						escribirObjetoEnArchivo(file, listaRegistros);
						System.out.println("Contenido del archivo: " + listaRegistros);
					}
				} while (repetir.equalsIgnoreCase("S"));

			} else if (option.equalsIgnoreCase("I")) {
				String repeat = "";
				do {
					addNewEntry(keys, listaRegistros, false);
					escribirObjetoEnArchivo(file, listaRegistros);
					System.out.println("Contenido del archivo: " + listaRegistros);
					repeat = JOptionPane.showInputDialog("¿Desea introducir otro registro? (S/N)");

					// En caso de introducir un valor que no sea S ni N
					while (!repeat.equalsIgnoreCase("S") && !repeat.equalsIgnoreCase("N")) {
						repeat = JOptionPane
								.showInputDialog("Valor incorrecto.\n¿Desea introducir otro registro? (S/N)");
					}

				} while (repeat.equalsIgnoreCase("S"));
			}
		} else {
			// Pedimos la cantidad de pares de datos que vamos a introducir
			do {
				try {
					totalKeys = Integer
							.parseInt(JOptionPane.showInputDialog("Introduzca el número de campos que desea añadir:"));
					keys = new String[totalKeys];

				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Debe introducir un número entero");
				}

			} while (totalKeys < 0);

			// Una vez tengamos cuántos pares de datos queremos, los pedimos
			if (totalKeys == 0) {
				System.out.println("Ha finalizado el programa ya que no desea añadir ningún registro");
			} else {
				boolean isFirstReg = true;
				String repeat = "";
				do {
					addNewEntry(keys, listaRegistros, isFirstReg);
					isFirstReg = false;
					repeat = JOptionPane.showInputDialog("¿Desea introducir otro registro? (S/N)");
					// En caso de introducir un valor que no sea S ni N
					while (!repeat.equalsIgnoreCase("S") && !repeat.equalsIgnoreCase("N")) {
						repeat = JOptionPane
								.showInputDialog("Valor incorrecto.\n¿Desea introducir otro registro? (S/N)");
					}
				} while (repeat.equalsIgnoreCase("S"));
				// Imprimo el arrayList con los registros
				System.out.println(listaRegistros);
				// Creamos el archivo con los registros
				escribirObjetoEnArchivo(file, listaRegistros);
			}
		}

	}

	// Método para introducir registros (HashMaps) en el ArrayList
	public static void addNewEntry(String[] keys, List<HashMap<String, Object>> listaRegistros, boolean isFirstEntry) {
		HashMap<String, Object> mapa = new HashMap<String, Object>();

		if (isFirstEntry) {
			for (int i = 0; i < keys.length; i++) { // Itera la longitud del array veces para nombrar las claves y crear
													// el primer registro del mapa para añadirlo al arrayList
				keys[i] = JOptionPane.showInputDialog(
						"Introduzca la clave " + (i + 1) + " de " + keys.length + " que desea añadir:");
				String value = JOptionPane.showInputDialog("Introduzca el valor asociado a " + keys[i] + ": ");
				mapa.put(keys[i], value);
			}
		} else {
			for (int i = 0; i < keys.length; i++) {// Itera en caso de volver a requerir añadir un nuevo registro, esta
													// vez usando las claves previamente guardadas
				String value = JOptionPane.showInputDialog("Introduzca " + keys[i] + " para el nuevo registro");
				mapa.put(keys[i], value);
			}
			// escribirObjetoEnArchivo(file, listaRegistros);
			// System.out.println("Contenido del archivo: " + listaRegistros);
		}
		listaRegistros.add(mapa); // Añadimos cada registro (mapa) a una posición del arrayList
	}

	// Método para escribir en un archivo la lista de objetos de tipo Map
	public static void escribirObjetoEnArchivo(File file, List<HashMap<String, Object>> list) {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
			oos.writeObject(list);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Método para leer de un archivo la lista de objetos de tipo Map
	public static List<HashMap<String, Object>> leerObjetoDeArchivo(File file) {
		List<HashMap<String, Object>> listaObjetos = null;

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
			listaObjetos = (ArrayList<HashMap<String, Object>>) ois.readObject();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return listaObjetos;
	}
}