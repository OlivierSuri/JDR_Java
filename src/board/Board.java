package board;


import java.util.ArrayList;
import java.util.Collections;
import equipements.Potion.GrandePotion;
import equipements.Potion.PotionStandard;
import equipements.equipement_offensif.BouleDeFeu;
import equipements.equipement_offensif.Eclair;
import equipements.equipement_offensif.Epee;
import equipements.equipement_offensif.Massue;
import personnages.Dragon;
import personnages.Gobelin;
import personnages.Personnage;
import personnages.Sorcier;

public class Board {

   private ArrayList<Case> board;
   private int boardSize = 64;

   public Board() {
//       new BoardCaseImpl<CaseVide>(new CaseVide());

    board = new ArrayList<Case>();

            //Ajout des case elements du jeu
           addMultipleCase(new Dragon("Smaug"), 4);
           addMultipleCase(new Gobelin("Gobos"), 10);
           addMultipleCase(new Sorcier("Vol de morte"), 10);
           addMultipleCase(new Massue(), 5);
           addMultipleCase(new Epee(), 4);
           addMultipleCase(new Eclair(), 5);
           addMultipleCase(new BouleDeFeu(), 2);
           addMultipleCase(new PotionStandard(), 6);
           addMultipleCase(new GrandePotion(), 2);

           // Remplir les cases vide
           int remainingCases = boardSize - board.size();
           addMultipleCase(new CaseVide(), remainingCases);

           //Mélanger les cases
           Collections.shuffle(board);
   }


   public void addMultipleCase (Case c, int count) {
       for (int i = 0; i < count; i++) {
           board.add(c);
       }
   }

    public void accept(Personnage p, int pos) throws JoueurHorsPlateau {
        if (pos > boardSize) {
            throw new JoueurHorsPlateau();
        }
        Case c = board.get(pos);
        c.doAction(p);
    }
    public boolean hasWin (int pos) {
        return pos == (boardSize - 1);
    }

    public int getBoardSize() {
        return boardSize;
    }

    public void setBoardSize(int boardSize) {
        this.boardSize = boardSize;
    }
}
