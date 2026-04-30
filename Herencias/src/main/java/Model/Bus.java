package Model;

public class Bus extends Vehiculo {
    
    private int capacity;
    private BusCompany company;

    public Bus() {
        super();
    }

    public Bus(String brand, String model, EngineTypeEnum engineType, String enrollment, ColorEnum color, int capacity, BusCompany company) {
        super(brand, model, engineType, enrollment, 0, color, ""); 
        this.capacity = capacity;
        this.company = company;
    }

    public int getCapacity() { return capacity; }
    public void setCapacity(int capacity) { this.capacity = capacity; }
    public BusCompany getCompany() { return company; }
    public void setCompany(BusCompany company) { this.company = company; }

    @Override
    public String toString() {
        return super.toString() + " Bus{capacity=" + capacity + ", company=" + company + "}";
    }
}