package tercera_unidad.ExamenFinal.App;

import javax.swing.SwingUtilities;
import tercera_unidad.ExamenFinal.View.VentanaPrincipal;

public class Main {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            new VentanaPrincipal().setVisible(true);
        });

    }
}