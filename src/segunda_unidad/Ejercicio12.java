package segunda_unidad;

public class Ejercicio12 {
    public static void main(String[] args) {
        int[][] marco = new int[5][15];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 15; j++) {
                if (i == 0 || i == 4 || j == 0 || j == 14) {
                    marco[i][j] = 1;
                } else {
                    marco[i][j] = 0;
                }
            }
        }

        for (int[] fila : marco) {
            for (int n : fila) {
                System.out.print(n);
            }
            System.out.println();
        }
    }
}
