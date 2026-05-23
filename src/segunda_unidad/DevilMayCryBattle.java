package segunda_unidad;
import java.util.Random;
import java.util.Scanner;

public class DevilMayCryBattle {
    Random random = new Random();

    public static void main(String[] args) {
        new DevilMayCryBattle().iniciarJuego();

}
 public void iniciarJuego() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== DEVIL MAY CRY BATTLE ===");

        String personaje = elegirPersonaje(scanner);
        String oponente = personaje.equals("Dante") ? "Vergil" : "Dante";
        String escenario = elegirEscenario(scanner);

        System.out.println("\nTú: " + personaje + " | Rival: " + oponente);
        System.out.println("Escenario: " + escenario);

        dialogo(personaje);
        pelea(personaje, oponente, scanner);

        scanner.close();
    }

    private String elegirPersonaje(Scanner sc) {
        System.out.println("1. Dante\n2. Vergil");
         
        System.out.println("============================");
    
        int op = sc.hasNextInt() ? sc.nextInt() : 0;

        if (op == 1) return "Dante";
        if (op == 2) return "Vergil";

        return random.nextBoolean() ? "Dante" : "Vergil";
    }

    private String elegirEscenario(Scanner sc) {
        System.out.println("============================");
        
        System.out.println("1. Temen-ni-gru\n2. Torre Sparta\n3. Infierno");

        System.out.println("============================");

        int op = sc.hasNextInt() ? sc.nextInt() : 1;

        switch (op) {
            case 2: return "Torre Sparta";
            case 3: return "Infierno";
            default: return "Temen-ni-gru";
        }
    }

    private void dialogo(String p) {
        System.out.println("\n=== PRE-PELEA ===");
        if (p.equals("Dante")) {
            System.out.println("Dante: Te voy a bajar de esa nube, Vergil.");
        } else {
            System.out.println("Vergil: No eres rival para mí, Dante.");
        }
        System.out.println("============================");
    }

    private void pelea(String p, String o, Scanner sc) {

        int hpP = 100, hpO = 100;

        while (hpP > 0 && hpO > 0) {

            System.out.println("\n" + p + " HP: " + hpP + " | " + o + " HP: " + hpO);
            System.out.println("1.Rápido 2.Fuerte 3.Especial 4.Curar");

            int op = sc.hasNextInt() ? sc.nextInt() : 0;

            // Turno jugador
            if (random.nextDouble() < 0.2) {
                System.out.println("Fallaste,");
            } else {
                int dmg = 0;

                switch (op) {
                    case 1: dmg = rand(5, 12); break;
                    case 2: dmg = rand(10, 20); break;
                    case 3: dmg = rand(15, 30); break;
                    case 4:
                        int heal = rand(10, 20);
                        hpP += heal;
                        hpP = Math.min(100, hpP);
                        System.out.println("Te curaste " + heal);
                        break;
                    default:
                        System.out.println("Nada, te quedaste mirando...");
                }

                hpO -= dmg;
                hpO = Math.max(0, hpO);

                if (dmg > 0)
                    System.out.println("Hiciste " + dmg + " daño");
            }

            if (hpO <= 0) break;

            
            System.out.println("\nTurno de " + o);

            int decision = random.nextInt(4) + 1;

            if (random.nextDouble() < 0.2) {
                System.out.println(o + " falló");
            } else {
                int dmg = 0;

                if (hpO < 30 && decision == 4) {
                    int heal = rand(10, 20);
                    hpO += heal;
                    hpO = Math.min(100, hpO);
                    System.out.println(o + " se curó " + heal);
                } else {
                    switch (decision) {
                        case 1: dmg = rand(5, 12); break;
                        case 2: dmg = rand(10, 20); break;
                        case 3: dmg = rand(15, 30); break;
                    }

                    hpP -= dmg;
                    hpP = Math.max(0, hpP);

                    System.out.println(o + " hizo " + dmg + " daño");
                }
            }
        }

        System.out.println("\n=== RESULTADO ===");
        if (hpP <= 0 && hpO <= 0)
            System.out.println("Empate");
        else if (hpP <= 0)
            System.out.println(o + " ganó");
        else
            System.out.println(p + " ganó");
        
    }

    private int rand(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }
}
