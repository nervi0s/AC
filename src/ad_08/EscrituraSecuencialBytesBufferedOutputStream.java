package ad_08;

import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;

import java.util.ArrayList;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class EscrituraSecuencialBytesBufferedOutputStream {

	public static void main(String[] args) {

		File file = new File("./resources/writed/EscrituraBufferedOutputStream");
		byte[] rawBytes = getBytesFromStr("./resources/bytesInDecimal2.txt");

		try {
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file));
			bos.write(rawBytes);
			bos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static byte[] getBytesFromStr(String path) {

		File file = new File(path);
		byte[] bytes = null;
		ArrayList<Byte> bytesList = new ArrayList<Byte>();

		try {
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));

			String content = "";
			int i;

			while ((i = bis.read()) != -1) { // Read and add to bytesList
				if ((char) i != ',' && (char) i != '\n') {
					content += (char) i;
				} else {
					if (!content.isEmpty()) { // avoid ",\n" errors
						bytesList.add(Byte.valueOf(content));
					}
					content = "";
				}
			}
			bis.close();

			// System.out.println(bytesList.size());
			bytes = new byte[bytesList.size()];
			for (int j = 0; j < bytes.length; j++) {
				bytes[j] = bytesList.get(j);
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
