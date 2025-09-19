package models.ice;

import models.Dragon;

public class IceDragon extends Dragon {
    private String name = "no name";
    private  float wingspan = 65;
    private  float blowDamage = 175;
    private  float biteDamage = 150;

    public void blowAttack(){
        System.out.println("You take ice damage: " + blowDamage);
    }
    public void biteAttack(){
        System.out.println("You take bite damage: " + biteDamage);
    }
}
