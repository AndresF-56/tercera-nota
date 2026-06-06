package segunda_unidad;
import java.util.Scanner;
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] precios = new double[5];
        int[][] cantidades = new int[5][4]; // 5 artículos, 4 sucursales

        // Leer precios
        for (int i = 0; i < 5; i++) {
            System.out.print("Precio artículo " + i + ": ");
            precios[i] = sc.nextDouble();
        }

        // Leer cantidades
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Cantidad artículo " + i + " sucursal " + j + ": ");
                cantidades[i][j] = sc.nextInt();
            }
        }

        // Cantidades totales por artículo
        for (int i = 0; i < 5; i++) {
            int total = 0;
            for (int j = 0; j < 4; j++) {
                total += cantidades[i][j];
            }
            System.out.println("Total artículo " + i + ": " + total);
        }

        // Sucursal 2
        int totalSucursal2 = 0;
        for (int i = 0; i < 5; i++) {
            totalSucursal2 += cantidades[i][1];
        }
        System.out.println("Total sucursal 2: " + totalSucursal2);

        // Artículo 3 en sucursal 1
        System.out.println("Artículo 3 en sucursal 1: " + cantidades[2][0]);

        // Recaudación por sucursal
        double[] recaudacion = new double[4];
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 5; i++) {
                recaudacion[j] += precios[i] * cantidades[i][j];
            }
            System.out.println("Recaudación sucursal " + j + ": " + recaudacion[j]);
        }

        // Total empresa
        double totalEmpresa = 0;
        for (double r : recaudacion) {
            totalEmpresa += r;
        }
        System.out.println("Total empresa: " + totalEmpresa);

        // Sucursal mayor
        int mayor = 0;
        for (int i = 1; i < 4; i++) {
            if (recaudacion[i] > recaudacion[mayor]) {
                mayor = i;
            }
        }
        System.out.println("Sucursal con mayor recaudación: " + mayor);
    }
}
