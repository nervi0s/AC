package repaso_objetos3;

public class Elefante extends AnimalData implements AnimalTerrestre {

	public Elefante(String nombre, int velocidad) {
		super(nombre, velocidad);
	}

	@Override
	public void respirar() {
		System.out.println("Soy un elefante y respiro con mi super nariz");
	}

	@Override
	public void comunicarse() {
		System.out.println("Soy un elefante comunicándome");
	}

	@Override
	public void comer() {
		System.out.println("Soy un elefante comiendo cacahuetes");
	}

	@Override
	public void caminar() {
		System.out.println("Soy un elefante andando a " + getVelocidad() + " Km/h");
	}

	@Override
	public void correr() {
		System.out.println("Soy un elefante corriendo a " + (getVelocidad() + 60) + " Km/h");
	}

}
