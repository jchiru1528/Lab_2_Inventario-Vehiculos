package modelo;

public class Camioneta extends Vehiculo {
    private final double capacidadCarga;

    public Camioneta(String marca, String modelo, int anio,
                     double precio, double capacidadCarga) {
        super(marca, modelo, anio, precio);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    protected String getCaracteristica() {
        return "Capacidad de carga: " + capacidadCarga + " kg";
    }
}
