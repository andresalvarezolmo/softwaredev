
/**
 * @author andresalvarezolmo
 *
 */
public class Director{

	// main method
	public static void main(String[] args) {
		
		//create a new instance of competitor
		Competitor test = new Competitor();
		
		// we call the method to set a name 
		test.setName("");
		
		// print the name we just set
		System.out.println(test.getName());
	
		
		Gymnast jim = new Gymnast("UK ",12,"Jim","Lille");
		Photographer ed = new Photographer ("Begginner ", "Great", "Ed", "Porto");
		Swimmer michael = new Swimmer (87 , 45 , "Michael" , "Dallas");
		
		
		System.out.println("1st Competitor (Gymnast)");
		jim.printDetails();
		System.out.println("2nd Competitor (Photographer)");
		ed.printDetails();
		System.out.println("3rd Competitor (Swimmer)");
		michael.printDetails();
	}
	
}

