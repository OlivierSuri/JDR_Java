package personnages;

import equipements.equipement_defensif.Philtre;
import equipements.equipement_offensif.Sort;

public class Magicien extends Personnage {


    public Magicien(String name){
        super(name, "Wizard");
        this.hp = 6;
        this.attackForce = 15; //15 de base
        this.defensif = new Philtre("Bouclier Magique");
        this.offensif = new Sort("Projectiles Magiques");
    }

}
