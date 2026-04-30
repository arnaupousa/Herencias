package Model;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Vehiculo {

    public static final double MAX_SPEED = 120;
    public static final double MIN_SPEED = 0;

    private double speed;
    private String brand;
    private String model;
    private EngineTypeEnum engineType;
    private String enrollment;
    private ColorEnum color;
    private String fabricationDate;
    
    public Vehiculo() {
    }

    public Vehiculo(String brand, String model, EngineTypeEnum engineType, String enrollment, int speed, ColorEnum color, String fabricationDate) {
        this.brand = brand;
        this.model = model;
        this.engineType = engineType;
        this.enrollment = enrollment;
        this.speed = speed;
        this.color = color;
        this.fabricationDate = fabricationDate;
    }

    public double getVelocidad() {
        return speed;
    }

    public void setVelocidad(double velocidad) {
        if (velocidad <= MAX_SPEED) {
            this.speed = velocidad;
        } else {
            this.speed = MAX_SPEED;
        }
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public EngineTypeEnum getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineTypeEnum engineType) {
        this.engineType = engineType;
    }

    public String getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(String enrollment) {
        this.enrollment = enrollment;
    }

    public ColorEnum getColor() {
        return color;
    }

    public void setColor(ColorEnum color) {
        this.color = color;
    }

    public String getFabricationDate() {
        return fabricationDate;
    }

    public void setFabricationDate(String fabricationDate) {
        this.fabricationDate = fabricationDate;
    }
    
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vehiculo{");
        sb.append("speed=").append(speed);
        sb.append(", brand=").append(brand);
        sb.append(", model=").append(model);
        sb.append(", engineType=").append(engineType);
        sb.append(", enrollment=").append(enrollment);
        sb.append(", color=").append(color);
        sb.append(", antiquity=").append(calculateAntiquity()).append(" years");
        sb.append('}');
        
        return sb.toString();
    }

    public void acelerar(double velocidad) {
        this.speed += 10;
        if (this.speed > 120) {
            this.speed = MAX_SPEED;
        }
    }

    public void frenar(double velocidad) {
        this.speed -= 10;
        if (this.speed < 0) {
            this.speed = MIN_SPEED;
        }
    }

    public int calculateAntiquity() {
    try {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        // Convertimos el atributo fabricationDate que ya tienes en la clase
        LocalDate birthDate = LocalDate.parse(this.fabricationDate, formatter);
        return Period.between(birthDate, LocalDate.now()).getYears();
    } catch (Exception e) {
        // Si la fecha está mal introducida, devolvemos 0 para evitar que el programa se cierre
        return 0;
    }
}
}
