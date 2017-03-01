package view;

import java.io.IOException;

import controller.Controller;

public class View {

	
	
	public static void main(String[] args) throws IOException {

		Controller controller = new Controller();
		
		Integer choosen = controller.CollectData();
		controller.Using(choosen);
		

	}

}
