import Board.Board;
import equipement_defensif.Bouclier;
import equipement_defensif.Philtre;
import equipement_offensif.Arme;
import equipement_offensif.EquipementOffensif;
import equipement_offensif.Sort;
import personnages.Guerrier;
import personnages.Magicien;
import personnages.Personnage;

public class Game {


    private int playerPosition;
    Personnage character;
    private Board gameBoard;

    public Game (){
        this.playerPosition = 0;
        this.character = null;
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
//                      newCharacter.setOffensif(new Arme("Hache"));
                    }
                    System.out.println(newCharacter);
                }
                break;

            default: break;

        }
        initBoard();

        while (playerPosition <= 63) {
            int rollChoice = startMenu.rollChoice();
            if (rollChoice == 1) {
                jouerUnTour();
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

    int playerMove(int pPosition, int pRoll){
        pPosition = pPosition + pRoll;
        System.out.println("Vous êtes case: " + pPosition);
        return pPosition;
    }

    void jouerUnTour (){
        diceRoll();
        int diceResult = diceRoll();
        playerMove(playerPosition, diceResult);
        gameBoard.get( this.playerPosition ).interact( hero );
    }

}
