package repaso_objetos2;

public class Rectangulo extends FormasGeometricas {

	public Rectangulo(double b, double a, String n) {
		super(b, a, n);
	}

	@Override
	public double calcularArea() {
		return this.getBase() * this.getAltura();
	}
}
