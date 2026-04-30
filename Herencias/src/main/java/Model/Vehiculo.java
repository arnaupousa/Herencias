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

    public Vehiculo(String marca, String modelo, EngineTypeEnum tipoMotor, String matricula, int numPuertas, ColorEnum color, String fechaFab) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipoMotor = tipoMotor;
        this.matricula = matricula;
        this.numPuertas = numPuertas;
        this.color = color;
        this.fechaFab = fechaFab;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        if (velocidad <= MAX_SPEED) {
            this.velocidad = velocidad;
        } else {
            this.velocidad = MAX_SPEED;
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
Ñ
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
        sb.append('}');
        return sb.toString();
    }


    public void acelerar(double velocidad) {
        this.velocidad += 10;
        if (this.velocidad > 120) {
            this.velocidad = MAX_SPEED;
        }
    }

    public void frenar(double velocidad) {
        this.velocidad -= 10;
        if (this.velocidad < 0) {
            this.velocidad = MIN_SPEED;
        }
    }

    public int calcularAntiguedad() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birthDate = LocalDate.parse(this.fechaFab, formatter);
        return Period.between(birthDate, LocalDate.now()).getYears();
    }
}

