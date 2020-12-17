package ad_12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<User> users = new ArrayList<User>();

		XmlCreator xmlCreator = new XmlCreator("usuarios", "usuario+");
		xmlCreator.addTag("usuario", "nombre", "apellidos", "telefono", "email");
		xmlCreator.addTag("nombre");
		xmlCreator.addTag("apellidos");
		xmlCreator.addTag("telefono");
		xmlCreator.addTag("email");

		xmlCreator.createXmlDoc("./exercices/ad_12/registros.xml");

		System.out.println("Indique la cantidad de usuarios a registrar");
		int cantidad = sc.nextInt();
		sc.nextLine();

		for (int i = 1; i <= cantidad; i++) {
			System.out.println("Introduzca el nombre:");
			String name = sc.nextLine();
			System.out.println("Itroduzca el primer apellido:");
			String surnames = sc.nextLine();
			System.out.println("Introduzca el segundo apellido:");
			surnames += " " + sc.nextLine();
			System.out.println("Introduzca el teléfono:");
			String phone = sc.nextLine();
			System.out.println("Introduza el email:");
			String email = sc.nextLine();

			users.add(new User(name, surnames, phone, email));
		}
		sc.close();

		for (User user : users) {
			user.register(xmlCreator);
		}

	}

}
