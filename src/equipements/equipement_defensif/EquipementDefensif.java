package equipements.equipement_defensif;
import equipements.Equipements;


public abstract class EquipementDefensif extends Equipements {

    protected int nivDefense;

    public EquipementDefensif(String name) {
        super(name, "EquipementDefensif");
        this.nivDefense = 1;
    }

    public EquipementDefensif(String name, int nivDefense ) {
        super(name, "EquipementDefensif");
        this.nivDefense = nivDefense;
    }
    public String toString(){
            String message =
                "Name: " + name + "\n"+
                "Niveau de défense: " + nivDefense +"\n";
            return message;
    }

    public int getNivDefense() {
        return nivDefense;
    }

    public void setNivDefense(int nivDefense) {
        this.nivDefense = nivDefense;
    }

}
