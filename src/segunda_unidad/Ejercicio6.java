package segunda_unidad;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] meses = {
                "Enero","Febrero","Marzo","Abril","Mayo","Junio",
                "Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"
        };

        int[] dias = {
                31,28,31,30,31,30,31,31,30,31,30,31
        };

        System.out.print("Ingrese número de mes (1-12): ");
        int mes = sc.nextInt();

        System.out.println(meses[mes - 1] + " tiene " + dias[mes - 1] + " días");
    }
}
