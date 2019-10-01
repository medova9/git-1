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

        System.out.println("Массив кораблей");
        for (Ship ship : ships) {
            System.out.println(ship.toString());
        }
        System.out.println("Массив кораблей отсортированный по имени");
        for (Ship ship : sortShipByName(ships)) {
            System.out.println(ship.toString());
        }
        System.out.println("Только военные корабли");
        for (Ship ship : getShipsByType(ships,"military")) {
            System.out.println(ship.toString());
        }

    }

    private static String  getRandom(String[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }

    private static Ship[] sortShipByName(Ship[] ships){

        new Ship();
        Ship tmpShip;
        for (int i = 0; i < ships.length; i++) {
            for (int j = (ships.length - 1); j >= (i + 1); j--) {
                if (ships[j].getName().compareTo(ships[j - 1].getName()) < 0) {
                    tmpShip = ships[j];
                    ships[j] = ships[j - 1];
                    ships[j - 1] = tmpShip;
                }
            }
        }

        return ships;
    }

    private static Ship[] getShipsByType(Ship[] ships, String type){
        int j = 0;
        for (Ship ship : ships) {
            if (ship.getType().equals(type)) {
                j++;
            }
        }
        Ship[] shipsRes = new Ship[j];
        for (Ship ship : ships) {
            if (ship.getType().equals(type)) {
                j--;
                shipsRes[j] = ship;
            }
        }
        return shipsRes;
    }
}
