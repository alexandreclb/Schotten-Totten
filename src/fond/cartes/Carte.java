package fond.cartes;

public abstract class Carte {
	
	protected String nom;
	private boolean estJouee;
	
	//constructeur de classe
	public Carte(String nom) {
		this.nom=nom;
		this.estJouee=false;
	}
	
	//differents getters et setters
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom=nom;
	}
	
	public boolean estJouee() {
		return estJouee;
	}
	
	public void setEstJouee(boolean estJouee) {
		this.estJouee=estJouee;
	}
}