package equipement_offensif;

public abstract class EquipementOffensif {
    protected String type;
    protected int nivAttack;
    protected String name;

    public EquipementOffensif() {
        this("Arme");
    }
    public EquipementOffensif(String type) {
        this(type, 10);
    }
    public EquipementOffensif(String type, int nivAttack){
        this(type, nivAttack, "Hache");
    }

    public EquipementOffensif(String type, int nivDefense, String name) {
        this.type = type;
        this.nivAttack = nivDefense;
        this.name = name;
    }
    public String toString(){
        return type+"\n"+
                "Niveau d'attaque: " + nivAttack + "\n"+
                "Nom: " + name + "\n";
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
