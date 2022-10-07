public class BananaFactory implements GroceryProductFactory{
    @Override
    public Fruit getFruit() {
        return new Banana();
    }
}
