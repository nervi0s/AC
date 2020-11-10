package repaso_objetos3;

public class Tiburon extends AnimalData implements AnimalAcuatico {

	public Tiburon(String nombre, int velocidad) {
		super(nombre, velocidad);
	}

	@Override
	public void respirar() {
		System.out.println("Soy un tiburón respirando bajo el agua");
	}

	@Override
	public void comunicarse() {
		System.out.println("Soy un tiburón y no me comunico");
	}

	@Override
	public void comer() {
		System.out.println("Soy un tiburón y me gusta comer nemos");
	}

	@Override
	public void nadar() {
		System.out.println("Soy un tiburón nadando a " + getVelocidad() + " Km/h");
	}

}
