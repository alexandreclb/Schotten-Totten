package controle;



import fond.cartes.Pioche;
import fond.cartes.Main;
import fond.cartes.Carte;

public class ControleurJeu {
	public static void main(String[] args) {
        System.out.println("=== 1. TEST DE LA PIOCHE ===");
        // On crée la pioche (cela doit initialiser les 54 cartes clan et les mélanger)
        Pioche maPioche = new Pioche();
        System.out.println("Nombre de cartes initiales dans la pioche : " + maPioche.getNombreCarte());

        System.out.println("\n=== 2. TEST DE LA MAIN DU JOUEUR ===");
        // On crée la main d'un joueur en lui passant la pioche
        Main maMain = new Main(maPioche);
        
        // On affiche la main non triée
        System.out.println("Main reçue (non triée) :");
        maMain.afficherMain();
        
        // On vérifie combien il reste de cartes dans la pioche après la distribution
        System.out.println("\nCartes restantes dans la pioche : " + maPioche.getNombreCarte());

        System.out.println("\n=== 3. TEST DU TRI DE LA MAIN ===");
        // On trie la main grâce à Comparable et Collections.sort
        maMain.trierMain();
        System.out.println("Main après le tri :");
        maMain.afficherMain();
        
        System.out.println("\n=== 4. TEST DE JEU D'UNE CARTE ===");
        // On simule le joueur qui joue la carte à l'indice 0 de sa main
        Carte carteJouee = maMain.jouerCarte(0);
        System.out.println("Carte jouée : " + carteJouee);
        
        System.out.println("\nMain après avoir joué une carte :");
        maMain.afficherMain();
    }
}
