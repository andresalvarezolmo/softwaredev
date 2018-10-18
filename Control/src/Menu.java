


import java.util.Scanner;

public class Menu {
	public void processUserChoices () {
	do {		
			displayMenu();
			Scanner in = new Scanner(System.in);
			String userChoice = in.nextLine();
		
		
		if (userChoice.equals("1")) {
			Choice.Choice1();
		}
		else if (userChoice.equals("2")) {
			Choice.Choice2();
		}	
		else if (userChoice.equals("3")) {
			Choice.Choice4();
		}
		else if (userChoice.equals("4")) {
			Choice.Choice4();
		}	
		
		else {
			System.out.println("Invalid value, enter a valid one");	
			}
		
	} 
	while(true);
	}
	
	public void displayMenu(){
	System.out.println("Please select one of the options below");
	System.out.println("1. Option 1");
	System.out.println("2. Option 2");
	System.out.println("3. Option 3");
	System.out.println("4. Option 4");
	System.out.println("exit");
	}
		
		

	public static void main(String[] args) {
		
		Menu myMenu = new Menu();
		myMenu.runMenu();
	
	}
	
	
	public void runMenu()
	{
		processUserChoices();
	}
}
