import org.junit.Assert;
import org.junit.Test;

public class TiendaTest {

    @Test
    public void testTiendaRecibo() {
        //AAA
        String recibo = "Pan - 1 Bs\nFideos - 5 Bs\nBolsa de Leche - 6 Bs\nTotal 12 Bs.";
        Tienda tienda = new Tienda();

        tienda.agregar(new Producto("Pan", 1));
        tienda.agregar(new Producto("Fideos", 5));
        tienda.agregar(new Producto("Bolsa de Leche", 6));

        String reciboActual = tienda.getRecibo();

        Assert.assertEquals(recibo, reciboActual);
    }
}
