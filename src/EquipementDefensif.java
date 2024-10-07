import javax.print.DocFlavor;

public class EquipementDefensif {

    private String type;
    private int nivDefense;
    private String name;

    public EquipementDefensif() {
        this("Bouclier");
    }

    public EquipementDefensif(String type){
        this(type, 10);
    }
     public EquipementDefensif(String type, int nivDefense){
        this(type, nivDefense, "Bouclier Rond");
     }

    public EquipementDefensif(String type, int nivDefense, String name) {
       this.type = type;
       this.nivDefense = nivDefense;
       this.name = name;
    }

    public String toString(){
        return type +"\n"+
                "Niveau de défense: " + nivDefense +"\n"+
                "Name: " + name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
