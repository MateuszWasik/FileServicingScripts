package model;

import java.io.File;

public class FolderSize {

	
	double size = 0;

	
	public void check_size(String path) {

		File plik = new File(path);
		File[] list = plik.listFiles();

		for (File i : list) {
			
			if (i.isFile()) {
				
				size += i.length() / 1024;
				
			} else if (i.isDirectory()) {
				
				check_size(i.getPath());
			}
			
			System.out.println(size);
		}

		for (File i : list) {
			
			size += i.length() / 1024;
			
		}
		
		System.out.println(size);
	}

	

}
