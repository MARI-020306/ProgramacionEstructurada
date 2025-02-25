import javax.swing.*;

public class ProveedorEstereos {
    public static void main(String[] args) {
        double precio = 0.0;
        double descuento = 0.0;
        double totalConDescuento = 0.0;
        double iva = 0.0;
        double totalFinal = 0.0;
        double precioSinIva = 0.0;
        String marca = "";

        precio = Double.parseDouble(JOptionPane.showInputDialog("Introducir el precio del estereo: "));
        if (precio >= 2000) {
            descuento += precio * 0.10;
        }
        marca = (JOptionPane.showInputDialog("Introducir el nombre de la marca del estereo "));

        if (marca.equalsIgnoreCase("NOSY")) {
            descuento += (precio - descuento) * 0.05;
        }

        totalConDescuento = precio - descuento;

        iva = totalConDescuento * 0.16;

        totalFinal = totalConDescuento + iva;

        JOptionPane.showMessageDialog(null, "Precio final es: $" + String.format("%.2f", totalFinal));
    }
}


