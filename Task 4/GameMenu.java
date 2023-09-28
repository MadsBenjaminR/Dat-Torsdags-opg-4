import java.util.ArrayList;

public class GameMenu{
	
private ArrayList<String> actions;

public GameMenu(ArrayList<String> actions){
this.actions = actions;

 }

 public void displayMenu(){

 	for(String k : actions){
 		System.out.println(k);
 	}
  }
}