package personnages;

import equipements.equipement_defensif.Bouclier;
import equipements.equipement_offensif.Arme;

public class Guerrier extends Personnage{


    public Guerrier(String name){
        super(name, "Warrior");
        this.hp = 10;
        this.attackForce = 10;
        this.defensif = new Bouclier("Bouclier rond");
        this.offensif = new Arme("Hache", 1);
    }

}
