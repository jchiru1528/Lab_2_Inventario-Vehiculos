package modelo;

public abstract class Vehiculo {
    private final String marca;
    private final String modelo;
    private final int anio;
    private final double precio;

    protected Vehiculo(String marca, String modelo, int anio, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public int getAnio() {
        return anio;
    }

    protected abstract String getCaracteristica();

    public String mostrarInformacion() {
        return String.format("%s %s | Año: %d | Precio: B/. %,.2f | %s",
                marca, modelo, anio, precio, getCaracteristica());
    }
}
