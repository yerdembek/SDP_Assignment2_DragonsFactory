import factories.ClassicDragonFactory;
import factories.DragonFactory;
import models.Dragon;

public class Main {
    public static void main(String[] args) {
        DragonFactory factory = new ClassicDragonFactory();
        Dragon dragon = factory.createDragon();
        dragon.setName("Red Dragon");
        dragon.biteAttack();
        dragon.fireAttack();
        dragon.getSpecialFeatures();
    }
}
