package fond.cartes;

public class CarteClan extends Carte implements Comparable<CarteClan>{
	
	private int force;
	private Couleur coul;
	
	public CarteClan(int force, Couleur coul ) {
		super(coul.name() + " " + force); //le nom d'une carte clan est sa couleur associé à sa force
		this.force=force;
		this.coul=coul;
	}
	
	//getters et setters
	public Couleur getCouleur() {
		return coul;
	}
	
	public void setCouleur(Couleur coul) {
		this.coul=coul;
	}
	
	public int getForce() {
		return force;
	}
	
	public void setForce(int force) {
		this.force=force;
	}
	
	public void afficher() {
        System.out.println(toString());
    }
	
	

    @Override
    public String toString() {
        return "Carte Clan [nom=" + getNom() + ", force=" + force + ", couleur="+coul+"]";
    }
	
    @Override
	public int compareTo(CarteClan autre) {
		//on compare d'abord les couleurs (avec ordre enumeration);
		int compCouleur = this.coul.compareTo(autre.coul);
		
		//si couleurs differentes, alors on les trie
		if (compCouleur != 0) {
			return compCouleur;
		}
		
		//si meme couleur, tri par force croissante
		return Integer.compare(this.force,  autre.force);
	}
}
