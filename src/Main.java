import factories.FireUnitFactory;
import factories.UnitFactory;
import models.Wyvern;

public class Main {

    public static void mainRun(){
        UnitFactory fire = new FireUnitFactory();
        UnitFactory ice = new FireUnitFactory();

        fire.createDragon();
        fire.createKnight();
        fire.createWyvern();

        Wyvern w2 = ice.createWyvern();
        ice.createDragon();
        ice.createKnight();

        w2.biteAttack();


    }

    public static void main(String[] args) {
        mainRun();
    }
}
