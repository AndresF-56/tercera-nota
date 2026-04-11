package primera_unidad.parcial;


import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el documento o identificación: ");
        String documento = scanner.nextLine();

        System.out.print("Ingrese el puntaje de desempeño (0 a 100): ");

        
        if (scanner.hasNextDouble()) {
            double puntaje = scanner.nextDouble();

           
            if (puntaje < 0 || puntaje > 100) {
                System.out.println("\n❌ Error: El puntaje ingresado es inválido. Debe estar entre 0 y 100.");
            } else {
                String clasificacion;

               
                if (puntaje <= 59) {
                    clasificacion = "Desempeño insuficiente";
                } else if (puntaje <= 74) {
                    clasificacion = "Desempeño aceptable";
                } else if (puntaje <= 89) {
                    clasificacion = "Buen desempeño";
                } else {
                    clasificacion = "Desempeño sobresaliente";
                }

                
                System.out.println("\n===== RESULTADO DE EVALUACIÓN =====");
                System.out.println("Nombre del empleado: " + nombre);
                System.out.println("Documento: " + documento);
                System.out.println("Puntaje obtenido: " + puntaje);
                System.out.println("Clasificación: " + clasificacion);
                System.out.println("==================================");
            }
        } else {
            System.out.println(" Error: Debe ingresar un valor numérico válido para el puntaje.");
        }

        scanner.close();
    }
}
