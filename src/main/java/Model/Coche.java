package Model;

public class Coche extends Vehiculo {

    private int doors;

    public Coche(String brand, String model, EngineTypeEnum engineType, String enrollment, int speed, ColorEnum color, String fabricationDate, int doors) {
        super(brand, model, engineType, enrollment, speed, color, fabricationDate); // Los 7 del padre
        this.doors = doors;
    }

    public int getNumPuertas() {
        return doors;
    }

    public void setNumPuertas(int numPuertas) {
        this.doors = numPuertas;
    }

    @Override
    public String toString() {
        return super.toString() + " Car{doors=" + doors + "}";
    }
}
