package ad_00;

import java.util.ArrayList;
import java.util.Arrays;

public class GeneradorNombreAleatorio {

	public static void main(String[] args) {

		int maxRandomNames = 100;

		// Craeación de cadenas de texto
		String namesStr = "Lucía, María, Martina, Paula, Sofía, Daniela, Alba, Julia, Carla, Sara, Valeria, Noa, Emma, Claudia, Carmen, Valentina, Ana, Marta, Irene, Adriana, Laura, Elena, Alejandra, Vega, Alma, Laia, Lola, Vera, Olivia, Inés, Aitana, Jimena, Candela, Ariadna, Carlota, Ainhoa, Nora, Triana, Marina, Chloe, Elsa, Alicia, Clara, Blanca, Leire, Mía, Lara, Rocío, Ainara, Nerea, Hugo, Daniel, Pablo, Martín, Alejandro, Adrián, Álvaro, David, Lucas, Mateo, Mario, Manuel, Antonio, Diego, Leo, Javier, Marcos, Izan, Alex, Sergio, Enzo, Carlos, Marc, Jorge, Miguel, Gonzalo, Juan, Ángel, Oliver, Iker, Dylan, Bruno, Eric, Marco, Iván, Nicolás, José, Héctor, Darío, Samuel, Víctor, Rubén, Gabriel, Adam, Aaron, Thiago, Jesús, Aitor, Alberto, Guillermo";
		String surnamesStr = "García, González, Rodríguez, Fernández, López, Martínez, Sánchez, Pérez, Gómez, Martín, Jiménez, Ruíz, Hernández, Díaz, Moreno, Muñoz, Álvarez, Romero, Alonso, Gutiérrez, Navarro, Torres, Domínguez, Vázquez, Ramos, Gil, Ramírez, Serrano, Blanco, Molina, Morales, Suárez, Ortega, Delgado, Castro, Ortiz, Rubio, Marín, Sanz, Núñez, Iglesias, Medina, Garrido, Cortes, Castillo, Santos, Lozano, Guerrero, Cano, Prieto, Méndez, Cruz, Calvo, Gallego, Vidal, León, Márquez, Herrera, Peña, Flores, Cabrera, Campos, Vega, Fuentes, Carrasco, Díez, Caballero, Reyes, Nieto, Aguilar, Pascual, Santana, Herrero, Lorenzo, Montero, Hidalgo, Ibáñez, Ferrer, Durán, Santiago, Benítez, Mora, Vicente, Vargas, Arias, Carmona, Crespo, Román, Pastor, Soto, Sáez, Velasco, Moya, Soler, Parra, Esteban, Bravo, Gallardo, Rojas, Casado";
		// División de las cadena
		String[] namesArr = namesStr.split(", ");
		String[] surnamesArr = surnamesStr.split(", ");
		// Añadir elementos de los arrays a ArrayList
		ArrayList<String> names = new ArrayList<String>();
		names.addAll(Arrays.asList(namesArr));

		ArrayList<String> surnames = new ArrayList<String>();
		surnames.addAll(Arrays.asList(surnamesArr));

		// Creación de nombres y apellidos aleatorios
		Fichero file = new Fichero("./test.txt");

		for (int i = 1; i <= maxRandomNames; i++) {
			System.out.println(getName(names) + " " + getSurname(surnames) + " " + getSurname(surnames));
			file.writeInFile(getName(names) + " " + getSurname(surnames) + " " + getSurname(surnames) + "\n");
		}
	}

	// Obetener un número aleatorio entre dos dados, ambos inclusive
	public static int getRandom(int min, int max) {
		return (int) Math.floor(Math.random() * (max - min + 1) + min);
	}

	// Obtener un nombre aleatorio de una lista
	public static String getName(ArrayList<String> names) {
		int randomIndex = getRandom(0, names.size() - 1);
		return names.get(randomIndex);
	}

	// Obtener un apellido aleatorio de una lista
	public static String getSurname(ArrayList<String> surname) {
		int randomIndex = getRandom(0, surname.size() - 1);
		return surname.get(randomIndex);
	}
}