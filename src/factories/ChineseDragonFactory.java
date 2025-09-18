package factories;

import models.ChineseDragon;

public class ChineseDragonFactory implements DragonFactory {
    public ChineseDragon  createDragon(){return new ChineseDragon();}
}
