package equipement_offensif;

import Board.Case;
import personnages.Personnage;

import java.io.Serializable;

public class Arme extends EquipementOffensif implements Case {

    public Arme(String name) {
        super(name);
        this.nivAttack = 2;
    }

    @Override
    public void doAction(Personnage personnage) {
        personnage.setOffensif(personnage.getOffensif());
    }

    public String toString(){
        String message = "Type Arme \n"+
                super.toString();
        return message;
    }
}
