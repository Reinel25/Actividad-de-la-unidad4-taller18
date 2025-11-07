package Ejercicio1;

public class Main {
    public static void main(String[] args) {

        Reparacion tecnico = new Tecnico();
        Limpieza limpieza = new AuxiliarLimpieza();

        tecnico.reparar();
        limpieza.limpiar();
    }
}
