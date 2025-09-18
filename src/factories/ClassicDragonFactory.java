package factories;

import models.ClassicDragon;

public class ClassicDragonFactory implements DragonFactory {
    public ClassicDragon createDragon(){return new ClassicDragon();}
}
