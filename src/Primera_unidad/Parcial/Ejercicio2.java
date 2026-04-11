package primera_unidad.parcial;


import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Ingrese la cantidad de estudiantes: ");
        int n = scanner.nextInt();

        double[] notas = new double[n];

        
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la nota del estudiante " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        
        double suma = 0;
        double mayor = notas[0];
        double menor = notas[0];
        int aprobados = 0;
        int reprobados = 0;

        
        for (int i = 0; i < n; i++) {
            suma += notas[i];

            if (notas[i] > mayor) {
                mayor = notas[i];
            }

            if (notas[i] < menor) {
                menor = notas[i];
            }

            if (notas[i] >= 3.0) {
                aprobados++;
            } else {
                reprobados++;
            }
        }

        double promedio = suma / n;

       
        System.out.println("\nNotas ingresadas:");
        for (int i = 0; i < n; i++) {
            System.out.println("Estudiante " + (i + 1) + ": " + notas[i]);
        }

       
        System.out.println("\n--- Resumen del grupo ---");
        System.out.println("Nota más alta: " + mayor);
        System.out.println("Nota más baja: " + menor);
        System.out.println("Promedio: " + promedio);
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Reprobados: " + reprobados);

        scanner.close();
    }
}
