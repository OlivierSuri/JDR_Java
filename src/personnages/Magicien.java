package personnages;

import equipement_defensif.Philtre;
import equipement_offensif.Sort;

public class Magicien extends Personnage {


    public Magicien(String name){
        super(name, "Wizard");
        this.hp = 6;
        this.attackForce = 15;
        this.defensif = new Philtre("Bouclier Magique");
        this.offensif = new Sort("Projectiles Magiques");
    }

}
