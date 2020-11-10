package repaso_objetos3;

public class Principal {

	public static void main(String[] args) {
		// Forma polimorfica
		Animal[] animales = new Animal[5];
		animales[0] = new Leon("Alex", 50);
		animales[1] = new Tigre("Tigreton", 70);
		animales[2] = new Elefante("Dumbo", 30);
		animales[3] = new Delfin("Snorky", 85);
		animales[4] = new Tiburon("Shark", 90);

		for (Animal animal : animales) {
			animal.respirar();
			animal.comunicarse();
			animal.comer();
			if (animal instanceof AnimalAcuatico) {
				((AnimalAcuatico) animal).nadar();
			}
			if (animal instanceof AnimalTerrestre) {
				((AnimalTerrestre) animal).caminar();
				((AnimalTerrestre) animal).correr();
			}
			System.out.println("-------");
		}
	}
}