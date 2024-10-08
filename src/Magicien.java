import javax.swing.*;

public class Magicien extends Personnage {


    public Magicien(String name){
        super(name, "Wizard");
        this.hp = 6;
        this.attackForce = 15;
        this.defensif = new Philtre("Philtre");
        this.offensif = new Sort("Sort");
    }

}
