package model;

import java.io.File;

public class AllFoldersView {
	
	 public void view_all_folders(String path) {

	        File directory = new File(path);
	        File[] fList = directory.listFiles();
	        

	        for (File index : fList) {
	        	
	            if (index.isDirectory()) {
	            	
	                String temp = index.toString();
	                
	                System.out.println(temp);
	                
	                view_all_folders(temp);
	                
	            } else if (index.isFile()){
	            	
	                System.out.println(index);
	            }
	            else {}
	            }
	        }


}
