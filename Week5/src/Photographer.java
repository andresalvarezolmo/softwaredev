
public class Photographer extends Competitor{

	private String entryCategory;
	private String comment;
	
	
	
	public Photographer(String entryCategory, String comment, String name, String address) {
		super(name, address);
		this.entryCategory = entryCategory;
		this.comment = comment;
	}
	public String getEntryCategory() {
		return entryCategory;
	}
	public void setEntryCategory(String entryCategory) {
		this.entryCategory = entryCategory;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
	public void printDetails () {
		super.printDetails();
		System.out.println("Competitor Entrycategory : " + getEntryCategory());
		System.out.println("Competitor comment : " + getComment());
		System.out.println();
	}
	
}
