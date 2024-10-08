package equipement_offensif;

public class Arme extends EquipementOffensif{

    public Arme(String name) {
        super(name);
        this.nivAttack = 5;
    }

    public String toString(){
        String message = "Type Arme \n"+
                super.toString();
        return message;
    }


}
