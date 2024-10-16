package board;

import personnages.Personnage;

public interface Case {
    int doAction(Personnage personnage, int pos);
}
