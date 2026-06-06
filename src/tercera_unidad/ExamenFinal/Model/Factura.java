package tercera_unidad.ExamenFinal.Model;

import java.time.LocalDateTime;
public class Factura{
 private static int consecutivo=1;
 private int numeroFactura;
 private LocalDateTime fecha;
 public Factura(){numeroFactura=consecutivo++; fecha=LocalDateTime.now();}
 public int getNumeroFactura(){return numeroFactura;}
 public LocalDateTime getFecha(){return fecha;}
}