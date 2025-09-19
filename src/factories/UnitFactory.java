package factories;

import models.Dragon;
import models.Knight;
import models.Wyvern;

public interface UnitFactory {
    public Knight createKnight();
    public Dragon createDragon();
    public Wyvern createWyvern();
}
