import datos.LectorVehiculos;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import modelo.Vehiculo;

public class Main {
    public static void main(String[] args) {
        LectorVehiculos lector = new LectorVehiculos();
        Path rutaArchivo = Path.of("src", "vehiculos.csv");
        try {
            List<Vehiculo> vehiculos = lector.cargar(rutaArchivo.toString());
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
