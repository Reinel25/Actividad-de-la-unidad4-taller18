package Ejercicio2;

public class ServicioTransferencia implements Transferencia {
    @Override
    public void transferir(double monto) {
        System.out.println("Realizando transferencia de: $" + monto);
    }
}
