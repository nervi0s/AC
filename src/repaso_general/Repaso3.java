package repaso_general;

public class Repaso3 {

	public static void main(String[] args) {
		double nota1 = 5;
		double nota2 = 10;
		double nota3 = 10;

		double promedio = (nota1 + nota2 + nota3) / 3;

		if (promedio >= 7) {
			System.out.println("Promociona");
		} else {
			if (promedio >= 4) {
				System.out.println("Regular");
			} else {
				System.out.println("Reprobado");
			}
		}

		if (promedio < 4) {
			System.out.println("Reprobado");
		} else if (promedio < 7) {
			System.out.println("Regular");
		} else {
			System.out.println("Promociona");
		}

	}

}
