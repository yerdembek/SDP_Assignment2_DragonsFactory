package factories;

import models.Dragon;
import models.Knight;
import models.Wyvern;
import models.fire.ClassicDragon;
import models.fire.Demon;
import models.fire.FireWyvern;

public class FireUnitFactory implements UnitFactory {
    public Knight createKnight(){
        return new Demon();
    }
    public Dragon createDragon(){
        return new ClassicDragon();
    }
    public Wyvern createWyvern(){
        return new FireWyvern();
    }
}
