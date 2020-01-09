package classPackages;
import interfacePackages.Badminton;
import interfacePackages.Cricket;

public class Player2 implements Badminton, Cricket {

	String name;
	
	public Player2(String nameofPlayer) {
		
		name = nameofPlayer;
	}
	
	public void canSmash() {
		
		System.out.println(name+" don't play Badminton and I can't smash");
	}

	public void canServe() {
		
		System.out.println(name+" don't play Badminton and I can't smash");
	}
	
	public void canBat() {
		
		System.out.println(name+" play Cricket and I can bat");
	}

	public void canBowl() {
		
		System.out.println(name+" play Cricket and I can bowl");
	}
	
	public void canKeep() {
		
		System.out.println(name+" play Cricket and I can Keep");
	}
}
