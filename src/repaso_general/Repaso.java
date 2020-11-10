package repaso_general;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Repaso {

	public static void main(String[] args) {

		ArrayList<String> nombres = new ArrayList<String>();
		ArrayList<String> apellidos = new ArrayList<String>();

		nombres.addAll(Arrays.asList("Luc�a", "Mar�a", "Martina", "Paula", "Sof�a", "Daniela", "Alba", "Julia", "Carla",
				"Sara", "Valeria", "Noa", "Emma", "Claudia", "Carmen", "Valentina", "Ana", "Marta", "Irene", "Adriana",
				"Laura", "Elena", "Alejandra", "Vega", "Alma", "Laia", "Lola", "Vera", "Olivia", "In�s", "Aitana",
				"Jimena", "Candela", "Ariadna", "Carlota", "Ainhoa", "NoraTriana", "Marina", "Chloe", "Elsa", "Alicia",
				"Clara", "Blanca", "Leire", "M�a", "Lara", "Roc�o", "Ainara", "Nerea", "Hugo", "Daniel", "Pablo",
				"Mart�n", "Alejandro", "Adri�n", "�lvaro", "David", "Lucas", "Mateo", "Mario", "Manuel", "Antonio",
				"Diego", "Leo", "Javier", "Marcos", "Izan", "Alex", "Sergio", "Enzo", "Carlos", "Marc", "Jorge",
				"Miguel", "Gonzalo", "Juan", "�ngel", "Oliver", "Iker", "Dylan", "Bruno", "Eric", "Marco", "Iv�n",
				"Nicol�s", "Jos�", "H�ctor", "Dar�o", "Samuel", "V�ctor", "Rub�n", "Gabriel", "Adam", "Aaron", "Thiago",
				"Jes�s", "Aitor", "Alberto", "Guillermo"));
		apellidos.addAll(Arrays.asList("Garc�a", "Gonz�lez", "Rodr�guez", "Fern�ndez", "L�pez", "Mart�nez", "S�nchez",
				"P�rez", "G�mez", "Mart�n", "Jim�nez", "Ru�z", "Hern�ndez", "D�az", "Moreno", "Mu�oz", "�lvarez",
				"Romero", "Alonso", "Guti�rrez", "Navarro", "Torres", "Dom�nguez", "V�zquez", "Ramos", "Gil", "Ram�rez",
				"Serrano", "Blanco", "Molina", "Morales", "Su�rez", "Ortega", "Delgado", "Castro", "Ortiz", "Rubio",
				"Mar�n", "Sanz", "N��ez", "Iglesias", "Medina", "Garrido", "Cortes", "Castillo", "Santos", "Lozano",
				"Guerrero", "Cano", "Prieto", "M�ndez", "Cruz", "Calvo", "Gallego", "Vidal", "Le�n", "M�rquez",
				"Herrera", "Pe�a", "Flores", "Cabrera", "Campos", "Vega", "Fuentes", "Carrasco", "D�ez", "Caballero",
				"Reyes", "Nieto", "Aguilar", "Pascual", "Santana", "Herrero", "Lorenzo", "Montero", "Hidalgo", "Ib��ez",
				"Ferrer", "Dur�n", "Santiago", "Ben�tez", "Mora", "Vicente", "Vargas", "Arias", "Carmona", "Crespo",
				"Rom�n", "Pastor", "Soto", "S�ez", "Velasco", "Moya", "Soler", "Parra", "Esteban", "Bravo", "Gallardo",
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
