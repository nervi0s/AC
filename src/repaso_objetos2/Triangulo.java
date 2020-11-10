package repaso_objetos2;

public class Triangulo extends FormasGeometricas {

	public Triangulo(double b, double a, String n) {
		super(b, a, n);
	}

	@Override
	public double calcularArea() {
		return this.getBase() * this.getAltura() / 2;
	}

}
