public class Guerrier extends Personnage{


    public Guerrier(String name){
        super(name, "Warrior");
        this.hp = 10;
        this.attackForce = 10;
        this.defensif = new EquipementDefensif(new Bouclier());
        this.offensif = new EquipementOffensif(new Arme());
    }
}
