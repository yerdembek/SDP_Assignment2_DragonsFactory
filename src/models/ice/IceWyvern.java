package models.ice;

import models.Wyvern;

public class IceWyvern extends Wyvern {
    private String name = "no name";
    private  float wingspan = 15;
    private  float blowDamage = 23;
    private  float biteDamage = 15;

    public void blowAttack(){
        System.out.println("You take ice damage: " + blowDamage);
    }
    public void biteAttack(){
        System.out.println("You take bite damage: " + biteDamage);
    }
}
