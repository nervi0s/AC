package repaso_objetos3;

public abstract class AnimalData {

	private String nombre;
	private int velocidad;

	public AnimalData(String nombre, int velocidad) {
		this.nombre = nombre;
		this.velocidad = velocidad;
	}

	public String getNombre() {
		return this.nombre;
	}

	public int getVelocidad() {
		return this.velocidad;
	}
}
