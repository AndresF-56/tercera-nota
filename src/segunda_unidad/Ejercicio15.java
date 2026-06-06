package segunda_unidad;
import java.util.Scanner;   
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] equipos = new String[15][2];
        int[][] resultados = new int[15][2];

        // Leer equipos
        for (int i = 0; i < 15; i++) {
            System.out.print("Equipo 1 partido " + (i + 1) + ": ");
            equipos[i][0] = sc.nextLine();

            System.out.print("Equipo 2 partido " + (i + 1) + ": ");
            equipos[i][1] = sc.nextLine();
        }

        // Leer resultados
        for (int i = 0; i < 15; i++) {
            System.out.println("Resultado de " + equipos[i][0] + " vs " + equipos[i][1]);

            System.out.print("Goles " + equipos[i][0] + ": ");
            resultados[i][0] = sc.nextInt();

            System.out.print("Goles " + equipos[i][1] + ": ");
            resultados[i][1] = sc.nextInt();
        }

        // Mostrar resultados
        System.out.println("\nResultados finales:");
        for (int i = 0; i < 15; i++) {
            System.out.println(equipos[i][0] + " " + resultados[i][0] +
                    " - " + resultados[i][1] + " " + equipos[i][1]);
        }
    }
}
