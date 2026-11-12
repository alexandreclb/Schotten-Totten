package fond.joueurs;

import fond.cartes.Main;
import fond.cartes.Pioche;
import fond.cartes.Carte;

//on rend la classe abstraite pour qu'il ne soit pas possible d'instancier 
//un joueur qui ne soit ni reel ni virtuel
public abstract class Joueur {
	
	protected String nom;
	protected Main main;
	
	
	//constructeur
	public Joueur(String nom, Pioche pioche) {
		this.nom=nom;
		this.main=new Main(pioche);
	}
	
	//getters
	public String getNom() {
		return nom;
	}
	
	public Main getMainJoueur() {
		return main;
	}
	
	//pouvoir afficher les ifos utiles de chaque joueur
	public void afficherInfoJoueur() {
		System.out.println("Joueur : "+this.nom);
		this.main.afficherMain();
	}
	
	//on appelle la methode jouerCarte de main pour que le joueur interagisse avec sa main
	public Carte jouerCarte(int index) {
		return this.main.jouerCarte(index);
	}
	
	//mise en relation de piocher dans pioche et ajouterCarte dans main
	public void piocherNouvelleCarte(Pioche pioche) {
		Carte cartePiochee = pioche.piocher();
		if (cartePiochee != null) {
			this.main.ajouterCarte(cartePiochee);
		}
	}
	
}
