package equipement_offensif;

public abstract class EquipementOffensif {
    protected int nivAttack;
    protected String name;


    public EquipementOffensif(String name) {
        this.name = name;
    }

    public EquipementOffensif(String name, int nivAttack) {
        this.name = name;
        this.nivAttack = nivAttack;
    }

    public String toString(){
        return  "Nom: " + name + "\n"+
                "Niveau d'attaque: " + nivAttack + "\n";
    }



    public int getNivAttack() {
        return nivAttack;
    }

    public void setNivAttack(int nivDefense) {
        this.nivAttack = nivDefense;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
