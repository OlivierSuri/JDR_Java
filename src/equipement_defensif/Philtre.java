package equipement_defensif;

public class Philtre extends EquipementDefensif {
    public Philtre(String name){
        super(name);
        this.nivDefense = 5;
    }
    public String toString(){
        String message = "Type Philtre \n"+
                super.toString();
        return message;
    }

}
