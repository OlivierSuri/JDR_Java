import core.Game;

/**
 * Classe principale pour démarrer le programme.
 * Cette classe initialise le jeu et affiche le menu de démarrage.
 */

public class Main {
    /**
     * Méthode principale du programme.
     * Elle crée une instance de la classe core.Game et lance le menu de démarrage.
     *
     * @param args Les arguments de ligne de commande (non utilisés dans cette implémentation).
     */

    public static void main(String[] args) {
       Game game = new Game();
       game.startMenu();

    }

}