package repaso_objetos2;

public abstract class FormasGeometricas {

	private double base;
	private double altura;
	private String nombre;

	public FormasGeometricas(double b, double a, String n) {
		base = b;
		altura = a;
		nombre = n;
	}

	public double getBase() {
		return base;
	}

	public double getAltura() {
		return altura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public abstract double calcularArea();
}
