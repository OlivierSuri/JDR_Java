package Potion;

import board.Case;
import personnages.Personnage;

public class PotionStandard extends EquipementPotion implements Case {
    public PotionStandard() {
        super("Potion Standard");
        this.regenPts = 2;
    }


}
