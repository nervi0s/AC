package ad_12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class User {
	private static int userCounter = 0; // Usada junto con registeredUser para introducir el cierre de la root tag
	private static int registeredUser = 0;

	private String name, surnames, phone, email;

	public User(String name, String surnames, String phone, String email) {
		this.name = name;
		this.surnames = surnames;
		this.phone = phone;
		this.email = email;

		userCounter++;
	}

	public void register(XmlCreator creator) {
		if (!creator.getFile().exists()) {
			System.out.println("Debe crear primero el archivo usando createXmlDoc()");
			return;
		}

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(creator.getFile(), true))) {
			registeredUser++;
			if (!rootTagExist(creator)) {
				bw.write("<" + creator.getTagList().get(0)[0] + ">");
				bw.newLine();
			}
			bw.write("\t<" + creator.getTagList().get(1)[0] + ">");
			bw.newLine();
			bw.write("\t\t<" + creator.getTagList().get(2)[0] + ">" + name + "</" + creator.getTagList().get(2)[0]
					+ ">");
			bw.newLine();
			bw.write("\t\t<" + creator.getTagList().get(3)[0] + ">" + surnames + "</" + creator.getTagList().get(3)[0]
					+ ">");
			bw.newLine();
			bw.write("\t\t<" + creator.getTagList().get(4)[0] + ">" + phone + "</" + creator.getTagList().get(4)[0]
					+ ">");
			bw.newLine();
			bw.write("\t\t<" + creator.getTagList().get(5)[0] + ">" + email + "</" + creator.getTagList().get(5)[0]
					+ ">");
			bw.newLine();
			bw.write("\t</" + creator.getTagList().get(1)[0] + ">");
			bw.newLine();
			if (registeredUser == userCounter) {
				bw.write("</" + creator.getTagList().get(0)[0] + ">");
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private boolean rootTagExist(XmlCreator creator) { // Usado para controlar la apertura de la root tag

		try (BufferedReader br = new BufferedReader(new FileReader(creator.getFile()))) {
			String line;
			while ((line = br.readLine()) != null) {
				if (line.contains("<" + creator.getTagList().get(0)[0] + ">")) {
					return true;
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;

	}
}