package segunda_unidad;

public class Ejercicio11 {
    public static void main(String[] args) {
        int[][] diagonal = new int[5][5];

        for (int i = 0; i < 5; i++) {
            diagonal[i][i] = 1;
        }

        for (int[] fila : diagonal) {
            for (int n : fila) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
