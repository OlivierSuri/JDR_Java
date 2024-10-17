package board;


import java.util.ArrayList;
import java.util.Collections;

import core.Game;
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

       for (int i = 0; i < 4; i++) {
           board.add(new Dragon("Smaug"));
       }
       for (int i = 0; i < 10; i++) {
           board.add(new Gobelin("Gobos"));
       }
       for (int i = 0; i < 10; i++) {
           board.add(new Sorcier("Vol de morte"));
       }
       for (int i = 0; i < 5; i++) {
           board.add(new Massue());
       }
       for (int i = 0; i < 4; i++) {
           board.add(new Epee());
       }
       for (int i = 0; i < 5; i++) {
           board.add(new Eclair());
       }
       for (int i = 0; i < 2; i++) {
           board.add(new BouleDeFeu());
       }
       for (int i = 0; i < 6; i++) {
           board.add(new PotionStandard());
       }
       for (int i = 0; i < 2; i++) {
           board.add(new GrandePotion());
       }
       for (int i = 0; i < 15; i++) {
           board.add(new CaseVide());
       }

           //Mélanger les cases
           Collections.shuffle(board);
   }


   public void addMultipleCase (Case c, int count) {
       for (int i = 0; i < count; i++) {
           board.add(c);
       }
   }

    public int accept(Personnage p, int pos) throws JoueurHorsPlateau {
        if (pos > boardSize) {
            throw new JoueurHorsPlateau();
        }
        Case c = board.get(pos);
        pos = c.doAction(p, pos);
        return pos;
    }
    public boolean hasWin (int pos) {
        if (pos == (boardSize - 1)){;
        System.out.println("Vous avez Gagné");
        return true;
    }else{
            return false;
        }
   }




    public int getBoardSize() {
        return boardSize;
    }

    public void setBoardSize(int boardSize) {
        this.boardSize = boardSize;
    }
}
