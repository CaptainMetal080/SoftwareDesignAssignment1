import java.util.Scanner;

public class FactoryTest {
    public static String produce;

    public static void main(String[] args) {
        BananaFactory banana=new BananaFactory();
        AppleFactory apple=new AppleFactory();

        Scanner sc = new Scanner(System.in);

        System.out.println("What product are you looking for?");
        produce = sc.nextLine();

        if (produce.toLowerCase().contains("banana")){
            banana.getFruit().getPrice();
        }
        else if (produce.toLowerCase().contains("apple")){
            apple.getFruit().getPrice();
        }
        else{
            System.out.println("No Product found by the name: "+produce);
        }
    }
}