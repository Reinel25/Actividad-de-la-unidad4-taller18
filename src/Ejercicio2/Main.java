package Ejercicio2;

public class Main {
    public static void main(String[] args) {

        //Transferencia transferencia = new ServicioTransferencia();
        Retiro retiro = new ServicioRetiro();
        PagoFactura pago = new ServicioPagoFactura();

        //transferencia.transferir(500);
        retiro.retirar(200);
        pago.pagarFactura("Factura 1234");
    }
}
