import java.util.Scanner;

public class Choice {

	
	public static void GetYourGrade (){
		do {
		System.out.println("Get your grade has been executed");
		System.out.println("Please, enter your grade in percentage:");
		Scanner in = new Scanner(System.in);
	    double Grade = in.nextDouble();
		
		
		if (Grade>69 && Grade <100) {
			System.out.println("You got an A");
		}
		else if (Grade>59 && Grade <100) {
			System.out.println("You got an B");
		}	
		else if (Grade>49 && Grade <100) {
			System.out.println("You got an C");
		}
		else if (Grade>39 && Grade <100  ) {
			System.out.println("You got an D");
		}	
		else if (Grade<=40 && Grade >0) {
			System.out.println("You got an E");
		}
		else if (Grade==0) {
			break;
		}
			
		else {
			System.out.println("Invalid value, enter a valid one");	
		}
	}
		while(true);
		}
	
	public static void TableValues (){
		
		System.out.println("Tables values method has been executed");
		System.out.println("Please, enter two integer values (separated by a space and the first one smaller than the second one:");
		Scanner in = new Scanner(System.in);
		int lower=Integer.parseInt(in.next());
		int upper=Integer.parseInt(in.next());
		
		for (int lower=0;lower==upper;lower++) {
			
		}
		
	}
	
	public static  void Choice3 (){
			
		System.out.println("Choice 3 executed");
	
	}
	
	public static void Choice4 (){
		
		System.out.println("Choice 4 executed");
		
	}
	
	public static void exit ()
	{
		System.out.println ("Bye bye");
		
	}
	
	}
	

