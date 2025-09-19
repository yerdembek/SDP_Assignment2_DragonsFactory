package models.fire;

import models.Dragon;

public class ClassicDragon extends Dragon {
    private String name = "no name";
    private  float wingspan = 80;
    private  float blowDamage = 250;
    private  float biteDamage = 50;

    public void blowAttack(){
        System.out.println("You take fire damage: " + blowDamage);
    }
    public void biteAttack(){
        System.out.println("You take bite damage: " + biteDamage);
    }
}
