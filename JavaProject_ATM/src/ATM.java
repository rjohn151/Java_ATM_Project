import java.io.IOException;

public class ATM extends /*Access Modifiers*/ OptionMenu {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		OptionMenu optionMenu = new OptionMenu();

		 /* 
		  * Since this method called from the OptionMenu class throws an exception
		  * we have to add a throws declaration next to our main method above.
		  */
		optionMenu.getLogin();
	}

}
