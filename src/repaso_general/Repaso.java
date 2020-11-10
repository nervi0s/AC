package repaso_general;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Repaso {

	public static void main(String[] args) {

		ArrayList<String> nombres = new ArrayList<String>();
		ArrayList<String> apellidos = new ArrayList<String>();

		nombres.addAll(Arrays.asList("Lucía", "María", "Martina", "Paula", "Sofía", "Daniela", "Alba", "Julia", "Carla",
				"Sara", "Valeria", "Noa", "Emma", "Claudia", "Carmen", "Valentina", "Ana", "Marta", "Irene", "Adriana",
				"Laura", "Elena", "Alejandra", "Vega", "Alma", "Laia", "Lola", "Vera", "Olivia", "Inés", "Aitana",
				"Jimena", "Candela", "Ariadna", "Carlota", "Ainhoa", "NoraTriana", "Marina", "Chloe", "Elsa", "Alicia",
				"Clara", "Blanca", "Leire", "Mía", "Lara", "Rocío", "Ainara", "Nerea", "Hugo", "Daniel", "Pablo",
				"Martín", "Alejandro", "Adrián", "Álvaro", "David", "Lucas", "Mateo", "Mario", "Manuel", "Antonio",
				"Diego", "Leo", "Javier", "Marcos", "Izan", "Alex", "Sergio", "Enzo", "Carlos", "Marc", "Jorge",
				"Miguel", "Gonzalo", "Juan", "Ángel", "Oliver", "Iker", "Dylan", "Bruno", "Eric", "Marco", "Iván",
				"Nicolás", "José", "Héctor", "Darío", "Samuel", "Víctor", "Rubén", "Gabriel", "Adam", "Aaron", "Thiago",
				"Jesús", "Aitor", "Alberto", "Guillermo"));
		apellidos.addAll(Arrays.asList("García", "González", "Rodríguez", "Fernández", "López", "Martínez", "Sánchez",
				"Pérez", "Gómez", "Martín", "Jiménez", "Ruíz", "Hernández", "Díaz", "Moreno", "Muñoz", "Álvarez",
				"Romero", "Alonso", "Gutiérrez", "Navarro", "Torres", "Domínguez", "Vázquez", "Ramos", "Gil", "Ramírez",
				"Serrano", "Blanco", "Molina", "Morales", "Suárez", "Ortega", "Delgado", "Castro", "Ortiz", "Rubio",
				"Marín", "Sanz", "Núñez", "Iglesias", "Medina", "Garrido", "Cortes", "Castillo", "Santos", "Lozano",
				"Guerrero", "Cano", "Prieto", "Méndez", "Cruz", "Calvo", "Gallego", "Vidal", "León", "Márquez",
				"Herrera", "Peña", "Flores", "Cabrera", "Campos", "Vega", "Fuentes", "Carrasco", "Díez", "Caballero",
				"Reyes", "Nieto", "Aguilar", "Pascual", "Santana", "Herrero", "Lorenzo", "Montero", "Hidalgo", "Ibáñez",
				"Ferrer", "Durán", "Santiago", "Benítez", "Mora", "Vicente", "Vargas", "Arias", "Carmona", "Crespo",
				"Román", "Pastor", "Soto", "Sáez", "Velasco", "Moya", "Soler", "Parra", "Esteban", "Bravo", "Gallardo",
				"Rojas", "Casado"));

		for (int i = 0; i < apellidos.size(); i++) {
			String n = getName(nombres) + " " + getApellidos(apellidos);
			System.out.println(n + " " + (i + 1));
		}
	}

	public static int getRandomNum(int a, int b) {
		Random r = new Random();
		int result = r.nextInt(b - a) + a;
		return result;
	}

	public static String getName(ArrayList<String> l) {
		int randomIndex = getRandomNum(0, l.size());
		String name = l.get(randomIndex);
		return name;
	}

	public static String getApellidos(ArrayList<String> l) {
		int randomIndex = getRandomNum(0, l.size());
		int randomIndex2 = getRandomNum(0, l.size());
		String Apellidos = l.get(randomIndex) + " " + l.get(randomIndex2);
		return Apellidos;
	}

}
