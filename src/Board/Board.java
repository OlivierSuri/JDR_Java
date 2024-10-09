package Board;



import Potion.PotionStandard;
import equipement_offensif.Massue;
import personnages.Gobelin;

import java.util.ArrayList;

public class Board {

   ArrayList<Case> board;
   int boardSize = 4;

   public Board() {
    board = new ArrayList<Case>();
//       for (int i = 0; i < boardSize; i++) {
           board.add(new CaseVide());
           board.add(new Gobelin("Gobos"));
           board.add(new Massue());
           board.add(new PotionStandard());
//       }

   }
}
