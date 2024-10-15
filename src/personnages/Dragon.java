package personnages;

import equipements.equipement_defensif.Bouclier;
import equipements.equipement_offensif.Sort;

public class Dragon extends FightingPerso {
    public Dragon(String name) {
        super(name,"Dragon", 15, 4, new Bouclier("Eclaille de dragon"), new Sort("Souffle du dragon"));
    }
}
