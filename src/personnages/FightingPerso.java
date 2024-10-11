package personnages;

import board.Case;
import equipements.equipement_defensif.EquipementDefensif;
import equipements.equipement_offensif.EquipementOffensif;

public abstract class FightingPerso extends Personnage implements Case {

    protected FightingPerso(String name, String type, int hp, int attackForce, EquipementDefensif defensif, EquipementOffensif offensif) {
        super(name, type, hp, attackForce, defensif, offensif);
    }

    @Override
    public void doAction(Personnage personnage) {
        System.out.println( "\n\n¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤" );
        System.out.println( "¤ Vous rencontrer un " + getType() + " ! ¤" );
        System.out.println( "¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤\n\n" );
        personnage.doAttack(this);
    }
}
