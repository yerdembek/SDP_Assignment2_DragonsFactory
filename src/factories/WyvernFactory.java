package factories;

import models.Wyvern;

public class WyvernFactory implements DragonFactory {
    public Wyvern createDragon(){return new Wyvern();}
}
