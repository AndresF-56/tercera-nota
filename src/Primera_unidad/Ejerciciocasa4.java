package primera_unidad;

import java.util.Scanner;

public class Ejerciciocasa4 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Ingrese el tercer número: ");
        double num3 = scanner.nextDouble();

        if (num1 > num2 && num1 < num3) {
            System.out.println("El primer número es mayor que el segundo y menor que el tercero.");
        } else {
            System.out.println("No se cumple la condición.");
        }

        scanner.close();
    }
}
