import javax.swing.*;
public class Fabrica {
    public static void main(String[] args) {
        // Declaración de variables
        double monto, numCompu, totalSinDesc, descuento, total;
        String salida;

        // Entrada de valores
        numCompu = Double.parseDouble(JOptionPane.showInputDialog("Introducir el número de computadoras que se llevarán: "));
        monto = Double.parseDouble(JOptionPane.showInputDialog("Introducir el precio de la computadora: "));

        // Calculo del total sin descuento
        totalSinDesc = numCompu * monto;

        // Aplicación del descuento según la cantidad comprada
        if (numCompu < 5) {
            descuento = totalSinDesc * 0.10;
        } else if (numCompu < 10) {
            descuento = totalSinDesc * 0.20;
        } else {
            descuento = totalSinDesc * 0.40;
        }

        // Cálculo del total final
        total = totalSinDesc - descuento;

        // Proceso de salida
        salida = "El precio de cada computadora es: $" + monto +
                "\nNúmero de computadoras: " + numCompu +
                "\nTotal sin descuento: $" + totalSinDesc +
                "\nDescuento aplicado: $" + descuento +
                "\nPrecio final con descuento: $" + total;

        JOptionPane.showMessageDialog(null, salida);
    }
}
