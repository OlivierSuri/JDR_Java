package equipement_defensif;

public abstract class EquipementDefensif {

    protected int nivDefense;
    protected String name;

    public EquipementDefensif(String name){
        this(name, 1);
    }

    public EquipementDefensif(String name, int nivDefense ) {
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
