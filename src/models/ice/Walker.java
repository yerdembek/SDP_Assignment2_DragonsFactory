package models.ice;

import models.Knight;

public class Walker extends Knight {
    private  String name = "no name";
    private float swordDamage = 10;
    private  float punchDamage = 15;

    public void swordAttack(){
        System.out.println("You take ice damage: " + swordDamage);
    }
    public void biteAttack(){
        System.out.println("You take punch damage: " + punchDamage);
    }
}
