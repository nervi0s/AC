package repaso_objetos3;

public class Delfin extends AnimalData implements AnimalAcuatico {

	public Delfin(String nombre, int velocidad) {
		super(nombre, velocidad);
	}

	@Override
	public void respirar() {
		System.out.println("Soy un delf�n y respiro bajo el agua");
	}

	@Override
	public void comunicarse() {
		System.out.println("Snorky hablar humano");
	}

	@Override
	public void comer() {
		System.out.println("Soy un delf�n y me gusta comer humanos");
	}

	@Override
	public void nadar() {
		System.out.println("Soy un def�n nadando a una velocidad de " + getVelocidad() + " Km/h");
	}

}
