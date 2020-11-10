package ad_03;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

import java.io.BufferedReader;

public class LecturaSecuencialBufferedReader {

	public static void main(String[] args) {

		File file = new File("./El Quijote - Cap 1.txt");

		try {
			BufferedReader buffReader = new BufferedReader(new FileReader(file));
			String msg = buffReader.readLine();
			System.out.println(msg);
			buffReader.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
