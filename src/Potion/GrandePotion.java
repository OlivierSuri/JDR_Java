package Potion;

import board.Case;
import personnages.Personnage;

public class GrandePotion extends EquipementPotion implements Case {
    public GrandePotion() {
        super("Grande Potion");
        this.regenPts = 5;
    }

    @Override
    public void doAction(Personnage personnage) {
        personnage.setHp(personnage.getHp() + 5);
    }
}
