package funwithgit;

public class Bartender {
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Bartender(String name){
		this.name =name;
	}
	
	public void listAllDrinks(){
		System.out.println("We have... We have... BEER!!!");
	}
}
