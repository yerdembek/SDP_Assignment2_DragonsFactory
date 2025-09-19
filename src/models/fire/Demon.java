package models.fire;

import models.Knight;

public class Demon extends Knight {
    private  String name = "no name";
    private float swordDamage = 18;
    private  float punchDamage = 7;

    public void swordAttack(){
        System.out.println("You take fire damage: " + swordDamage);
    }
    public void biteAttack(){
        System.out.println("You take punch damage: " + punchDamage);
    }
}
