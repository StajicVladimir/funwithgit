package funwithgit;

public class HairyMonster {
	private String name;
	
	public HairyMonster(String name){
		this.name=name;
	}
	
	public void sayHi(){
		System.out.println("ROOOOAAAARRR!!");
	}
	
	public void sayName(){
		System.out.println("Bwwraaarrr "+name+" smaaasshhh!");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
