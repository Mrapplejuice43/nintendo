package model;

import java.time.LocalDate;

public class Hybride extends Console {

	public Hybride(String nom, double prix, LocalDate dateSortie) {
		super(nom, prix, dateSortie);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Hybride [nom=" + nom + ", prix=" + prix + ", dateSortie=" + dateSortie + "]";
	}


	
}
