package models;

public abstract interface Dragon {
//    private String name; //name of dragon should be changeable
//    private float wingspan;
//    private float biteDamage;
//    private float fireDamage;
//    private boolean specialFeatures = false;


    public  void setName(String name);
    public  String getName();

    public  void setWingspan(float wingspan);
    public float getWingspan();

    public void biteAttack(); //{System.out.println("You take " + biteDamage + " damage from Dragon");}
    public void fireAttack(); //{System.out.println("You take " + fireDamage + " damage from Dragon");}

    public void getSpecialFeatures();
}
