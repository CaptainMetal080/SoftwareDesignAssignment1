import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Apple implements Fruit {
    @Override
    public void getPrice() {
        int rows = 2;
        int columns = 3;

        String[][] apple = new String[rows][columns];

        try {
            int i = -1, j = 0;

            File myObj = new File("Fruits.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String fruit = myReader.nextLine();
                String cost = myReader.nextLine();

                if (fruit.contains("Apple")){
                    i++;
                    apple[i][j] = fruit;
                    j++;

                    apple[i][j] = cost;
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        String x = FactoryTest.produce;

        if (x.toLowerCase().equals("green apple")){
            System.out.println("A " + apple[0][0] + " is $" + apple[0][1]);
        }
        else if (x.toLowerCase().equals("red apple")){
            System.out.println("A " + apple[1][1] + " is $" + apple[1][2]);
        }
        else{
            System.out.println("Seems like you are looking for a kind of apple. \nplease specify the type and make sure it is available!");
        }

    }
}
