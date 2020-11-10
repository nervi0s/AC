package repaso_objetos1;

public class Principal {

	public static void main(String[] args) {

		double base = 50;
		double altura = 60;

		Triangulo triangle = new Triangulo(base, altura);

		System.out.println("El area del triangulo de base: " + triangle.getBase() + " y de alura: "
				+ triangle.getHeight() + " es: " + getArea(triangle));

	}

	public static double getArea(Triangulo t) {
		double area = t.getBase() * t.getHeight() / 2;
		return area;
	}
}
