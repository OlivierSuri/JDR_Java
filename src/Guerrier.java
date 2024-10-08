public class Guerrier extends Personnage{


    public Guerrier(String name){
        super(name, "Warrior");
        this.hp = 10;
        this.attackForce = 10;
        this.defensif = new Bouclier("Bouclier");
        this.offensif = new Arme("Arme");
    }

}
