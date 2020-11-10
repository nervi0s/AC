package repaso_general;

public class Repaso9 {

	public static void main(String[] args) {

		String ingreStr = "kiwi, pimienta, pimiento, merluza, tomate, cacahuete, huevo, langosta, gambas, curry, curcuma, mantequilla, cebolla, cacao, harina, limon, aguacate, vainilla, miel, apio, salmon, atun, arroz";
		String alerStr = "cebolla, gambas";

		String[] ingredientes = ingreStr.split(", ");
		String[] alergenos = alerStr.split(", ");

		for (int i = 0; i < ingredientes.length; i++) {
			boolean coincidencia = false;
			for (int j = 0; j < alergenos.length && !coincidencia; j++) {
				if (ingredientes[i].equalsIgnoreCase(alergenos[j])) {
					coincidencia = true;
					// System.out.println("He encontrado un alergeno");
				}
			}
			if (!coincidencia) {
				System.out.print(ingredientes[i] + ", ");
			}
		}
	}

}
