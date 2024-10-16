package equipements.equipement_defensif;

import personnages.Guerrier;
import personnages.Personnage;

public class Bouclier extends EquipementDefensif {


    public Bouclier(String name) {
        super(name, 1);
    }
    public String toString(){
        String message = "Type Bouclier \n"+
                super.toString();
        return message;
    }


    @Override
    public int doAction(Personnage personnage, int pos) {
        System.out.println("Vous trouver un bouclier ! \n" + this.name + ": " + " défense + " + this.nivDefense);
        if (!(personnage instanceof Guerrier)) {
            System.out.println("Vous ne pouvez pas prendre ce bouclier");
            return 0;
        }

        if (personnage.getDefensif().getNivDefense() < this.getNivDefense()){
            System.out.println("Vous prenez le philtre.");
            personnage.lootGear(this);
            System.out.println("Votre défense bonus est désormais de: " + personnage.getDefensif());
        }else{
            System.out.println("Votre bouclier actuel est meilleure ou équivalente.");
        }
      return 0;
    }
}
