package repaso_objetos3;

public class Tigre extends AnimalData implements AnimalTerrestre {

	public Tigre(String nombre, int velocidad) {
		super(nombre, velocidad);
	}

	@Override
	public void respirar() {
		System.out.println("Soy un tigre y estoy respirando con Mowgli");
	}

	@Override
	public void comunicarse() {
		System.out.println("Soy un tigre y poco hablador");
	}

	@Override
	public void comer() {
		System.out.println("Soy un trigre y me gusta comer carne");
	}

	@Override
	public void caminar() {
		System.out.println("Soy un tigre caminando a " + getVelocidad() + " Km/h");
	}

	@Override
	public void correr() {
		System.out.println("Soy un tigre corriendo a " + (getVelocidad() + 50) + " Km/h");
	}

}
