package Ejercicio2;

public class ServicioPagoFactura implements PagoFactura {
    @Override
    public void pagarFactura(String factura) {
        System.out.println("Pagando factura: " + factura);
    }
}
