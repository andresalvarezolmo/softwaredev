
public class Gymnast extends Competitor{

	private String country;
	private int finalScore;
	
	
	
	public Gymnast(String country, int finalScore, String name, String address) {
		super(name, address);
		this.country = country;
		this.finalScore = finalScore;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getFinalScore() {
		return finalScore;
	}
	public void setFinalScore(int finalScore) {
		this.finalScore = finalScore;
	}
	
	public void printDetails () {
		super.printDetails();
		System.out.println("Competitor Country : " + getCountry());
		System.out.println("Competitor Finalscore : " + getFinalScore());
		System.out.println();
	}
	
	
}
