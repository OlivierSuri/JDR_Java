package equipement_offensif;

public class Sort extends EquipementOffensif {

    public Sort(String type) {
        super(type);
        this.nivAttack = 10;
        this.name = "Projectiles Magiques";
    }

    public String toString(){
        String message = "Type Sort \n"+
                super.toString();
        return message;
    }


}
