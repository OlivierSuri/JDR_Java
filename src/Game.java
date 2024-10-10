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

        this.character = new Guerrier("Gérard");


        try {
            gameBoard.accept(character, playerPosition);
        } catch (JoueurHorsPlateau e) {
        }
        while (playerPosition <= gameBoard.getBoardSize()) {
            int rollChoice = startMenu.rollChoice();
            if (rollChoice == 1) {
                jouerUnTour();
            }
            else if (rollChoice == 2) {
                startMenu.exit();
            }

        }
    }


    /**
     * lancer le dé
     * @return
     */
    public int diceRoll() {
//        int dice  = (int)(Math.random()*6)+1;
        int dice = 1;
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
            playerMove(playerPosition, diceResult);
        }catch (JoueurHorsPlateau e){
            playerPosition = gameBoard.getBoardSize()-1;
            System.out.println(e.getMessage());
        }
        return playerPosition;
//      gameBoard.get( this.playerPosition).interact( hero );
    }



    public int getPlayerPosition() {
        return playerPosition;
    }

    public void setPlayerPosition(int playerPosition) {
        this.playerPosition = playerPosition;
    }
}
