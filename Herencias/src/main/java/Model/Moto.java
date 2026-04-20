package Model;

public class Moto extends Vehiculo {

    private boolean tieneCupula;

    public Moto() {
        super();
    }

    public Moto(String marca, String modelo, EngineTypeEnum tipoMotor, String matricula, int numPuertas, ColorEnum color, String fechaFab) {
        super(marca, modelo, tipoMotor, matricula, numeroPuertas, color, fechaFab);
        this.tieneCupula;
    }

}
