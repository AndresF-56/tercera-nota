package primera_unidad;

public class Ejerciciocasa3 {
     public static void main(String[] args) {
        
        double dinero = 1000;
        double retiroSemanal = 200;
        int semanas = 4;

        double totalRetirado = retiroSemanal * semanas;
        double restante = dinero - totalRetirado;

        System.out.println("Dinero restante: $" + restante);
    }
}
