
public class Swimmer extends Competitor{
	
	private int speed;
	private int weight;
	
	
	public Swimmer(int speed, int weight, String name, String address) {
		super(name, address);
		this.speed = speed;
		this.weight = weight;
		
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public void printDetails () {
		super.printDetails();
		System.out.println("Competitor speed (in km/h) " + speed + "km/h");
		System.out.println("Competitor weight (in kg) " + weight + "kg");
		System.out.println();

	}
}
