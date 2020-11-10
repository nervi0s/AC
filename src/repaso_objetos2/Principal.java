package repaso_objetos2;

public class Principal {

	public static void main(String[] args) {

		FormasGeometricas[] formas = new FormasGeometricas[3];
		formas[0] = new Triangulo(50, 10, "Tri�ngulo"); // Vemos polimorfismo (Principio de Sustituci�n)
		formas[1] = new Rectangulo(10, 20, "Rect�ngulo");
		formas[2] = new Cuadrado(40, "Cuadrado");

		for (FormasGeometricas f : formas) { //Aplicar� el m�todo de cada clase correspondiente
			System.out.println(f.getNombre() + " con �rea: " + f.calcularArea());
		}
	}
}
