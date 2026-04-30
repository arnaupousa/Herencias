package Model;

public class Moto extends Vehiculo {

    private boolean tieneCupula;

    public Moto(String brand, String model, EngineTypeEnum engineType, String enrollment, ColorEnum color, boolean hasScreen) {
        super(brand, model, engineType, enrollment, 0, color, "");
        this.tieneCupula = hasScreen;
    }

    public Moto(String b2, String m2, EngineTypeEnum eng2, String p2, int i, ColorEnum col2, String d2, boolean screen) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean isTieneCupula() {
        return tieneCupula;
    }

    public void setTieneCupula(boolean tieneCupula) {
        this.tieneCupula = tieneCupula;
    }
    

    @Override
    public String toString() {
        return super.toString() + " Moto{tieneCupula=" + tieneCupula + "}";
    }
}
