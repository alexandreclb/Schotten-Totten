package fond.cartes;

import java.util.Collections;

public class Main extends PaquetDeCartes {

	//initialise des constantes pour savoir combien de cartes composent la main selon mode
	//6 pour mode normal, 7 pour mode tactique
	private static final int TMAX_CLAN = 6;
	private static final int TMAX_TACT = 7;
	
	public Main(Pioche pioche) {
		super();
		creeMain(pioche);
	}
	
	//on pioche les premieres cartes de la main
	public void creeMain(Pioche pioche) {
		for (int i=0;i<TMAX_CLAN;i++) {
			Carte cartePiochee = pioche.piocher(); //methode de la classe pioche
			
			if (cartePiochee != null) {
				this.ajouterCarte(cartePiochee);
			}
		}
	}
	
	//afficher la main pour joueur 
	public void afficherMain() {
		System.out.println("Votre Main : ");
		for (int i=0; i< this.cartes.size();i++) {
			
			//afficher l'indice pour chaque carte (utile pour choisir laquelle jouer)
			System.out.println("( "+i+ " : "+ this.cartes.get(i));
		}
	}
	
	
	//joueur sort une carte de sa main pour la jouer
	public Carte jouerCarte(int indice) {
		//on verifie si l'indice donne est correct
		if (indice >=0 && indice<this.cartes.size()) {
			return this.cartes.remove(indice);
		} else {
			System.out.println("Mauvais indice donné");
			return null;
		}
		
	}
	
	//trier la main pour avoir une bonne organisation
	public void trierMain() {
		Collections.sort(this.cartes, (c1,c2) -> {
			//important de convertir les objet de type carte en carteclan
			CarteClan clan1 = (CarteClan) c1;
			CarteClan clan2 = (CarteClan) c2;
			
			//utilise la methode compareTo dans carte clan pour sort.
			return clan1.compareTo(clan2);
		});
	}
}
