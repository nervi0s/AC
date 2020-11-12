package ad_05;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// Usada para una prueba
import java.io.FileWriter;

/*
 * Con esta clase podemos leer los bytes en "raw" de un archivo, usando el
 * método read() en un bucle vamos leyendo cada byte (8 bits) del fichero hasta
 * que estos se acaban y devuelve -1. Estos bytes nos lo devuelve el formato de
 * enteros (int) pero hay que tener en cuenta que son bytes, es decir, el entero
 * devuelto será la representación en formato decimal de 8 bits (binarios), por
 * ejemplo, el entero 80 es la forma decimal de 01010000 y su valor en
 * hexadecimal es 50. Si convertimos a char ese 80 será la 'P'.
 * 
 * También podríamos usar el método readAllBytes() que devuelve un dato de tipo 
 * byte[], y guardar en un array todos estos bytes del archivo.
 * 
 * Una cosa a tener en cuenta es que una vez leído el archivo, este se "marcará" como
 * leído y no podremos volverlo a leer a no ser que volvamos a abrir un FileInputStream
 * 
 */

public class LecturaSecuencialBytesFileInputStream {

	public static void main(String[] args) {

		File file = new File("./resources/readed/bytesFiles/Logo_Google.png");

		try {
			FileInputStream fis = new FileInputStream(file);

			int i;

			// Leemos cada byte del archivo e imprimimos su "valor" en formato char
			while ((i = fis.read()) != -1) {
				System.out.print((char) i);
				// System.out.println(Integer.toBinaryString(i)); // ver cada int en binario
			}

			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		WriteBytesInDecimalFormat(file, "./resources/bytesInDecimal1.txt");
	}

	// Método de prueba
	public static void WriteBytesInDecimalFormat(File toExtract, String pathDestiny) {
		File file = new File(pathDestiny);

		try {
			FileWriter writer = new FileWriter(file);
			FileInputStream fis = new FileInputStream(toExtract);
			byte[] bytes = fis.readAllBytes();

			for (int i = 0; i < bytes.length; i++) {
				writer.write(String.valueOf(bytes[i]) + ",");
			}
			fis.close();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
