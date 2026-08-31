package datos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import modelo.Automovil;
import modelo.Camioneta;
import modelo.Vehiculo;

public class LectorVehiculos {

    public List<Vehiculo> cargar(String nombreArchivo) throws IOException {
        List<Vehiculo> vehiculos = new ArrayList<>();
        List<String> lineas = Files.readAllLines(Path.of(nombreArchivo));

        for (int i = 1; i < lineas.size(); i++) {
            String[] datos = lineas.get(i).split(",");
            String tipo = datos[0].trim();
            String marca = datos[1].trim();
            String modelo = datos[2].trim();
            int anio = Integer.parseInt(datos[3].trim());
            double precio = Double.parseDouble(datos[4].trim());
            double caracteristica = Double.parseDouble(datos[5].trim());

            if (tipo.equalsIgnoreCase("AUTOMOVIL")) {
                vehiculos.add(new Automovil(marca, modelo, anio,
                        precio, (int) caracteristica));
            } else if (tipo.equalsIgnoreCase("CAMIONETA")) {
                vehiculos.add(new Camioneta(marca, modelo, anio,
                        precio, caracteristica));
            }
        }
        return vehiculos;
    }
}
