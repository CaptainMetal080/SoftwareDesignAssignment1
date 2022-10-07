public class AppleFactory implements GroceryProductFactory{
    @Override
    public Fruit getFruit() {
        return new Apple();

    }
}
