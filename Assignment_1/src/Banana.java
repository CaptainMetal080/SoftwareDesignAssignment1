import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Banana implements Fruit{
    @Override
    public void getPrice() {
        int rows = 2;
        int columns = 3;

        String[][] banana = new String[rows][columns];

        try {
            int i = -1, j = 0;

            File myObj = new File("Fruits.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String fruit = myReader.nextLine();
                String cost = myReader.nextLine();

                if (fruit.contains("Banana")){
                    i++;
                    banana[i][j] = fruit;
                    j++;

                    banana[i][j] = cost;
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        String x = FactoryTest.produce;

        if (x.toLowerCase().equals("medium banana")){
            System.out.println("A " + banana[0][0] + " is $" + banana[0][1]);
        }
        else if (x.toLowerCase().equals("small banana")){
            System.out.println("A " + banana[1][1] + " is $" + banana[1][2]);
        }
        else{
            System.out.println("Seems like you are looking for a kind of banana. \nplease specify the type and make sure it is available!");
        }
    }
}
