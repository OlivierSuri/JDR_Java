package equipements.Potion;

import board.Case;
import personnages.Personnage;

public abstract class EquipementPotion implements Case {

    protected String name;
    protected int regenPts;

    public EquipementPotion(String name) {
        this(name, 2);
    }
    public EquipementPotion(String name, int regenPts) {
        this.name = name;
        this.regenPts = regenPts;
    }

    @Override
    public void doAction(Personnage personnage) {
        System.out.println("Vous trouver une " + this.name + "!");
        personnage.receiveHealing(regenPts);
        System.out.println("Vous Récupérer " + this.regenPts + " hp !");


    }
}
