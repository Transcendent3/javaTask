package OOPLesson1;

public class HotDrink extends BottleOfWater{
    private int temperature;

    public HotDrink(String name, double cost, int volume, int temperature){
        super(name, cost, volume);
        this.temperature = temperature;
    }

    /**
     * Получение температуры напитка
     *
     * @return температуру напитка
     */
    public int getTemp() {
        return temperature;
    }

    /**
     * Переопределенный метод
     *
     * @return наименование продукта, стоимость, объем и температуру.
     */
    @Override
    public String toString() {
        return super.toString() + "температура напитка = " + temperature;
    }

}
