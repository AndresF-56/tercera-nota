package segunda_unidad;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] v1 = new int[5];
        int[] v2 = new int[5];
        int[] v3 = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("v1: ");
            v1[i] = sc.nextInt();
            System.out.print("v2: ");
            v2[i] = sc.nextInt();
            v3[i] = v1[i] + v2[i];
        }

        System.out.println("Resultado:");
        for (int n : v3) {
            System.out.println(n);
        }
    }
}
