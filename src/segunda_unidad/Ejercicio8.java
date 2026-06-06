package segunda_unidad;
import java.util.*;


public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> nombres = new ArrayList<>();
        List<Integer> edades = new ArrayList<>();

        while (true) {
            System.out.print("Nombre (* para salir): ");
            String nombre = sc.nextLine();
            if (nombre.equals("*")) break;

            System.out.print("Edad: ");
            int edad = sc.nextInt();
            sc.nextLine();

            nombres.add(nombre);
            edades.add(edad);
        }

        int mayorEdad = 0;

        for (int edad : edades) {
            if (edad > mayorEdad) mayorEdad = edad;
        }

        System.out.println("Mayores de edad:");
        for (int i = 0; i < edades.size(); i++) {
            if (edades.get(i) >= 18) {
                System.out.println(nombres.get(i));
            }
        }

        System.out.println("Más edad:");
        for (int i = 0; i < edades.size(); i++) {
            if (edades.get(i) == mayorEdad) {
                System.out.println(nombres.get(i));
            }
        }
    }
}
