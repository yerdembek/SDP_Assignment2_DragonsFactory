package factories;

import models.ClassicDragon;
import models.WaterDragon;

public class WaterDragonFactory implements DragonFactory {
    public WaterDragon createDragon(){return new WaterDragon();}
}
