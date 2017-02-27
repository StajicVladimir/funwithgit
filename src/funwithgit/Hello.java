package funwithgit;

public class Hello {
	public static void main(String[] args){
		System.out.println("Hello Git! What's up?");
		
		HairyMonster momo = new HairyMonster("Momo");
		momo.sayHi();
		momo.sayName();
		
		Hero beardyBeard = new Hero("Beardy Beard");
		beardyBeard.sayHi();
		
		Bartender barney = new Bartender("Barney");
		barney.listAllDrinks();
	}
}