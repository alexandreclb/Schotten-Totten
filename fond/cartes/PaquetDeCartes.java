package fond.cartes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class PaquetDeCartes {

	protected List<Carte> cartes;
		
	//constructeur : creation d'une liste de cartes
	public PaquetDeCartes() {
		this.cartes=new ArrayList<>();
	}
	
	//permet d'ajouter une carte à tout paquet
	public void ajouterCarte(Carte c) {
		if (c != null) {
			this.cartes.add(c);
		}
	}
	
	//permet de retirer une carte à tout paquet
	public void retirerCarte(Carte c) {
		this.cartes.remove(c);
	}
	
	//avoir le nombre de cartes
	public int getNombreCarte() {
		return this.cartes.size();
	}
	
	//savoir si paquet vide
	public boolean estVide() {
		return this.cartes.isEmpty();
	}
	
	//melanger un paquet
	public void melanger() {
		Collections.shuffle(cartes);
	}
	
	
}