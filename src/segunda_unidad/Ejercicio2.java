package segunda_unidad;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] vector = new String[5];
        String[] inverso = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese palabra: ");
            vector[i] = sc.nextLine();
        }

        for (int i = 0; i < 5; i++) {
            inverso[i] = vector[4 - i];
        }

        System.out.println("Vector inverso:");
        for (String s : inverso) {
            System.out.println(s);
        }
    }
}
    

