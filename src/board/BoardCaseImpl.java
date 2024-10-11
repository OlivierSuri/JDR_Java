package board;

import personnages.Personnage;

public class BoardCaseImpl<T extends Case> implements BoardCase {

    private T content;

    public BoardCaseImpl(T content) {
        this.content = content;
    }

    @Override
    public void makeAction(Personnage personnage) {
        content.doAction(personnage);
    }

    @Override
    public String getContentRep() {
        return content.toString();
    }

}
