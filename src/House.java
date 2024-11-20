import java.util.Objects;

/**
 * Класс, представляющий дом.
 */
public class House {
    private int floors;
    private int rooms;
    private boolean hasGarage;

    /**
     * Приватный конструктор, используемый билдером.
     *
     * @param builder Билдер для создания объекта House.
     */
    private House(HouseBuilder builder) {
        this.floors = builder.floors;
        this.rooms = builder.rooms;
        this.hasGarage = builder.hasGarage;
    }

    /**
     * Возвращает количество этажей в доме.
     *
     * @return Количество этажей.
     */
    public int getFloors() {
        return floors;
    }

    /**
     * Возвращает количество комнат в доме.
     *
     * @return Количество комнат.
     */
    public int getRooms() {
        return rooms;
    }

    /**
     * Проверяет, есть ли гараж в доме.
     *
     * @return true, если гараж есть, иначе false.
     */
    public boolean hasGarage() {
        return hasGarage;
    }

    /**
     * Возвращает строковое представление объекта House.
     *
     * @return Строковое представление объекта.
     */
    @Override
    public String toString() {
        return "House{" +
                "floors=" + floors +
                ", rooms=" + rooms +
                ", hasGarage=" + hasGarage +
                '}';
    }

    /**
     * Проверяет, равны ли два объекта House.
     *
     * @param o Объект для сравнения.
     * @return true, если объекты равны, иначе false.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return floors == house.floors &&
                rooms == house.rooms &&
                hasGarage == house.hasGarage;
    }

    /**
     * Возвращает хэш-код объекта House.
     *
     * @return Хэш-код объекта.
     */
    @Override
    public int hashCode() {
        return Objects.hash(floors, rooms, hasGarage);
    }

    /**
     * Вложенный класс билдера для создания объекта House.
     */
    public static class HouseBuilder {
        private int floors;
        private int rooms;
        private boolean hasGarage;

        /**
         * Устанавливает количество этажей в доме.
         *
         * @param floors Количество этажей.
         * @return Экземпляр билдера.
         */
        public HouseBuilder setFloors(int floors) {
            this.floors = floors;
            return this;
        }

        /**
         * Устанавливает количество комнат в доме.
         *
         * @param rooms Количество комнат.
         * @return Экземпляр билдера.
         */
        public HouseBuilder setRooms(int rooms) {
            this.rooms = rooms;
            return this;
        }

        /**
         * Устанавливает наличие гаража в доме.
         *
         * @param hasGarage true, если гараж есть, иначе false.
         * @return Экземпляр билдера.
         */
        public HouseBuilder setHasGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        /**
         * Создает объект House на основе текущих настроек билдера.
         *
         * @return Новый объект House.
         */
        public House build() {
            return new House(this);
        }
    }
}