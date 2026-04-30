package Model;

public class Coche extends Vehiculo {

    private int numPuertas;

    public Coche() {
        super();
    }

    public Coche(String brand, String model, EngineTypeEnum engineType, String enrollment, ColorEnum color, int doors) {
        super(brand, model, engineType, enrollment, doors, color, "");
        this.numPuertas = numPuertas;
    }

    @Override
    public String toString() {
        return super.toString() + " Car{doors=" + numPuertas + "}";
    }
}
