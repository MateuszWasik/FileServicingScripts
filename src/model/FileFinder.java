package model;

import java.io.File;

public class FileFinder {

	public void findfile(String path, String file) {
		
		File plik = new File(path);
		
		File[] sciezka = plik.listFiles();
		
		file.toLowerCase();
		
		String temp;

		for (File i : sciezka) {
			
			temp = i.toString().toLowerCase();
			
			if (i.isFile()) {

				if (temp.contains(file.toLowerCase())) {

					System.out.println(temp);

				} else {
				}

			} else if (i.isDirectory()) {

				if (temp.contains(file.toLowerCase())) {

					System.out.println(temp);

					findfile(temp, file);

				} else {

					findfile(temp, file);

				}
			}
		}

	}


}
