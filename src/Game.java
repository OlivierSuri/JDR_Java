import javax.swing.*;

public class Game {

    private int[] gameBoard = initBoard();
    private int playerPosition = 0;
    Personnage character;

    Menu startMenu = new Menu();

    public void startMenu() {
        int firstChoice = startMenu.firstMenuChoice();
            if (firstChoice == 1) {
                this.character = startMenu.createCharac();
            } else {
                startMenu.exit();
            }

        int secondChoice = startMenu.secondChoiceMenu();
        switch (secondChoice) {

            case 2: int modifyChoice = startMenu.modifyChoice();
                if (modifyChoice == 1) {
                    String newName = startMenu.askCharacName();
                    this.character.setName(newName);
                }
                else if (modifyChoice == 2) {
                    String newType = startMenu.askCharacType();
                    this.character.setType(newType);
                }
                break;

            default: break;

        }
        initBoard();

        while (playerPosition <= 63) {
            int rollChoice = startMenu.rollChoice();
            if (rollChoice == 1) {
                int diceResult = diceRoll();
                playerPosition = playerMove(playerPosition, diceResult);
            }
            else if (rollChoice == 2) {
                startMenu.exit();
            }

        }
    }

    //initialisation du board
    public int[] initBoard(){
        int[] board = new int[63];
        return board;
    }



    //Lancer un dé
    public int diceRoll() {
        int dice  = (int)(Math.random()*6)+1;
        System.out.println("dé: " + dice);
        return dice;
    }
    int playerMove(int pPosition, int pRoll){
        pPosition = pPosition + pRoll;
        System.out.println("Vous êtes case: " + pPosition);
        return pPosition;
    }

}
