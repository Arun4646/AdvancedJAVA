package classPackages;

import interfacePackages.Badminton;
import interfacePackages.Cricket;

public class Player1 implements Badminton, Cricket {
	
	String name;
	
	public Player1(String nameofPlayer) {
		
		name = nameofPlayer;
	}

	public void canSmash() {
		
		System.out.println(name+" play Badminton and I can smash");
	}

	public void canServe() {
		
		System.out.println(name+" play Badminton and I can smash");
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
