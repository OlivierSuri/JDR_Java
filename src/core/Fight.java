package core;

import personnages.Personnage;

public class Fight {

    private final Personnage hero;
    private final Personnage ennemy;

    public Fight(Personnage hero, Personnage ennemy) {
        this.hero = hero;
        this.ennemy = ennemy;
    }

    Menu combatMenu = new Menu();


    public CombatResult start() {

        int damageEnnemy = ennemy.totalAttackPower();
        int damageHero = hero.totalAttackPower();

        displayFightInfo("INIT");
        int combatMenuChoice = combatMenu.combatMenu();
        if (combatMenuChoice == 1) {
            ennemy.setHp( ennemy.recieveAttack(damageHero));
            displayFightInfo("PLAYER_ATTACK");
            if (!ennemy.isAlive()) {
                displayFightInfo("ENNEMY_DEAD");
                return CombatResult.WIN;
            } else{
                hero.setHp(hero.recieveAttack(damageEnnemy));
                displayFightInfo("ENNEMY_COUNTER_ATTACK");
                return CombatResult.RECIEVEDAMAGE;
            }
        }
        else{
            return CombatResult.RETREAT;

        }
    }


    public void displayFightInfo(String status) {
        switch (status) {
            case "INIT":
                System.out.println( "\n\n¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤" );
                System.out.println( "¤  Vous rencontrer un " + ennemy.getType() + " !  ¤" );
                System.out.println( "¤             Hp " + ennemy.getHp() + " !             ¤" );
                System.out.println( "¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤\n\n" );
                break;

            case "PLAYER_ATTACK" :
                int damageRecveivedByEnnemy = hero.totalAttackPower() - ennemy.getDefensif().getNivDefense();
                System.out.println(ennemy.getType() + " perd "+ damageRecveivedByEnnemy + " HP\n");
                break;

            case "ENNEMY_DEAD" :
                System.out.println(ennemy.getName() + " le " + ennemy.getType() +" est mort \uD83D\uDC80");
                break;

            case "ENNEMY_COUNTER_ATTACK" :
                int damageReceivedByHero = ennemy.totalAttackPower() - hero.getDefensif().getNivDefense();
                System.out.println("⚔️ "+ ennemy.getName() + " le " + ennemy.getType() + " attaque !");
                System.out.println(hero.getName()+ " " + "perd " + damageReceivedByHero + " HP\n");
                System.out.println(ennemy.getName() + " le " + ennemy.getType() + " prend la fuite: CIAO !");
                break;
        }
    }





}
