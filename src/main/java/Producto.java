public class Producto {
    public String getNombre() {
        return nombre;
    }

    private String nombre;
    private int costo;

    public int getCosto() {
        return costo;
    }

    public Producto(String nombre, int costo) {
        this.nombre =nombre;
        this.costo = costo;
    }
}
