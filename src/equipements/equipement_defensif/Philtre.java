package equipements.equipement_defensif;

import personnages.Guerrier;
import personnages.Magicien;
import personnages.Personnage;

public class Philtre extends EquipementDefensif {
    public Philtre(String name){
        super(name, 1);
    }
    public String toString(){
        String message = "Type Philtre \n"+
                super.toString();
        return message;
    }

    @Override
    public int doAction(Personnage personnage, int pos) {
        System.out.println("Vous trouver un philtre ! \n" + this.name + ": " + " défense + " + this.nivDefense);
        if (!(personnage instanceof Magicien)) {
            System.out.println("Vous ne pouvez pas prendre ce philtre");
            return 0;
        }

        if (personnage.getDefensif().getNivDefense() < this.getNivDefense()){
            System.out.println("Vous prenez le bouclier.");
            personnage.lootPhiltre(this);
            System.out.println("Votre défense bonus est désormais de: " + personnage.getDefensif());
        }else{
            System.out.println("Votre bouclier actuel est meilleure ou équivalente.");
        }
        return 0;
    }
}
