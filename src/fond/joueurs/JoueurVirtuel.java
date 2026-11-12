package fond.joueurs;

import fond.cartes.Pioche;

public class JoueurVirtuel extends Joueur {
	
	private final String nom = "SchottenBoss";

	public JoueurVirtuel(String nom, Pioche pioche) {
		super(nom, pioche);
	}
}
