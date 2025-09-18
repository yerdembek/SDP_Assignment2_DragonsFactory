package models;

//Wyvern - is just small dragon with 4 limbs 2 of which are wings

public class Wyvern implements Dragon {
    private String name; //name of dragon should be changeable
    private float wingspan = 15;
    private float biteDamage = 15;
    private float fireDamage = 200;
    private String specialFeatures =  "don't has special features!";

    public void setName(String name) {this.name = name;}
    public String getName() {return name;}

    public void setWingspan(float wingspan) {this.wingspan = wingspan;}
    public float getWingspan() {return wingspan;}


    public void biteAttack() {System.out.println("You take " + biteDamage + " damage from Wyvern");}
    public void fireAttack() {System.out.println("You take " + fireDamage + " damage from Wyvern");}

    public void getSpecialFeatures() {System.out.println("Your dragon " + specialFeatures);}
}
