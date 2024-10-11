package equipements.equipement_offensif;
import equipements.Equipements;

public abstract class EquipementOffensif extends Equipements{
    protected int nivAttack;


    public EquipementOffensif(String name) {
        super(name, "EquipementOffensif");
        this.nivAttack = 1;
    }

    public EquipementOffensif(String name, int nivAttack) {
        super(name, "EquipementOffensif");
        this.nivAttack = nivAttack;
    }

    public String toString(){
        return  "Nom: " + name + "\n"+
                "Niveau d'attaque: " + nivAttack + "\n";
    }



    public int getNivAttack() {
        return nivAttack;
    }

    public void setNivAttack(int nivAttack) {
        this.nivAttack = nivAttack;
    }

}
