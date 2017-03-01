package controller;

import java.util.Scanner;

import model.AllFoldersView;
import model.FileFinder;
import model.FolderSize;
import model.FoldersLength;
import model.FoldersPermissions;
import java.io.IOException;

public class Controller {

	Scanner reader = new Scanner(System.in);
	String path = "";
	Integer choosen = 0;
	String file = "";

	public int CollectData() {

		System.out.println("Please provide path: ");
		this.path = reader.nextLine();

		System.out.println("1. View all folders");
		System.out.println("2. Find file");
		System.out.println("3. Check folder size");
		System.out.println("4. Check folder lenght");
		System.out.println("5. List folder permissions");

		choosen = reader.nextInt();

		if (choosen == 2) {

			System.out.println("Provide file name with or without extension");
			this.file = reader.next();
		}

		return choosen;

	}

	public void Using(Integer choosen) throws IOException {

		switch (choosen) {

		case 1:

			AllFoldersView c1 = new AllFoldersView();
			c1.view_all_folders(path);
			break;

		case 2:
			FileFinder c2 = new FileFinder();
			c2.findfile(path, file);
			break;

		case 3:
			FolderSize c3 = new FolderSize();
			c3.check_size(path);
			break;

		case 4:
			FoldersLength c4 = new FoldersLength();
			c4.check_length(path);
			break;

		case 5:
			FoldersPermissions c5 = new FoldersPermissions();
			c5.view_permissions(path);
			break;

		}

	}

	public static void main(String[] args) {

	}

}
