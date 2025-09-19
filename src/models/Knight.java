package models;

public abstract class Knight {
    private  String name = "no name";
    private float swordDamage = 18;
    private  float punchDamage = 10;

    public void swordAttack(){
        System.out.println("You take damage: " + swordDamage);
    }
    public void biteAttack(){
        System.out.println("You take punch damage: " + punchDamage);
    }
}
