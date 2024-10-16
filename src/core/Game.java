package core;

import board.Board;
import board.JoueurHorsPlateau;
import personnages.Guerrier;
import personnages.Magicien;
import personnages.Personnage;

/**
 * La classe core.Game gère l'exécution principale du jeu, incluant le menu,
 * la création du personnage, les déplacements sur le plateau, et les interactions avec le joueur.
 */

public class Game {


    private int playerPosition;
    private Personnage character;
    private Board gameBoard;

    /**
     * Constructeur de la classe core.Game.
     * Initialise la position du joueur, le personnage à null, et le plateau de jeu.
     */

    public Game (){
        this.playerPosition = 0;
        this.character = null;
        //init board
        this.gameBoard = new Board();
    }



    Menu startMenu = new Menu();

    /**
     * Gère le menu principal et les choix initiaux du joueur, comme la création du personnage ou la modification du personnage.
     * Débute ensuite le jeu si le joueur ne choisit pas de quitter.
     */

    public void startMenu() {
//        int firstChoice = startMenu.firstMenuChoice();
//            if (firstChoice == 1) {
//                this.character = startMenu.createCharac();
//            } else {
//                startMenu.exit();
//            }
//
//        int secondChoice = startMenu.secondChoiceMenu();
//        switch (secondChoice) {
//
//            case 2: int modifyChoice = startMenu.modifyChoice();
//                if (modifyChoice == 1) {
//                    String newName = startMenu.askCharacName();
//                    this.character.setName(newName);
//                    System.out.println(character);
//                }
//                else if (modifyChoice == 2) {
//                    String newType = startMenu.askCharacType();
//                    this.character.setType(newType);
//                    Personnage newCharacter;
//                    if (newType.equals("Warrior")) {
//                        newCharacter = new Guerrier(character.getName());
//                    }
//                    else {
//                        newCharacter = new Magicien(character.getName());
//                    }
//                    System.out.println(newCharacter);
//                }
//                break;
//
//            default: break;
//        }

        this.character = new Guerrier("Gérard");


        try {
            gameBoard.accept(character, playerPosition);
        } catch (JoueurHorsPlateau e) {
        }

        while (!gameBoard.hasWin(playerPosition)) {

            if (character.isAlive()){
                int rollChoice = startMenu.rollChoice();
                if (rollChoice == 1) {
                    clearScreen();
                    jouerUnTour();
                }
                else if (rollChoice == 2) {
                    System.out.print(character.toString());
                }
                else if (rollChoice == 2) {
                    startMenu.exit();
                }
            }else{
            String redText = "\u001B[31m";
            String resetText = "\u001B[0m";
            System.out.println(redText + "YOU DIED" + resetText);
            break;
            }
        }

    }



    private int diceRoll() {
        int dice  = (int)(Math.random()*6)+1;
//        int dice = 1;
        System.out.println("dé: " + dice);
        return dice;
    }

    private int playerMove(int pPosition, int pRoll) throws JoueurHorsPlateau {
        pPosition += pRoll;
        int interact = gameBoard.accept(this.character, pPosition);
        if(interact != 0){
            pPosition = interact;
        }
            System.out.println("Vous êtes case: " + pPosition);

        return pPosition;
    }

    private int jouerUnTour (){
        int diceResult = diceRoll();
        try {
            playerPosition = playerMove(playerPosition, diceResult);
        }catch (JoueurHorsPlateau e){
            playerPosition = gameBoard.getBoardSize()-1;
        }
        return playerPosition;
    }

    public int playerRetreat(int pPosition, int pRoll) {
        pPosition = pPosition - pRoll;
        System.out.println("Vous reculez de " + pRoll + " cases");
        System.out.println("Vous êtes case: " + pPosition);
        return pPosition;
    }


    private void clearScreen(){
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }



    public int getPlayerPosition() {
        return playerPosition;
    }

    public void setPlayerPosition(int playerPosition) {
        this.playerPosition = playerPosition;
    }

    public Personnage getCharacter() {
        return character;
    }

    public void setCharacter(Personnage character) {
        this.character = character;
    }
}
