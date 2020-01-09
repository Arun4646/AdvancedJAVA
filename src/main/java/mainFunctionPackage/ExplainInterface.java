package mainFunctionPackage;

import classPackages.Player1;
import classPackages.Player2;

public class ExplainInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Player1 P1 = new Player1("Arun");
		System.out.println("***************Player 1 characteristics***************\n");
		P1.canServe();
		P1.canSmash();
		P1.canBat();
		P1.canBowl();
		P1.canKeep();
		
		Player2 P2 = new Player2("Ajai");
		System.out.println("\n***************Player 2 characteristics***************\n");
		P2.canServe();
		P2.canSmash();
		P2.canBat();
		P2.canBowl();
		P2.canKeep();
	}

}
