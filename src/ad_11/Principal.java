package ad_11;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

	}

}

class Persona {

	private String dni, name, surname1, surname2, email, phoneNumber;

	public void fillFields() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Indique el DNI del registro:");
		dni = sc.nextLine();
		System.out.println("Indiqie el nombre del registro:");
		name = sc.nextLine();
		System.out.println("Indiqie el primer apellido del registro :");
		surname1 = sc.nextLine();
		System.out.println("Indiqie el segundo apellido del registro :");
		surname2 = sc.nextLine();
		System.out.println("Indiqie el teléfono del registro:");
		phoneNumber = sc.nextLine();
		System.out.println("Indiqie el email del registro:");
		email = sc.nextLine();
		sc.close();
	}

	public String[] getData() {
		return formatData(dni, name, surname1, surname2, email, phoneNumber).split(",");
	}

	private String formatData(String... inputData) {
		String formatedStr = "";
		for (String data : inputData) {
			formatedStr += data + ",";
		}
		return formatedStr;
	}

}
