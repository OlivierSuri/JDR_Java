package equipements.Potion;

import board.Case;
import equipements.Equipements;
import personnages.Personnage;

public abstract class EquipementPotion extends Equipements implements Case{

    protected int regenPts;

    public EquipementPotion(String name) {
        super(name, "Potion");
        this.regenPts = 1;
    }

    @Override
    public int doAction(Personnage personnage, int pos) {
        System.out.println("Vous trouver une " + this.name + "!");
        personnage.receiveHealing(regenPts);
        System.out.println("Vous Récupérer " + this.regenPts + " hp !");
        return 0;
    }
}
