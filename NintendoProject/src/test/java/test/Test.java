package test;

import model.Adresse;
import model.Boutique;
import model.Console;

public class Test {

	public static void main(String[] args) {
		/*TODO modifier l'instantiation de console
		Console c1 = new Console("Nintendo 64");
		Console c2 = new Console("Gamecube");
		Console c3 = new Console("Wii");
		Console c4 = new Console("Wii U");
		Console c5 = new Console("Switch");*/
		
		Adresse ab1 = new Adresse(5,"rue Baudrimont","Toulouse");
		Boutique b1 = new Boutique("GameOne", ab1);

	}

}
