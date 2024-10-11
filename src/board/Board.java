package board;



import Potion.PotionStandard;
import equipements.equipement_offensif.Massue;
import personnages.Gobelin;
import personnages.Personnage;
import personnages.Sorcier;

import java.util.ArrayList;

public class Board {

   private ArrayList<Case> board;
   private int boardSize = 5;

   public Board() {
//       new BoardCaseImpl<CaseVide>(new CaseVide());

    board = new ArrayList<Case>();
//       for (int i = 0; i < boardSize; i++) {
           board.add(new CaseVide());
           board.add(new Gobelin("Gobos"));
           board.add(new Sorcier("Vol de morte"));
           board.add(new Massue());
           board.add(new PotionStandard());
//       }

   }
    public void accept(Personnage p, int pos) throws JoueurHorsPlateau {
        if (pos >= boardSize) {
            throw new JoueurHorsPlateau();
        }
        Case c = board.get(pos);
        c.doAction(p);
    }

    public int getBoardSize() {
        return boardSize;
    }

    public void setBoardSize(int boardSize) {
        this.boardSize = boardSize;
    }
}
