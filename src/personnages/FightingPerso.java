package personnages;

import board.Case;
import core.CombatResult;
import core.Fight;
import core.Game;
import equipements.equipement_defensif.EquipementDefensif;
import equipements.equipement_offensif.EquipementOffensif;

public abstract class FightingPerso extends Personnage implements Case {

    protected FightingPerso(String name, String type, int hp, int attackForce, EquipementDefensif defensif, EquipementOffensif offensif) {
        super(name, type, hp, attackForce, defensif, offensif);
    }

    @Override
    public int doAction(Personnage personnage, int pos) {
        Fight fight = new Fight(personnage, this);
        CombatResult fighting = fight.start();
            switch (fighting) {
                case WIN -> System.out.println("Vous remportez la vivtoire");
                case RECIEVEDAMAGE -> System.out.println("L'ennemi a fui");
                case RETREAT -> {
                    System.out.println("Vous prenez la fuite");

                    int dice  = (int)(Math.random()*6)+1;
                    System.out.println("Vous reculez de " + dice + " cases");
                    pos -= dice;
                    System.out.println("Vous êtes case: " + pos);
//                    Game.playerRetreat(pos, dice);

                }

            }
            return pos;
    }
}
