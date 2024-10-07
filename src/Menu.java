import java.util.Scanner;

public class Menu {

    Scanner scanner;


    public Menu() {
        this.scanner = new Scanner(System.in);

    }

    public void firstMenuChoice (){
        Scanner myMenu = new Scanner(System.in);// Create a Scanner object
        System.out.println("Nouveau Personnage: 1");
        System.out.println("Quitter: 2");
        int menuChoice = myMenu.nextInt();// Read user input
        if (menuChoice == 1) {
            createCharac();
        }
        else if (menuChoice == 2) {
            exit();
        }

    }

     public Personnage createCharac() {
        System.out.println("Créer un nouveau personnage");  // Output user input
        String name = askCharacName();
        String type = askCharacType();

        Personnage personnage = new Personnage(name, type);
        System.out.println(personnage);

        System.out.println("\nValider le personnage: type '1'");
        System.out.println("Modifier mon personnage: type '2'");
        int caracCreatEnd = scanner.nextInt();
        if (caracCreatEnd == 1) {

            // lancer le plateau de jeu

        }
        else if (caracCreatEnd == 2) {
            Personnage modifPersonnage = modifyCharac(personnage);
            System.out.println(modifPersonnage);
        }
        return personnage;
    }

    public Personnage modifyCharac (Personnage personnage) {

        System.out.println("modifier le nom ? type '1'");
        System.out.println("modifier la classe ? type '2'");
        int modifchoice = scanner.nextInt();
        if (modifchoice == 1) {
            String newName = askCharacName();
            personnage.setName(newName);
        }
        else if (modifchoice == 2) {
            String newType = askCharacType();
            if (newType.equals("Warrior")) {
                personnage.setType(newType);
                personnage.setHp(10);
                personnage.setAttackForce(10);
                personnage.setDefensif(new EquipementDefensif("Bouclier", 10, "Bouclier rond"));
                personnage.setOffensif(new EquipementOffensif("Arme", 10, "Hache"));
            }
            else if (newType.equals("Magician")) {
                personnage.setType(newType);
                personnage.setHp(6);
                personnage.setAttackForce(15);
                personnage.setDefensif(new EquipementDefensif("Bouclier", 10, "Bouclier rond"));
                personnage.setOffensif(new EquipementOffensif("Arme", 10, "Hache"));
            }


        }
        return personnage;
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
        System.out.println("Quitter le jeu ?");
        System.out.println("YES");
        System.out.println("NO");
        String confirmExit = scanner.nextLine();
        System.out.println("Quitter le jeu ?" + confirmExit);
        System.exit(0);
    }
}

