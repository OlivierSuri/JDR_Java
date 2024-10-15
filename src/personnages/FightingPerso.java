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
        int damage = totalAttackPower();
        int damagePerso = personnage.totalAttackPower();
        System.out.println( "\n\n¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤" );
        System.out.println( "¤ Vous rencontrer un " + getType() + " ! ¤" );
        System.out.println( "¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤\n\n" );
        System.out.println("Vous attaquez "+ type);
        this.hp = this.recieveAttack(damagePerso);
        System.out.println(type + " perd "+ damagePerso + " HP\n");
        if (!this.isAlive()) {
            System.out.println(name + " le " +type +" est mort \uD83D\uDC80");
        }else{
            System.out.println(name + " le " +type + " attaque !");
            personnage.recieveAttack(damage);
            System.out.println(personnage.getName()+ " " + "perd " + damage + " HP\n");
            System.out.println(name + " le " +type + " prend la fuit: CIAO !");
        }
    }
}
