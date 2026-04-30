package Model;

public class Bus extends Vehiculo {

    private int capacity;
    private BusCompany company;

    public Bus(String brand, String model, EngineTypeEnum engineType, String enrollment, int speed, ColorEnum color, String fabricationDate, int capacity, BusCompany company) {
        super(brand, model, engineType, enrollment, speed, color, fabricationDate);
        this.capacity = capacity;
        this.company = company;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public BusCompany getCompany() {
        return company;
    }

    public void setCompany(BusCompany company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Bus{" + "capacity=" + capacity + ", company=" + company + '}';
    }

}
