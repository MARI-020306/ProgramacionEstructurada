import javax.swing.*;

/*
Escribir un programa que convierta 3 numeros de kilogramos a libras (1 lb= 0.454)
 */
public class ConversionLibras {
    public static void main(String[] args) {
        // Declaracion de constante
        final double FACTOR_CONVERSION= 0.454;
        // Declaracion de variables de tres numeros dobles a convertir
       double numero1=0.0;
       double numero2= 0.0;
       double numero3= 0.0;
       double c1= 0.0;
       double c2= 0.0;
       double c3= 0.0;
       String salida= "";

       // Solicitar al usuario los 3 numeros a calcular.

        numero1= Double.parseDouble(JOptionPane.showInputDialog("Introduce el primer peso en kg:"));
        numero2= Double.parseDouble(JOptionPane.showInputDialog("Introduce el segundo peso en kg:"));
        numero3= Double.parseDouble(JOptionPane.showInputDialog("Introduce el tercer peso en kg:"));

       // Proceso de conversion
        c1= numero1/FACTOR_CONVERSION;
        c2= numero2/FACTOR_CONVERSION;
        c3= numero3/FACTOR_CONVERSION;

        //Proceso de salida o resultado de las operaciones
        salida= numero1 + " kg" + " en Libras es: " + String.format("%.2f", c1) +
        "\n" + numero2 + " kg" + " en Libras es: " +  String.format("%.2f", c2) +
        "\n" + numero3 + " kg" + " en Libras es: " +  String.format("%.2f", c3);
        JOptionPane.showMessageDialog( null, salida);
    }
}
