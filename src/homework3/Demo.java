package homework3;

import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        Random random = new Random();
        int countOfShip = 5;
        String[] namesList = {"Titanic","Aurora","Lisa","Tina","Elisabet"};
        String[] typeList = {"military","cargo","civil"};

        Ship[] ships = new Ship[countOfShip];
        for (int i = 0; i < countOfShip; i++) {
            ships[i] = new Ship(random.nextInt(5),namesList[i],random.nextInt(9000),getRandom(typeList),random.nextInt(100000));
        }

        for (Ship ship : ships) {
            System.out.println(ship.toString());
        }

    }

    private static String  getRandom(String[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }
}
