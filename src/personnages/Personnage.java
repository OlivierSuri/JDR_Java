package personnages;

import equipements.equipement_defensif.EquipementDefensif;
import equipements.equipement_offensif.Arme;
import equipements.equipement_offensif.EquipementOffensif;
import equipements.equipement_offensif.Sort;

import java.util.ArrayList;

public abstract class Personnage {
    protected String type;
    protected String name;
    protected int hp;
    protected int attackForce;
    protected EquipementDefensif defensif;
    protected EquipementOffensif offensif;

    public Personnage() {
        this("Ragnar");
    }

    protected Personnage(String name, String type, int hp, int attackForce, EquipementDefensif defensif, EquipementOffensif offensif) {

        this.name = name;
        this.type = type;
        this.hp = hp;
        this.attackForce = attackForce;
        this.defensif = defensif;
        this.offensif = offensif;
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
                        "Attack Force: " + this.attackForce + "\n\n"+
                        "Equipement Offensif: " + this.offensif.toString()+"\n"+
                        "Equipement Defensif: " + this.defensif.toString();
    }

    public int totalAttackPower(){
        return this.attackForce+this.offensif.getNivAttack();
    }


    public void doAttack(Personnage opponent) {
        int damage = totalAttackPower();
        opponent.receiveAttack(damage);
        System.out.println("La vie de votre ennemi est: " + opponent.getHp());
        if (!opponent.isAlive()) {
            System.out.println("Votre ennemi meurt");
        } else {
            System.out.println("L'ennemi vous attaque");
            opponent.doAttack(this);
        }

    }
    public void receiveAttack(int attack){
        this.hp-=attack;
    }

    public boolean isAlive(){
        return this.hp>0;
    }
    public void receiveHealing(int healing){
        this.hp+=healing;
    }
    public void lootGear(Arme gear) {
        setOffensif(gear);
    }
    public void lootSpell (Sort spell){
        setOffensif(spell);
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

    public void setAttackForce(int attackForce) {this.attackForce = attackForce;}

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
