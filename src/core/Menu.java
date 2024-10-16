package core;

import personnages.Guerrier;
import personnages.Magicien;
import personnages.Personnage;

import java.util.Scanner;

/**
 * La classe core.Menu gère les interactions avec l'utilisateur dans le cadre du jeu, notamment la création
 * du personnage, la sélection de choix et les options de jeu.
 */
public class Menu {

    /**
     * Scanner utilisé pour la saisie utilisateur.
     */
    Scanner scanner;

    /**
     * Constructeur de la classe core.Menu.
     * Initialise un nouvel objet Scanner pour la lecture des entrées utilisateur.
     */
    public Menu() {
        this.scanner = new Scanner(System.in);
    }

    /**
     * Affiche le premier menu pour choisir entre créer un nouveau personnage ou quitter le jeu.
     *
     * @return un entier représentant le choix de l'utilisateur (1 pour créer un personnage, 2 pour quitter).
     */
    public int firstMenuChoice() {
        Scanner myMenu = new Scanner(System.in);
        System.out.println("Créer un nouveau personnage: 1");
        System.out.println("Quitter: 2");
        int menuChoice = myMenu.nextInt();
        return menuChoice;
    }

    /**
     * Crée un nouveau personnage en demandant à l'utilisateur de fournir un nom et un type (Guerrier ou Magicien).
     *
     * @return un objet Personnage créé en fonction des choix de l'utilisateur.
     */
    public Personnage createCharac() {
        System.out.println("Créer un nouveau personnage");
        String name = askCharacName();
        String type = askCharacType();
        Personnage personnage;
        if (type.equals("Warrior")) {
            personnage = new Guerrier(name);
        } else {
            personnage = new Magicien(name);
        }
        System.out.println(personnage);
        return personnage;
    }

    /**
     * Affiche le deuxième menu qui permet de valider ou modifier le personnage.
     *
     * @return un entier représentant le choix de l'utilisateur (1 pour valider, 2 pour modifier).
     */
    public int secondChoiceMenu() {
        System.out.println("\nValider le personnage: type '1'");
        System.out.println("Modifier mon personnage: type '2'");
        int secondChoiceMenu = scanner.nextInt();
        return secondChoiceMenu;
    }

    /**
     * Affiche le menu pour modifier soit le nom, soit la classe du personnage.
     *
     * @return un entier représentant le choix de modification de l'utilisateur (1 pour le nom, 2 pour la classe).
     */
    public int modifyChoice() {
        System.out.println("modifier le nom ? type '1'");
        System.out.println("modifier la classe ? type '2'");
        int modifchoice = scanner.nextInt();
        return modifchoice;
    }

    /**
     * Affiche le menu de jeu avec les options pour lancer le dé, afficher le personnage, ou quitter le jeu.
     *
     * @return un entier représentant le choix de l'utilisateur (1 pour lancer le dé, 2 pour afficher le personnage, 3 pour quitter).
     */
    public int rollChoice() {
        System.out.println("\n\n====================================");
        System.out.println("Lancer le dé ? type '1'");
        System.out.println("Afficher mon personnage ? type '2'");
        System.out.println("Quitter le jeu ? type '3'");
        System.out.println("====================================");
        int rollchoice = scanner.nextInt();
        return rollchoice;
    }

    /**
     * Demande à l'utilisateur d'entrer un nom pour le personnage.
     *
     * @return une chaîne de caractères représentant le nom du personnage.
     */
    public String askCharacName() {
        System.out.println("Entrer votre Nom");
        scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        return name;
    }

    /**
     * Demande à l'utilisateur de choisir entre un Guerrier ou un Magicien.
     *
     * @return une chaîne de caractères représentant le type de personnage sélectionné (Warrior ou Magician).
     */
    public String askCharacType() {
        System.out.println("Warrior: 1 ou Magician: 2");
        scanner = new Scanner(System.in);
        int characChoice = scanner.nextInt();
        String type;

        type = (characChoice == 1) ? "Warrior" : "Magician"; // Ternary operator pour définir le type
        return type;
    }

    public int combatMenu() {
        System.out.println("Attaquer: 1");
        System.out.println("Fuir le combat: 2");
        int combatMenuChoice = scanner.nextInt();
        return combatMenuChoice;
    }



    /**
     * Affiche un message pour confirmer si l'utilisateur veut quitter le jeu, et quitte l'application si l'utilisateur confirme.
     */
    public void exit() {
        System.out.println("QUITTER le jeu ?");
        System.out.println("YES: '1'");
        System.out.println("NO: '2'");
        int confirmExit = scanner.nextInt();
        System.out.println("Quitter le jeu: " + confirmExit);
        System.exit(0);
    }
}
