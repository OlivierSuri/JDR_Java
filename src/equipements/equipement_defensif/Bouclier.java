package equipements.equipement_defensif;

public class Bouclier extends EquipementDefensif {


    public Bouclier(String name) {
        super(name);
        this.nivDefense = 2;
    }
    public String toString(){
        String message = "Type Bouclier \n"+
                super.toString();
        return message;
    }

}
