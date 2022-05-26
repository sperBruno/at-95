public class Producto {
    private String nombre;
    private int costo;
    private int cantidad = 1;
    public Producto(String nombre, int costo) {
        this.nombre =nombre;
        this.costo = costo;
    }
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public int getCosto() {
        return costo;
    }
    public String getNombre() {
        return nombre;
    }
}
