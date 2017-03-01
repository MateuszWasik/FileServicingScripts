package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class FoldersLength {

	public void check_length(String path) throws FileNotFoundException{

		File directory = new File(path);
		File[] fList = directory.listFiles();
		List<String> Long = new ArrayList<>();
		PrintWriter plik = new PrintWriter("output.txt");

		try {
			for (File i : fList) {

				if (i.isDirectory()) {

					Long.add(i.toString());

					check_length(i.toString());

				} else if (i.isFile()) {

					Long.add(i.toString());

				}
			}
			for (String i : Long) {

				if (i.length() >= 255) {

					System.out.println(i + " - " + i.length());

					plik.println(i + " - " + i.length());

				} else {
				}
			}
		} catch (NullPointerException e) {

			System.out.println("Access denied or path no longer exist");
		}

		finally {

			plik.close();
		}

	}


}
