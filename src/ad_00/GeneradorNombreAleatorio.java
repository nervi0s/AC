package ad_00;

import java.util.ArrayList;
import java.util.Arrays;

public class GeneradorNombreAleatorio {

	public static void main(String[] args) {

		int maxRandomNames = 100;

		// Craeaci�n de cadenas de texto
		String namesStr = "Luc�a, Mar�a, Martina, Paula, Sof�a, Daniela, Alba, Julia, Carla, Sara, Valeria, Noa, Emma, Claudia, Carmen, Valentina, Ana, Marta, Irene, Adriana, Laura, Elena, Alejandra, Vega, Alma, Laia, Lola, Vera, Olivia, In�s, Aitana, Jimena, Candela, Ariadna, Carlota, Ainhoa, Nora, Triana, Marina, Chloe, Elsa, Alicia, Clara, Blanca, Leire, M�a, Lara, Roc�o, Ainara, Nerea, Hugo, Daniel, Pablo, Mart�n, Alejandro, Adri�n, �lvaro, David, Lucas, Mateo, Mario, Manuel, Antonio, Diego, Leo, Javier, Marcos, Izan, Alex, Sergio, Enzo, Carlos, Marc, Jorge, Miguel, Gonzalo, Juan, �ngel, Oliver, Iker, Dylan, Bruno, Eric, Marco, Iv�n, Nicol�s, Jos�, H�ctor, Dar�o, Samuel, V�ctor, Rub�n, Gabriel, Adam, Aaron, Thiago, Jes�s, Aitor, Alberto, Guillermo";
		String surnamesStr = "Garc�a, Gonz�lez, Rodr�guez, Fern�ndez, L�pez, Mart�nez, S�nchez, P�rez, G�mez, Mart�n, Jim�nez, Ru�z, Hern�ndez, D�az, Moreno, Mu�oz, �lvarez, Romero, Alonso, Guti�rrez, Navarro, Torres, Dom�nguez, V�zquez, Ramos, Gil, Ram�rez, Serrano, Blanco, Molina, Morales, Su�rez, Ortega, Delgado, Castro, Ortiz, Rubio, Mar�n, Sanz, N��ez, Iglesias, Medina, Garrido, Cortes, Castillo, Santos, Lozano, Guerrero, Cano, Prieto, M�ndez, Cruz, Calvo, Gallego, Vidal, Le�n, M�rquez, Herrera, Pe�a, Flores, Cabrera, Campos, Vega, Fuentes, Carrasco, D�ez, Caballero, Reyes, Nieto, Aguilar, Pascual, Santana, Herrero, Lorenzo, Montero, Hidalgo, Ib��ez, Ferrer, Dur�n, Santiago, Ben�tez, Mora, Vicente, Vargas, Arias, Carmona, Crespo, Rom�n, Pastor, Soto, S�ez, Velasco, Moya, Soler, Parra, Esteban, Bravo, Gallardo, Rojas, Casado";
		// Divisi�n de las cadena
		String[] namesArr = namesStr.split(", ");
		String[] surnamesArr = surnamesStr.split(", ");
		// A�adir elementos de los arrays a ArrayList
		ArrayList<String> names = new ArrayList<String>();
		names.addAll(Arrays.asList(namesArr));

		ArrayList<String> surnames = new ArrayList<String>();
		surnames.addAll(Arrays.asList(surnamesArr));

		// Creaci�n de nombres y apellidos aleatorios
		Fichero file = new Fichero("./test.txt");

		for (int i = 1; i <= maxRandomNames; i++) {
			System.out.println(getName(names) + " " + getSurname(surnames) + " " + getSurname(surnames));
			file.writeInFile(getName(names) + " " + getSurname(surnames) + " " + getSurname(surnames) + "\n");
		}
	}

	// Obetener un n�mero aleatorio entre dos dados, ambos inclusive
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