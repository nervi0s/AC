package repaso_objetos2;

public class Cuadrado extends FormasGeometricas {

	public Cuadrado(double b, String n) {
		super(b, b, n);
	}

	@Override
	public double calcularArea() {
		return getBase() * getBase();
	}

}
