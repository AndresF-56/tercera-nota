package tercera_unidad.ExamenFinal.Model;

public class Producto{
 private String codigo,nombre; private double precio;
 public Producto(String c,String n,double p){codigo=c;nombre=n;precio=p;}
 public String getCodigo(){return codigo;}
 public String getNombre(){return nombre;}
 public double getPrecio(){return precio;}
}