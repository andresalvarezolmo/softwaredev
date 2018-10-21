import java.util.Scanner;

public class Choice {

	//static double Grade;
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
				
		int a = 0, quant = 0, min = 0, max = 0, sum = 0;
		float avg;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the first bound");
		a = in.nextInt();
		
		quant++;
		min=max=sum=a;
		avg=sum/quant;
		
		if (a!=-1) {
		System.out.println("Num: " + a);
		System.out.println("Min: " + a);
		System.out.println("Max: " + a);
		System.out.println("Average: " + avg);
		System.out.println("Quantity: " + quant);
		System.out.println("Total: " + a);
		}
		
		else {
			System.out.println("You came back to the menu");
		}
		
		while(a!=-1) {
				
				System.out.println();
				System.out.println("Enter another bound (enter '-1' to go to the menu again):");
				a = in.nextInt();
				
				if (a!=-1) {
					
				quant++;
				sum+=a;
				avg=sum/quant;
				
				if(a>max) {
				max=a;
				}
				
				if (a<min) {
				min=a;
				}
			
				System.out.println("Num: " + a);
				System.out.println("Min: " + min);
				System.out.println("Max: " + max);
				System.out.println("Total: " + sum);	
				System.out.println("Average: " + avg);
				System.out.println("Quantity: " + quant);
	
				} 
				else {
					System.out.println("You came back to the menu");
				}
		}	
	}
			
	
	public static void seeYourMark (){
		
		System.out.println("See your mark has been executed");
		System.out.println("Please, enter your mark in percentage (enter -1 to go back to the menu):");
		Scanner in = new Scanner(System.in);
	    double Grade = in.nextDouble();
		
	    do {
	    	if (0<Grade && Grade<100){
				Choice.GetYourGrade();
	    	}
	    	
	    	
	    	else {
	    		break;
	    	}
	    	
	    }
	    while (Grade!=-1);
	}
	
	public static void exit ()
	{
		System.out.println ("Bye bye");
		
	}
	
	}
	

