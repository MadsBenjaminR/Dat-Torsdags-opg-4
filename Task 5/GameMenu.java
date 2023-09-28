import java.util.ArrayList;
import java.util.Scanner;

public class GameMenu {
	
	private ArrayList<String> actions;

	public GameMenu(ArrayList<String> actions) {
		this.actions = actions;

	 }

	public void displayMenu() {

	 	for(String k : actions) {
	 		System.out.println(k);
	 	}
	}

	public void getAction() {

		System.out.println("Type a number to choose an action:");

		for(String k : actions){
 			System.out.println(k);

		}
	}
}