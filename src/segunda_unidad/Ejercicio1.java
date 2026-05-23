package segunda_unidad; 

import java.util.Random;

public class Ejercicio1 {
    public static void main(String[] args) {
        int[] vector_numeros = new int[10];
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            vector_numeros[i] = rand.nextInt(10) + 1;
        }

        for (int i = 0; i < 10; i++) {
            int num = vector_numeros[i];
            System.out.println("Número: " + num +
                    " Cuadrado: " + (num * num) +
                    " Cubo: " + (num * num * num));
        }
    }
}