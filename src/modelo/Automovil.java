package modelo;

public class Automovil extends Vehiculo {
    private final int cantidadPuertas;

    public Automovil(String marca, String modelo, int anio,
                     double precio, int cantidadPuertas) {
        super(marca, modelo, anio, precio);
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    protected String getCaracteristica() {
        return "Puertas: " + cantidadPuertas;
    }
}
