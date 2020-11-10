package repaso_general;

public class Repaso1 {

	public static void main(String[] args) {
		int n1 = 5;
		int n2 = 8;
		double resultado;

		resultado = n1 + n2;
		System.out.println(resultado % 1 == 0 ? (int) resultado : Math.round(resultado));
		resultado = n1 - n2;
		System.out.println(resultado % 1 == 0 ? (int) resultado : Math.round(resultado));
		resultado = n1 * n2;
		System.out.println(resultado % 1 == 0 ? (int) resultado : Math.round(resultado));
		resultado = ((double) n1 / n2);
		if (resultado % 1 == 0) {
			System.out.println((int) resultado);
		} else {
			System.out.println(resultado);
		}
	}

}
