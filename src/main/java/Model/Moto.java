package Model;

public class Moto extends Vehiculo {

    private boolean hasScreen;

    public Moto(String brand, String model, EngineTypeEnum engineType, String enrollment, int speed, ColorEnum color, String fabricationDate, boolean hasScreen) {
        super(brand, model, engineType, enrollment, speed, color, fabricationDate);
        this.hasScreen = hasScreen;
    }

    public boolean isTieneCupula() {
        return hasScreen;
    }

    public void setTieneCupula(boolean tieneCupula) {
        this.hasScreen = tieneCupula;
    }

    @Override
    public String toString() {
        return super.toString() + " Moto{tieneCupula=" + hasScreen + "}";
    }
}
