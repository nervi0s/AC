package repaso_objetos3;

public class Leon extends AnimalData implements AnimalTerrestre {

	public Leon(String nombre, int velocidad) {
		super(nombre, velocidad);
	}

	@Override
	public void respirar() {
		System.out.println("Soy un le�n y estoy respirando en la Sabana");
	}

	@Override
	public void comunicarse() {
		System.out.println("�AUPA ATHLETIC! xD");
	}

	@Override
	public void comer() {
		System.out.println("Soy un le�n y me gusta comer carne");
	}

	@Override
	public void caminar() {
		System.out.println("Soy un le�n andando a una velocidad de: " + getVelocidad() + " Km/h");
	}

	@Override
	public void correr() {
		System.out.println("Soy un le�n corriendo a la velocidad de: " + (getVelocidad() + 70) + " Km/h");
	}

}
