package factories;

import models.Dragon;
import models.Knight;
import models.Wyvern;
import models.ice.IceDragon;
import models.ice.IceWyvern;
import models.ice.Walker;

public class IceUnitFactory implements UnitFactory{
    public Knight createKnight(){
        return new Walker();
    }
    public Dragon createDragon(){
        return new IceDragon();
    }
    public Wyvern createWyvern(){
        return new IceWyvern();
    }
}
