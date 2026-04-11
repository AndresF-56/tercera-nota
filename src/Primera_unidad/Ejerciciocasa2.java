package primera_unidad;

public class Ejerciciocasa2 {
    public static void main(String[] args) {
        
        double camiseta = 25;
        double pantalon = 30;

        
        double camisetaDesc = camiseta - (camiseta * 0.15);
        double pantalonDesc = pantalon - (pantalon * 0.15);

        double total = camisetaDesc + pantalonDesc;

       
        double segundaCamiseta = camisetaDesc - (camisetaDesc * 0.05);

        double totalFinal = total + segundaCamiseta;

        System.out.println("Total sin segunda camiseta: $" + total);
        System.out.println("Total con segunda camiseta: $" + totalFinal);
    }
}
