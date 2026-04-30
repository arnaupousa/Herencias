package Model;

public class Moto extends Vehiculo {

    private boolean tieneCupula;

    public Moto() {
        super();
    }

    public Moto(String brand, String model, EngineTypeEnum engineType, String enrollment, ColorEnum color, boolean hasScreen) {
        super(brand, model, engineType, enrollment, 0, color, "");
        this.tieneCupula = hasScreen;
    }

    @Override
    public String toString() {
        return super.toString() + " Moto{tieneCupula=" + tieneCupula + "}";
    }
}
