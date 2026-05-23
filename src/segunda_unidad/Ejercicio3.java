package segunda_unidad;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[5];
        double suma = 0, mayor, menor;

        for (int i = 0; i < 5; i++) {
            System.out.print("Nota: ");
            notas[i] = sc.nextDouble();
            suma += notas[i];
        }

        mayor = menor = notas[0];

        for (double n : notas) {
            if (n > mayor) mayor = n;
            if (n < menor) menor = n;
        }

        System.out.println("Media: " + (suma / 5));
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
    }
}
