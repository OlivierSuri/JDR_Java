package personnages;


import board.Case;
import equipements.equipement_defensif.Bouclier;
import equipements.equipement_offensif.Arme;

public class Gobelin extends Personnage implements Case {

    public Gobelin(String name){
        super(name, "Gobelin");
        this.hp = 6;
        this.attackForce = 1;
        this.defensif = new Bouclier("Planche en bois");
        this.offensif = new Arme("Pique en bois");
    }

    @Override
    public void doAction(Personnage personnage) {
        doAttack(personnage);
    }
}
