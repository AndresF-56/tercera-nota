package tercera_unidad.ExamenFinal.View;

import tercera_unidad.ExamenFinal.Model.Producto;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class VentanaPrincipal extends JFrame {

    public JTextField txtCliente;
    public JTextField txtCedula;
    public JTextField txtCantidad;

    public JComboBox<Producto> comboProductos;

    public JButton btnAgregar;
    public JButton btnEliminar;
    public JButton btnNuevaCompra;
    public JButton btnFacturar;

    public JTable tabla;
    public DefaultTableModel modelo;

    public JLabel lblSubtotal;
    public JLabel lblIVA;
    public JLabel lblDescuento;
    public JLabel lblTotal;

    private double totalAcumulado = 0;

    public VentanaPrincipal() {

        setTitle("🛒 SuperMarket ");
        setSize(1100, 700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Color fondo = new Color(245,245,245);

        JPanel principal = new JPanel(new BorderLayout(15,15));
        principal.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));
        principal.setBackground(fondo);

        JLabel titulo = new JLabel(" SUPERMARKET ", SwingConstants.CENTER);
        titulo.setFont(new Font("Segoe UI", Font.BOLD, 28));
        principal.add(titulo, BorderLayout.NORTH);

        JPanel centro = new JPanel(new BorderLayout(10,10));

        JPanel panelCliente = new JPanel(new GridLayout(2,2,10,10));
        panelCliente.setBorder(BorderFactory.createTitledBorder("Datos del Cliente"));

        txtCliente = new JTextField();
        txtCedula = new JTextField();

        panelCliente.add(new JLabel("Nombre"));
        panelCliente.add(txtCliente);
        panelCliente.add(new JLabel("Cedula"));
        panelCliente.add(txtCedula);

        JPanel panelProducto = new JPanel();
        panelProducto.setBorder(BorderFactory.createTitledBorder("Agregar Producto"));

        comboProductos = new JComboBox<>();

        comboProductos.addItem(
        new Producto("P001","Arroz",2500,100));

        comboProductos.addItem(
        new Producto("P002","Leche",4000,50));

        comboProductos.addItem(
        new Producto("P003","Aceite",12000,30));

        comboProductos.addItem(
        new Producto("P004","Azucar",3000,80));

        comboProductos.addItem(
        new Producto("P005","Huevos",18000,20));

        txtCantidad = new JTextField(5);

        btnAgregar = new JButton("➕ Agregar");

        panelProducto.add(new JLabel("Producto"));
        panelProducto.add(comboProductos);
        panelProducto.add(new JLabel("Cantidad"));
        panelProducto.add(txtCantidad);
        panelProducto.add(btnAgregar);

        JPanel superior = new JPanel(new BorderLayout());
        superior.add(panelCliente, BorderLayout.NORTH);
        superior.add(panelProducto, BorderLayout.SOUTH);

        centro.add(superior, BorderLayout.NORTH);

        modelo = new DefaultTableModel();
        modelo.addColumn("Código");
        modelo.addColumn("Producto");
        modelo.addColumn("Precio");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Subtotal");

        tabla = new JTable(modelo);
        tabla.setRowHeight(30);

        JScrollPane scroll = new JScrollPane(tabla);
        centro.add(scroll, BorderLayout.CENTER);

        principal.add(centro, BorderLayout.CENTER);

        JPanel panelTotales = new JPanel(new GridLayout(4,1,10,10));
        panelTotales.setPreferredSize(new Dimension(220,200));
        panelTotales.setBorder(BorderFactory.createTitledBorder("Resumen"));

        lblSubtotal = new JLabel("Subtotal: $0");
        lblIVA = new JLabel("IVA: $0");
        lblDescuento = new JLabel("Descuento: $0");
        lblTotal = new JLabel("TOTAL: $0");

        lblTotal.setFont(new Font("Segoe UI", Font.BOLD, 24));
        lblTotal.setForeground(new Color(0,150,0));

        panelTotales.add(lblSubtotal);
        panelTotales.add(lblIVA);
        panelTotales.add(lblDescuento);
        panelTotales.add(lblTotal);

        principal.add(panelTotales, BorderLayout.EAST);

        JPanel panelBotones = new JPanel();

        btnEliminar = new JButton("🗑 Eliminar");
        btnNuevaCompra = new JButton("🔄 Nueva Compra");
        btnFacturar = new JButton("🧾 Facturar");

        panelBotones.add(btnEliminar);
        panelBotones.add(btnNuevaCompra);
        panelBotones.add(btnFacturar);

        principal.add(panelBotones, BorderLayout.SOUTH);

        btnAgregar.addActionListener(e -> agregarProducto());
        btnEliminar.addActionListener(e -> eliminarProducto());
        btnNuevaCompra.addActionListener(e -> nuevaCompra());
        btnFacturar.addActionListener(e -> facturar());

        add(principal);
    }

    private void agregarProducto() {

    try {

        if(txtCliente.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(
                    this,
                    "Ingrese el nombre del cliente");
            return;
        }

        if(txtCedula.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(
                    this,
                    "Ingrese la cédula");
            return;
        }

        if(txtCantidad.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(
                    this,
                    "Ingrese la cantidad");
            return;
        }

        Producto producto =
                (Producto) comboProductos.getSelectedItem();

        int cantidad =
                Integer.parseInt(txtCantidad.getText());

        if(cantidad <= 0) {
            JOptionPane.showMessageDialog(
                    this,
                    "La cantidad debe ser mayor que cero");
            return;
        }

        if(cantidad > producto.getStock()) {

    JOptionPane.showMessageDialog(
            this,
            "No hay suficientes unidades de "
            + producto.getNombre()
            + ".\nStock disponible: "
            + producto.getStock(),
            "Stock insuficiente",
            JOptionPane.WARNING_MESSAGE
    );

    return;
}

        double precio = producto.getPrecio();
        double subtotal = precio * cantidad;

        modelo.addRow(new Object[]{
                producto.getCodigo(),
                producto.getNombre(),
                precio,
                cantidad,
                subtotal
        });

        producto.disminuirStock(cantidad);

        totalAcumulado += subtotal;

        actualizarTotales();

        txtCantidad.setText("");

    } catch(NumberFormatException ex) {

        JOptionPane.showMessageDialog(
                this,
                "La cantidad debe contener solo números");
    }
}
 
    private void eliminarProducto() {
        int fila = tabla.getSelectedRow();

        if(fila == -1){
            JOptionPane.showMessageDialog(this,"Seleccione un producto");
            return;
        }

        totalAcumulado -= Double.parseDouble(modelo.getValueAt(fila,4).toString());
        modelo.removeRow(fila);
        actualizarTotales();
    }

    private void nuevaCompra() {
        modelo.setRowCount(0);
        totalAcumulado = 0;

        txtCliente.setText("");
        txtCedula.setText("");
        txtCantidad.setText("");

        actualizarTotales();
    }

   private void facturar() {

    if(txtCliente.getText().trim().isEmpty()
            || txtCedula.getText().trim().isEmpty()) {

        JOptionPane.showMessageDialog(
                this,
                "Debe ingresar los datos del cliente"
        );

        return;
    }

    if(modelo.getRowCount() == 0) {

        JOptionPane.showMessageDialog(
                this,
                "Debe agregar al menos un producto antes de facturar"
        );

        return;
    }

    JOptionPane.showMessageDialog(this,
            "===== FACTURA =====\n\n" +
            "Cliente: " + txtCliente.getText() +
            "\nCedula: " + txtCedula.getText() +
            "\n\n" +
            lblTotal.getText());
}

    private void actualizarTotales() {

        double iva = totalAcumulado * 0.19;
        double descuento = totalAcumulado > 100000 ? totalAcumulado * 0.10 : 0;
        double total = totalAcumulado + iva - descuento;

        lblSubtotal.setText("Subtotal: $" + String.format("%.0f", totalAcumulado));
        lblIVA.setText("IVA: $" + String.format("%.0f", iva));
        lblDescuento.setText("Descuento: $" + String.format("%.0f", descuento));
        lblTotal.setText("TOTAL: $" + String.format("%.0f", total));
    }
}