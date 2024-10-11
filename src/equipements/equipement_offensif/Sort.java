package equipements.equipement_offensif;
import board.Case;
import personnages.Guerrier;
import personnages.Magicien;
import personnages.Personnage;

import java.util.Comparator;

public class Sort extends EquipementOffensif implements Case {

    public Sort(String name) {
        super(name);
        this.nivAttack = 1;
    }

    @Override
    public void doAction(Personnage personnage) {
        System.out.println("Vous trouver un sort ! C'est: " + this.name + ": " + " attaque + " + this.nivAttack);
        if (!(personnage instanceof Magicien)) {
            System.out.println("Vous ne pouvez pas prendre ce sort");
            return;
        }

        if (personnage.getOffensif().getNivAttack() < this.getNivAttack()){
            System.out.println("Vous prenez le sort.");
            personnage.lootSpell(this);
            System.out.println();
        }else{
            System.out.println("Votre sort actuel est meilleure ou équivalente.");
        }
    }

    public String toString(){
        String message = "Type Sort \n"+
                super.toString();
        return message;
    }
}
