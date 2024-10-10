package equipements.equipement_offensif;
import board.Case;
import personnages.Personnage;

import java.util.Comparator;

public class Sort extends EquipementOffensif implements Case {

    public Sort(String name) {
        super(name);
        this.nivAttack = 1;
    }

    @Override
    public void doAction(Personnage personnage) {
        personnage.setOffensif(personnage.getOffensif());
    }

    public String toString(){
        String message = "Type Sort \n"+
                super.toString();
        return message;
    }


}
