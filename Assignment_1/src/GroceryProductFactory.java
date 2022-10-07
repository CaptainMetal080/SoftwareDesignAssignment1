public interface GroceryProductFactory {
    default Fruit getFruit() {
        return null;
    }
}
