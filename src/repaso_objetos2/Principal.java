package repaso_objetos2;

public class Principal {

	public static void main(String[] args) {

		FormasGeometricas[] formas = new FormasGeometricas[3];
		formas[0] = new Triangulo(50, 10, "Triángulo"); // Vemos polimorfismo (Principio de Sustitución)
		formas[1] = new Rectangulo(10, 20, "Rectángulo");
		formas[2] = new Cuadrado(40, "Cuadrado");

		for (FormasGeometricas f : formas) { //Aplicará el método de cada clase correspondiente
			System.out.println(f.getNombre() + " con área: " + f.calcularArea());
		}
	}
}
