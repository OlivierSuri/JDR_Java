package equipements.equipement_offensif;


import board.Case;
import personnages.Guerrier;
import personnages.Personnage;

public class Arme extends EquipementOffensif implements Case {

    public Arme(String name) {
        super(name);
        this.nivAttack = 1;
    }

    @Override
    public void doAction(Personnage personnage) {
        System.out.println("Vous trouver une arme ! \n" + this.name + ": " + " attaque + " + this.nivAttack);
        if (!(personnage instanceof Guerrier)) {
            System.out.println("Vous ne pouvez pas prendre cette arme");
            return;
        }

        if (personnage.getOffensif().getNivAttack() < this.getNivAttack()){
            System.out.println("Vous prenez l'arme.");
            personnage.lootGear(this);
            System.out.println();
        }else{
            System.out.println("Votre arme actuelle est meilleure ou équivalente.");
        }
    }

    public String toString(){
        String message = "Type Arme \n"+
                super.toString();
        return message;
    }
}
