package models.fire;

import models.Wyvern;

public class FireWyvern extends Wyvern {
    private String name = "no name";
    private  float wingspan = 15;
    private  float fireDamage = 25;
    private  float biteDamage = 10;

    public void blowAttack(){
        System.out.println("You take fire damage: " + fireDamage);
    }
    public void biteAttack(){
        System.out.println("You take bite damage: " + biteDamage);
    }
}
