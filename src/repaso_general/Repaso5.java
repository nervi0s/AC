package repaso_general;

public class Repaso5 {

	public static void main(String[] args) {
		// int dia = 14;
		int mes = 5;
		// int anio = 2020;

		if (mes >= 1 && mes <= 3) {
			System.out.println("Primer Trimestre");
		} else if (mes >= 4 && mes <= 7) {
			System.out.println("Segundo Trimentre");
		} else if (mes >= 8 && mes <= 9) {
			System.out.println("Tercer Trimentre");
		} else if (mes >= 10 && mes <= 12) {
			System.out.println("Cuarto Trimestre");
		}

		if (mes == 1 || mes == 2 || mes == 3) {
			System.out.println("Primer Trimestre");
		} else if (mes == 4 || mes == 5 || mes == 6) {
			System.out.println("Segundo Trimentre");
		} else if (mes == 7 || mes == 8 || mes == 9) {
			System.out.println("Tercer Trimentre");
		} else if (mes == 10 || mes == 11 || mes == 12) {
			System.out.println("Cuarto Trimestre");
		}

	}

}
