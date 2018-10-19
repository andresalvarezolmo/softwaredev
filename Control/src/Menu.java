


import java.util.Scanner;

public class Menu {
	public void processUserChoices () {
	do {
		
		displayMenu();
		Scanner in = new Scanner(System.in);
		String userChoice = in.nextLine();
		
		
		if (userChoice.equals("1")) {
			Choice.GetYourGrade();
		}
		else if (userChoice.equals("2")) {
			Choice.TableValues();
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
	System.out.println("Please select one of the options below by typing the number");
	System.out.println("1. Option 1 | Get your grade");
	System.out.println("2. Option 2 | Table values");
	System.out.println("3. Option 3");
	System.out.println("4. Option 4");
	System.out.println("5. Exit");
	}
		
		
	public void runMenu()
	{
		processUserChoices();
	}
	
	
	public static void main(String[] args) {
		
		Menu myMenu = new Menu();
		myMenu.runMenu();
	
	}
	
}
