import java.util.ArrayList;
import java.util.List;

/**
 * Главный класс для демонстрации работы с классом House.
 */
public class Main {

    /**
     * Точка входа в программу.
     *
     * @param args Аргументы командной строки.
     */
    public static void main(String[] args) {

        House house1 = new House.HouseBuilder()
                .setFloors(2)
                .setRooms(4)
                .setHasGarage(true)
                .build();

        House house2 = new House.HouseBuilder()
                .setFloors(3)
                .setRooms(6)
                .setHasGarage(false)
                .build();

        House house3 = new House.HouseBuilder()
                .setFloors(2)
                .setRooms(4)
                .setHasGarage(true)
                .build();

        House house4 = new House.HouseBuilder()
                .setFloors(3)
                .setRooms(6)
                .setHasGarage(false)
                .build();


        List<House> houses = new ArrayList<>();
        houses.add(house1);
        houses.add(house2);
        houses.add(house3);
        houses.add(house4);


        System.out.println("House1 is in the list: " + houses.contains(house1)); // true
        System.out.println("House2 is in the list: " + houses.contains(house2)); // true
        System.out.println("House3 is in the list: " + houses.contains(house3)); // true
        System.out.println("House4 is in the list: " + houses.contains(house4)); // true

        // Поиск позиции домов в списке
        System.out.println("Index of House1: " + houses.indexOf(house1)); // 0
        System.out.println("Index of House2: " + houses.indexOf(house2)); // 1
        System.out.println("Index of House3: " + houses.indexOf(house3)); // 2
        System.out.println("Index of House4: " + houses.indexOf(house4)); // 3


        House house5 = new House.HouseBuilder()
                .setFloors(2)
                .setRooms(4)
                .setHasGarage(false)
                .build();

        System.out.println("House1 equals House3: " + house1.equals(house3)); // true
        System.out.println("House1 equals House5: " + house1.equals(house5)); // false


        houses.add(house5);
        System.out.println("House5 is in the list: " + houses.contains(house5)); // true
        System.out.println("Index of House5: " + houses.indexOf(house5)); // 4
    }
}