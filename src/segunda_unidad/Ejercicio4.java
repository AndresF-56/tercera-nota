package segunda_unidad;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[10];
        int i = 0;

        while (i < 10) {
            System.out.print("Número: ");
            int num = sc.nextInt();
            if (num < 0) break;
            vector[i++] = num;
        }

        System.out.println("Elementos ingresados:");
        for (int j = 0; j < i; j++) {
            System.out.println(vector[j]);
        }
    }
}
