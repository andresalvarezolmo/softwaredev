import java.util.Scanner;

public class Choice {

	
	public static void GetYourGrade (){
		do {
		System.out.println("Get your grade has been executed");
		System.out.println("Please, enter your grade in percentage (enter 0 to go back to the menu):");
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
		System.out.println("Please, enter the upper bound :");
		Scanner in = new Scanner(System.in);
		int lower;
		
		int upper=in.nextInt();
		

		do {
			System.out.println("Please, enter the lower bound :");
			lower=in.nextInt();
			
			if (lower >= upper) {
				System.out.println("ERROR LOWER");
			}
		} while (lower >= upper);
		
		
		
		
		int y = lower;
		
		if (y<upper) {
			for (y=lower;y<=upper;y++) {
				
				System.out.println("Value:\tSquare:\tCube:\tSquare Root: ");
				System.out.println(y + "\t"+y*y + "\t"+y*y*y + "\t"+Math.sqrt(y));
			}
		}
			
			else{
			
			System.out.println("Wrong values, remember that the first one must be bigger than the second one and they should be separated by a space");
		}
		
		}//for loop finishes 
		
	
	public static  void InputStatistics (){
		
		Scanner in = new Scanner(System.in);

		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		int d=in.nextInt();
		
		while (a!=-1 && b!=-1 && c!=-1 && d!=-1);
		System.out.println("InputStatistics executed");
		System.out.println("Please, enter the first bound :");
		a=in.nextInt();
		System.out.println("Please, enter the second bound :");
		b=in.nextInt();
		System.out.println("Please, enter the third bound :");
		c=in.nextInt();
		System.out.println("Please, enter the forth bound :");
		d=in.nextInt();

		
	}
	
	public static void Choice4 (){
		
		System.out.println("Choice 4 executed");
		
	}
	
	public static void exit ()
	{
		System.out.println ("Bye bye");
		
	}
	
	}
	

