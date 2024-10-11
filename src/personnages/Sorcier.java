package personnages;

import board.Case;
import equipements.equipement_defensif.Bouclier;
import equipements.equipement_defensif.Philtre;
import equipements.equipement_offensif.Arme;
import equipements.equipement_offensif.Sort;

public class Sorcier extends FightingPerso {
    public Sorcier(String name) {
        super(name, "Sorcier", 9, 2, new Philtre("Voile noire"), new Sort("VoidBolt"));
    }
}
