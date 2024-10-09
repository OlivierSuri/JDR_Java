package personnages;


import Board.Case;

public class Gobelin extends Personnage implements Case {

    public Gobelin(String name){
        super(name, "Gobelin");
        this.hp = 6;
        this.attackForce = 1;
        this.defensif = null;
        this.offensif = null;
    }
    @Override
    public void doAction(Personnage personnage) {
        personnage.setHp(personnage.getHp() - this.attackForce);
    }

}
