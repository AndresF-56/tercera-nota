package segunda_unidad;
import java.util.Arrays;
import java.util.Random;

public class Ejercicio5 {
    public static void main(String[] args) {
        int[] vector = new int[10];
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            vector[i] = rand.nextInt(100);
        }

        Arrays.sort(vector);

        System.out.println("Ordenado:");
        for (int n : vector) {
            System.out.println(n);
        }
    }
}
