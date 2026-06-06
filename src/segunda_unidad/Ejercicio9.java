package segunda_unidad;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] min = new int[5];
        int[] max = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Min día " + i + ": ");
            min[i] = sc.nextInt();
            System.out.print("Max día " + i + ": ");
            max[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Media día " + i + ": " + (min[i] + max[i]) / 2.0);
        }

        int menor = min[0];
        for (int m : min) {
            if (m < menor) menor = m;
        }

        System.out.println("Días con menor temperatura:");
        for (int i = 0; i < 5; i++) {
            if (min[i] == menor) {
                System.out.println("Día " + i);
            }
        }
    }
}
