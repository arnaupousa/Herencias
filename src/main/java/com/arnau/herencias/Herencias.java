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
            System.out.println("\n--- MENU DE VEHICULOS ---");
            System.out.println("1. Crear Coche \n2. Crear Moto \n3. Crear Bus ");
            System.out.println("4. Mostrar Matriculas \n5. Buscar por Matricula ");
            System.out.println("6. Total Vehiculos \n7. Total Coches ");
            System.out.println("8. Total Motos \n9. Total Buses ");
            System.out.println("10. Eliminar por Matricula \n0. Salir");
            System.out.print("Selecciona una opcion: ");

            option = sc.nextInt();

            switch (option) {
                case 1: // Crear Coche
                    System.out.print("Brand: ");
                    String b1 = sc.next();
                    System.out.print("Model: ");
                    String m1 = sc.next();
                    System.out.print("Plate: ");
                    String p1 = sc.next();
                    EngineTypeEnum eng1 = askEngine();
                    ColorEnum col1 = askColor();
                    System.out.print("Doors: ");
                    int doors = sc.nextInt();

                    // Guardamos en el ArrayList
                    inventory.add(new Coche(b1, m1, eng1, p1, 0, col1, d1, doors));
                    System.out.println("Car saved!");
                    break;

                case 2: // Crear Moto
                    System.out.print("Brand: ");
                    String b2 = sc.next();
                    System.out.print("Model: ");
                    String m2 = sc.next();
                    System.out.print("Plate: ");
                    String p2 = sc.next();
                    EngineTypeEnum eng2 = askEngine();
                    ColorEnum col2 = askColor();
                    System.out.print("Has screen? (true/false): ");
                    boolean screen = sc.nextBoolean();

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

                    System.out.println("Select Company: 1.ALSA, 2.MONBUS");
                    BusCompany comp = (sc.nextInt() == 1) ? BusCompany.ALSA : BusCompany.MONBUS;

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
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private static EngineTypeEnum askEngine() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
