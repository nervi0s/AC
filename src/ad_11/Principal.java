package ad_11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// String[] data = { "12345678L", "UserName", "Surname", "123456789", "mail@mail.com" };

		File file = new File("./exercices/ad_11/registros");

		Scanner sc = new Scanner(System.in);
		System.out.println("Indique la cantidad de registros a introducir:");
		int registerCounter = sc.nextInt();

		FileManager fm = new FileManager(file, false);

		for (int i = 1; i <= registerCounter; i++) {
			Record record = new Record();
			record.fillFields();

			fm.writeInFile(record.getData());
		}

		sc.close();
	}

}

class Record {

	private String dni, name, surname1, surname2, email, phoneNumber;

	public void fillFields() {
		Scanner sca = new Scanner(System.in);

		System.out.println("Indique el DNI del registro:");
		dni = sca.nextLine();
		System.out.println("Indique el nombre del registro:");
		name = sca.nextLine();
		System.out.println("Indique el primer apellido del registro :");
		surname1 = sca.nextLine();
		System.out.println("Indique el segundo apellido del registro :");
		surname2 = sca.nextLine();
		System.out.println("Indique el teléfono del registro:");
		phoneNumber = sca.nextLine();
		System.out.println("Indique el email del registro:");
		email = sca.nextLine();
	}

	public String[] getData() {
		String surnames = surname1 + " " + surname2;
		return formatData(dni, name, surnames, email, phoneNumber).split(",");
	}

	private String formatData(String... inputData) { // Return the fields separated by commas
		String formatedStr = "";
		for (String data : inputData) {
			formatedStr += data + ",";
		}
		return formatedStr;
	}

}

class FileManager {

	private File file;

	public FileManager(File file, boolean append) { // Append is used to delete or not the file content
		this.file = file;
		if (!append) {
			file.delete();
		}
	}

	public void writeInFile(String[] data) {
		try {

			RandomAccessFile raf = new RandomAccessFile(file, "rw");

			for (int i = 0; i < data.length + 1; i++) {
				raf.seek(file.length());
				switch (i) {
				case 0:
					String dni = data[i];
					raf.write(dni.getBytes());
					break;
				case 1:
					String name = data[i];
					raf.seek(raf.getFilePointer() + (9 - data[i - 1].length()));
					raf.write(name.getBytes());
					break;
				case 2:
					String surnames = data[i];
					raf.seek(raf.getFilePointer() + (20 - data[i - 1].length()));
					raf.write(surnames.getBytes());
					break;
				case 3:
					String phoneNumber = data[i];
					raf.seek(raf.getFilePointer() + (50 - data[i - 1].length()));
					raf.write(phoneNumber.getBytes());
					break;
				case 4:
					String email = data[i];
					raf.seek(raf.getFilePointer() + (9 - data[i - 1].length()));
					raf.write(email.getBytes());
					break;
				case 5:
					raf.seek(raf.getFilePointer() + (50 - data[i - 1].length() - 1));
					raf.write('\0');
					break;
				default:
					break;
				}
			}
			raf.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
