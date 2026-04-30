package com.arnau.herencias;

import Model.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Herencias {

    // ArrayList para gestionar los objetos
    static ArrayList<Vehiculo> inventory = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    private static String d3;
    private static String d1;
    private static String d2;

    public static void main(String[] args) {
        int option = 0;
        do {
            System.out.println("\n--- VEHICLE MENU ---");
            System.out.println("1. Create Car \n2. Create Motorcycle \n3. Create Bus ");
            System.out.println("4. Show License Plates \n5. Search by Plate ");
            System.out.println("6. Total Vehicles \n7. Total Cars ");
            System.out.println("8. Total Motorcycles \n9. Total Buses ");
            System.out.println("10. Delete by Plate \n0. Exit");
            System.out.print("Select an option: ");

            option = sc.nextInt();

            switch (option) {
                case 1: // Crear Coche
                    System.out.print("Brand: ");
                    String brand = sc.next();

                    System.out.print("Model: ");
                    String model = sc.next();

                    System.out.print("Plate: ");
                    String plate = sc.next();

                    System.out.print("Fabrication Date (dd/mm/yyyy): ");
                    String date = sc.next();

                    EngineTypeEnum eng = askEngine();
                    ColorEnum col = askColor();

                    sc.nextLine();

                    System.out.print("Number of doors: ");
                    int doors = sc.nextInt();
                    sc.nextLine();

                    // Crear el coche con todos los datos
                    inventory.add(new Coche(brand, model, eng, plate, 0, col, date, doors));
                    System.out.println("Car saved successfully!");
                    break;

                case 2: // Crear Moto
                    System.out.print("Brand: ");
                    String b2 = sc.next();
                    System.out.print("Model: ");
                    String m2 = sc.next();
                    System.out.print("Plate: ");
                    String p2 = sc.next();
                    System.out.print("Fabrication Date (dd/mm/yyyy): ");
                    String d2 = sc.next();
                    // ------------------------

                    EngineTypeEnum eng2 = askEngine();
                    ColorEnum col2 = askColor();

                    System.out.print("Has screen? (true/false): ");
                    boolean screen = sc.nextBoolean();
                    
                    // Crear el moto con todos los datos
                    inventory.add(new Moto(b2, m2, eng2, p2, 0, col2, d2, screen));
                    System.out.println("Motorcycle saved!");
                    break;

                case 3: // Crear Bus
                    System.out.print("Brand: ");
                    String b3 = sc.next();
                    System.out.print("Model: ");
                    String m3 = sc.next();
                    System.out.print("Plate: ");
                    String p3 = sc.next();
                    EngineTypeEnum eng3 = askEngine();
                    ColorEnum col3 = askColor();
                    System.out.print("Capacity: ");
                    int cap = sc.nextInt();

                    System.out.println("Select Company: 1.ALSA, 2.MONBUS, 3.TMB, 4.MOVENTIS, 5.AMB");
                    BusCompany comp = (sc.nextInt() == 1) ? BusCompany.ALSA : BusCompany.MONBUS;

                    // Crear el bus con todos los datos
                    inventory.add(new Bus(b3, m3, eng3, p3, 0, col3, d3, cap, comp));
                    System.out.println("Bus saved!");
                    break;

                case 4: // Mostrar matriculas
                    for (Vehiculo v : inventory) {
                        System.out.println("Matricula: " + v.getEnrollment());
                    }
                    break;

                case 5: // Buscar y mostrar datos
                    System.out.print("Introduce matricula: ");
                    String searchPlate = sc.next();
                    for (Vehiculo v : inventory) {
                        if (v.getEnrollment().equalsIgnoreCase(searchPlate)) {
                            System.out.println(v.toString());
                        }
                    }
                    break;

                case 6: // Total vehiculos
                    System.out.println("Total: " + inventory.size());
                    break;

                case 7: // Total coches
                    int cars = 0;
                    for (Vehiculo v : inventory) {
                        if (v instanceof Coche) {
                            cars++;
                        }
                    }
                    System.out.println("Coches: " + cars);
                    break;

                case 8: // Total motos
                    int motos = 0;
                    for (Vehiculo v : inventory) {
                        if (v instanceof Moto) {
                            motos++;
                        }
                    }
                    System.out.println("Motos: " + motos);
                    break;

                case 9: // Total buses
                    int buses = 0;
                    for (Vehiculo v : inventory) {
                        if (v instanceof Bus) {
                            buses++;
                        }
                    }
                    System.out.println("Buses: " + buses);
                    break;

                case 10: // Eliminar por matricula
                    System.out.print("Matricula a borrar: ");
                    String deletePlate = sc.next();
                    inventory.removeIf(v -> v.getEnrollment().equalsIgnoreCase(deletePlate));
                    System.out.println("Proceso de eliminacion finalizado.");
                    break;
            }
        } while (option != 0);
    }

    private static ColorEnum askColor() {
        System.out.println("Select Color: 1. BLACK, 2. WHITE, 3. RED, 4. GREEN, 5. BLUE, 6. YELLOW");
        int op = sc.nextInt();
        sc.nextLine();

        switch (op) {
            case 1:
                return ColorEnum.RED;
            case 2:
                return ColorEnum.BLUE;
            case 3:
                return ColorEnum.GREEN;
            default:
                System.out.println("Invalid option, defaulting to RED");
                return ColorEnum.RED;
        }
    }

    private static EngineTypeEnum askEngine() {
        System.out.println("Select Engine: 1.Gasoline, 2.Diesel, 3.Electric");
        int op = sc.nextInt();
        if (op == 1) {
            return EngineTypeEnum.GASOLINE;
        }
        if (op == 2) {
            return EngineTypeEnum.DIESEL;
        }
        return EngineTypeEnum.ELECTRIC;
    }
}
