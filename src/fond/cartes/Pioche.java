package fond.cartes;

//import java.util.List;

public class Pioche extends PaquetDeCartes {
	
	
	//constructeur de la pioche : on appelle le constructeur du PaquetDeCartes pour avoir une liste de carte
	//on initialise ce paquet en creant les cartes clan (necessaires à toute partie)
	public Pioche() {
		super();
		initialiserPiocheClan();
	}

	//creation de toutes les cartes clan (force entre 1 et 9 et couleur dans enumeration)
	public void initialiserPiocheClan() {
		//met les couleurs dans un tableau de valeurs
		for (int force = 1; force<=9;force++) {
			//met les couleurs dans un tableau de valeurs
			for (Couleur couleur : Couleur.values()) {
				CarteClan c = new CarteClan(force,couleur);
				this.ajouterCarte(c);
			}
		}
		this.melanger();
	}
	
	public void initialiserPiocheTactique() {}
	
	public Carte piocher() {
		//verifie que pioche n'est pas vide
		if (!this.estVide()) {
			//retire et renvoie la premiere carte de la pioche
			return this.cartes.remove(0);
		}
		return null;
	}
}
