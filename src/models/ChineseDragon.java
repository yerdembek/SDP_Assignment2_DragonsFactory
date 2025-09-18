package models;

public class ChineseDragon implements Dragon {
    private String name; //name of dragon should be changeable
    private float wingspan = 10;
    private float biteDamage = 50;
    private float fireDamage = 1500;
    private String specialFeatures =  "has long body and magic";

    public void setName(String name) {this.name = name;}
    public String getName() {return name;}

    public void setWingspan(float wingspan) {this.wingspan = wingspan;}
    public float getWingspan() {return wingspan;}

    public void biteAttack() {System.out.println("You take " + biteDamage + " damage from Dragon");}
    public void fireAttack() {System.out.println("You take " + fireDamage + " damage from Dragon");}

    public void getSpecialFeatures() {System.out.println("Your dragon " + specialFeatures);}
}
