import board.Board;
import board.JoueurHorsPlateau;
import personnages.Guerrier;
import personnages.Magicien;
import personnages.Personnage;

public class Game {


    private int playerPosition;
    private Personnage character;
    private Board gameBoard;

    public Game (){
        this.playerPosition = 0;
        this.character = null;
        //init board
        this.gameBoard = new Board();
    }



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
                    System.out.println(character);
                }
                else if (modifyChoice == 2) {
                    String newType = startMenu.askCharacType();
                    this.character.setType(newType);
                    Personnage newCharacter;
                    if (newType.equals("Warrior")) {
                        newCharacter = new Guerrier(character.getName());
                    }
                    else {
                        newCharacter = new Magicien(character.getName());
                    }
                    System.out.println(newCharacter);
                }
                break;

            default: break;
        }

//        this.character = new Magicien("Gérard");


        try {
            gameBoard.accept(character, playerPosition);
        } catch (JoueurHorsPlateau _) {
        }

        while (playerPosition < gameBoard.getBoardSize()) {
            if (playerPosition == gameBoard.getBoardSize()-1) {
                System.out.println("Vous avez Gagné");
            }
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


    /**
     * lancer le dé
     * @return
     */
    public int diceRoll() {
        int dice  = (int)(Math.random()*6)+1;
//        int dice = 1;
        System.out.println("dé: " + dice);
        return dice;
    }

    public int playerMove(int pPosition, int pRoll) throws JoueurHorsPlateau {
        int newPosition = pPosition + pRoll;
        gameBoard.accept(this.character, newPosition);
        pPosition = newPosition;
            System.out.println("Vous êtes case: " + pPosition);

        return pPosition;
    }


    public int jouerUnTour (){
        int diceResult = diceRoll();
        try {
            playerPosition = playerMove(playerPosition, diceResult);
        }catch (JoueurHorsPlateau e){
            playerPosition = gameBoard.getBoardSize()-1;
        }
        return playerPosition;
    }


    public void clearScreen(){
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
}
