package personnages;

import equipement_defensif.EquipementDefensif;
import equipement_offensif.EquipementOffensif;

public class Personnage {
    protected String type;
    protected String name;
    protected int hp;
    protected int attackForce;
    protected EquipementDefensif defensif;
    protected EquipementOffensif offensif;

    public Personnage() {
        this("Ragnar");
    }

    public Personnage(String name) {
        this(name, "Warrior");
    }

    public Personnage(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String toString() {
        return
                "Personnage: \n" +
                        "Name: " + this.name + "\n" +
                        "Type: " + this.type + "\n" +
                        "Health: " + this.hp + "\n" +
                        "Attack Force" + this.attackForce + "\n\n"+
                        "Equipement Offensif: " + this.offensif.toString()+"\n"+
                        "Equipement Defensif: " + this.defensif.toString();

    }


    public EquipementDefensif getDefensif() {
        return defensif;
    }
    public void setDefensif(EquipementDefensif defensif) {
        this.defensif = defensif;
    }

    public EquipementOffensif getOffensif() {
        return offensif;
    }
    public void setOffensif(EquipementOffensif offensif) {
        this.offensif = offensif;
    }

    public int getAttackForce() {
        return attackForce;
    }

    public void setAttackForce(int attackForce) {
        this.attackForce = attackForce;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;

    }
}
