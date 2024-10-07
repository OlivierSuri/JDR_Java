import java.util.Scanner;

public class Menu {

    Scanner scanner;


    public Menu() {
        this.scanner = new Scanner(System.in);

    }

    public int firstMenuChoice () {
        Scanner myMenu = new Scanner(System.in);// Create a Scanner object
        System.out.println("Nouveau Personnage: 1");
        System.out.println("Quitter: 2");
        int menuChoice = myMenu.nextInt();// Read user input
        return menuChoice;
    }




     public Personnage createCharac() {
         System.out.println("Créer un nouveau personnage");  // Output user input
         String name = askCharacName();
         String type = askCharacType();

         Personnage personnage = new Personnage(name, type);
         System.out.println(personnage);

         return personnage;
     }

     public int secondChoiceMenu() {
        System.out.println("\nValider le personnage: type '1'");
        System.out.println("Modifier mon personnage: type '2'");
        int secondChoiceMenu = scanner.nextInt();
        return  secondChoiceMenu;
     }


     public int modifyChoice() {
        System.out.println("modifier le nom ? type '1'");
        System.out.println("modifier la classe ? type '2'");
        int modifchoice = scanner.nextInt();
        return modifchoice;
    }

    public int rollChoice() {
        System.out.println("\nlancer le dé? type '1'");
        System.out.println("Quitter le jeu ? type '2'");
        int rollchoice = scanner.nextInt();
        return rollchoice;
    }



    public String askCharacName () {
        System.out.println("Entrer votre Nom");
        scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        return name;
    }



    public String askCharacType () {
        System.out.println("Warrior: 1 ou Magician: 2");
        scanner = new Scanner(System.in);
        int characChoice = scanner.nextInt();
        String type = "";

//            if (characChoice == 1) {
//                type = "Warrior";
//            }
//            else if (characChoice == 2) {
//                type = "Magician";
//            }

        type = (characChoice == 1) ? "Warrior" : "Magician"; //identique au if else if au dessus
        return type;
    }



     public void exit() {
        System.out.println("QUITTER le jeu ?");
        System.out.println("YES: '1'");
        System.out.println("NO: '2'");
        int confirmExit = scanner.nextInt();
        System.out.println("Quitter le jeu: " + confirmExit);
        System.exit(0);
    }
}

