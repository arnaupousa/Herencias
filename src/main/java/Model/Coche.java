package Model;

public class Coche extends Vehiculo {

    private int numPuertas;

    public Coche(String brand, String model, EngineTypeEnum engineType, String enrollment, ColorEnum color, int doors) {
        super(brand, model, engineType, enrollment, doors, color, "");
        this.numPuertas = numPuertas;
    }

    public Coche(String b1, String m1, EngineTypeEnum eng1, String p1, int i, ColorEnum col1, String d1, int doors) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }
    
    
    @Override
    public String toString() {
        return super.toString() + " Car{doors=" + numPuertas + "}";
    }
}
