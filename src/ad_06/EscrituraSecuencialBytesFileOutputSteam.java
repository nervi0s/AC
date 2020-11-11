package ad_06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class EscrituraSecuencialBytesFileOutputSteam {

	public static void main(String[] args) {
		File file = new File("./EscrituraFileOutputStream.exe");
		byte[] bytes = getBytesFromStr("./resources/bytesInDecimal.txt");

		try {
			FileOutputStream fos = new FileOutputStream(file);
			fos.write(bytes);
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static byte[] getBytesFromStr(String path) {
		byte[] bytes = null;
		ArrayList<Byte> arrList = new ArrayList<Byte>();

		File fileWithData = new File(path);

		try {
			FileInputStream fis = new FileInputStream(fileWithData);
			String fileContent = "";
			int i;

			while ((i = fis.read()) != -1) {
				fileContent += (char) i;
			}

			fis.close();
			String[] data;
			data = fileContent.split(",");
			// System.out.println(data.length);
			for (int j = 0; j < data.length; j++) {
				arrList.add(Byte.valueOf(data[j]));
			}
			bytes = new byte[arrList.size()];
			for (int j = 0; j < bytes.length; j++) {
				bytes[j] = arrList.get(j);
			}
			// System.out.println(bytes.length);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return bytes;
	}

}
