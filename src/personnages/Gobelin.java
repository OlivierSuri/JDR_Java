package personnages;


import board.Case;
import equipements.equipement_defensif.Bouclier;
import equipements.equipement_offensif.Arme;

public class Gobelin extends FightingPerso {

    public Gobelin(String name){
        super(name, "Gobelin", 6, 1, new Bouclier("Planche en bois"), new Arme("Pique en bois", 1));
    }

}
