package aplicacion;

import datos.LectorVehiculos;
import java.io.IOException;
import java.util.List;
import modelo.Vehiculo;

public class Main {
    public static void main(String[] args) {
        LectorVehiculos lector = new LectorVehiculos();

        try {
            List<Vehiculo> vehiculos = lector.cargar("datos/vehiculos.csv");
            System.out.println("=== INVENTARIO DE VEHÍCULOS ===");
            for (Vehiculo vehiculo : vehiculos) {
                System.out.println(vehiculo.mostrarInformacion());
            }
            System.out.println("Total de vehículos: " + vehiculos.size());
        } catch (IOException | NumberFormatException e) {
            System.out.println("No fue posible leer el inventario: " + e.getMessage());
        }
    }
}
