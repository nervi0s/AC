package ad_12;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class XmlCreator {
	private List<String[]> tags;
	private File file;

	public XmlCreator(String... rootTag) { // Crea la cabecera del XML y las etiquetas que contiene
		tags = new ArrayList<String[]>();
		tags.add(rootTag);
	}

	public void addTag(String... tag) { // Crea etiquetas y sus hijas en caso de tenerlas
		tags.add(tag);
	}

	public void createXmlDoc(String path) { // Creación del DTD
		file = new File(path);

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
			bw.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
			bw.newLine();
			bw.write("<!DOCTYPE " + tags.get(0)[0] + "[");
			bw.newLine();

			for (int i = 0; i < tags.size(); i++) {
				String[] tagData = tags.get(i);
				if (tagData.length == 1) {
					bw.write("\t<!ELEMENT " + tagData[0] + " (#PCDATA)>");
				} else {
					String childs = "";
					for (int j = 1; j < tagData.length; j++) {
						if (j == tagData.length - 1) {
							childs += tagData[j];
						} else {
							childs += tagData[j] + ",";
						}
					}
					bw.write("\t<!ELEMENT " + tagData[0] + " (" + childs + ")>");
				}
				bw.newLine();
			}

			bw.write("]>");
			bw.newLine();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public File getFile() {
		return this.file;
	}

	public List<String[]> getTagList() {
		return tags;
	}

}