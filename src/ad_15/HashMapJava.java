package ad_15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

public class HashMapJava {

	public static void main(String[] args) {

		String[] keys = null; // Se almacenarán los nombres de las claves
		List<HashMap<String, Object>> listaRegistros = new ArrayList<HashMap<String, Object>>();
		int totalKeys = -1; // Se almacenará el número total de pares de valores

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
			String repeat = "NA";
			do {
				HashMap<String, Object> mapa = new HashMap<String, Object>();
				if (isFirstReg) {
					for (int i = 0; i < keys.length; i++) { // Itera la longitud del array veces para nombrar las claves
															// y crear el primer registro del mapa para añadirlo al
															// arrayList
						keys[i] = JOptionPane.showInputDialog(
								"Introduzca la clave " + (i + 1) + " de " + keys.length + " que desea añadir:");
						String value = JOptionPane.showInputDialog("Introduzca el valor asociado a " + keys[i] + ": ");
						mapa.put(keys[i], value);
					}
					isFirstReg = false;
				} else {
					for (int i = 0; i < keys.length; i++) {// Itera en caso de volver a requerir añadir un nuevo
															// registro, esta vez usando las claves previamente
															// guardadas
						String value = JOptionPane.showInputDialog("Introduzca " + keys[i] + " para el nuevo registro");
						mapa.put(keys[i], value);
					}
				}

				listaRegistros.add(mapa); // Añadimos cada registro (mapa) a una posición del arrayList
				repeat = JOptionPane.showInputDialog("¿Desea introducir otro registro? (S/N)");
				while (!repeat.equalsIgnoreCase("S") && !repeat.equalsIgnoreCase("N")) { // En caso de introducir un
																							// valor que no sea S ni N
					repeat = JOptionPane.showInputDialog("Valor incorrecto.\n¿Desea introducir otro registro? (S/N)");
				}
			} while (repeat.equalsIgnoreCase("S"));
			// Imprimo el arrayList con los registros
			System.out.println(listaRegistros);
		}
	}
}