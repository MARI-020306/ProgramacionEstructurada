import javax.swing.*;

public class ProveedorEstereos {
    public static void main(String[] args) {

        //Declaracion de variables
        double precio = 0.0;
        double descuento = 0.0;
        double totalConDescuento = 0.0;
        double iva = 0.0;
        double totalFinal = 0.0;
        double precioSinIva = 0.0;
        String marca = "";

        //Entrada de datos
        precio = Double.parseDouble(JOptionPane.showInputDialog("Introducir el precio del estereo: "));

        //Condicioes a cumplir
        if (precio >= 2000) {
            descuento += precio * 0.10; //Calcular descuento
        }
        //Salida de datos
        marca = (JOptionPane.showInputDialog("Introducir el nombre de la marca del estereo "));

        //Condiciones a cumplir
        if (marca.equalsIgnoreCase("NOSY")) {
            descuento += (precio - descuento) * 0.05; //Calcular descuento
        }

        //Resolucion de operaciones para calcular operaciones
        totalConDescuento = precio - descuento;

        iva = totalConDescuento * 0.16;

        totalFinal = totalConDescuento + iva;

        //Salida de datos
        JOptionPane.showMessageDialog(null, "Precio final es: $" + String.format("%.2f", totalFinal));
    }
}


