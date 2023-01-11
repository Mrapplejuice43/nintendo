package test;

import java.time.LocalDate;
import model.Adresse;
import model.Boutique;
import model.Console;
import model.Hybride;
import model.Portable;
import model.Salon;

import java.util.List;

import model.Client;
import model.Jeu;


public class Test {

	public static void main(String[] args) {
		
		Salon c1 = new Salon("Nintendo 64", 25, LocalDate.parse("2016-03-23"));
		Salon c2 = new Salon("Gamecube", 87,  LocalDate.parse("2015-03-23"));
		Salon c3 = new Salon("Wii",12,  LocalDate.parse("2010-03-23"));
		Portable c4 = new Portable("GameBoy",41, LocalDate.parse("2015-03-23"));
		Hybride c5 = new Hybride("Switch",14, LocalDate.parse("2014-03-23"));
		
		Adresse ab1 = new Adresse(5,"rue Baudrimont","Toulouse");
		Boutique b1 = new Boutique("GameOne", ab1);
		
		Jeu j1= new Jeu("mario",c1,b1);
		Jeu j2= new Jeu("luigi",c2,b1);
		

		
		Client client1 =new Client("Eliot","Doremi");
		Client client2 =new Client("Bartis","Salvador");
		client1.ajoutAchats(j1);
		client2.ajoutAchats(j2);
		
		

	}

}
