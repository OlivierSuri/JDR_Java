package board;

import personnages.Personnage;

public interface BoardCase<T extends Case> {

    void makeAction(Personnage personnage);
    String getContentRep();

}
