import javax.swing.*;

public class ConversionLibras2 {
    public static void main(String[] args) {
        // Declaracion de constante
        final double FACTOR_CONVERSION= 0.454;
        // Declaracion de variables de tres numeros dobles a convertir
        double numero1=0.0;
        double numero2= 0.0;
        double numero3= 0.0;
        String salida= "";

        // Solicitar al usuario los 3 numeros a calcular.

        numero1= Double.parseDouble(JOptionPane.showInputDialog("Introduce el primer peso en kg:"));
        numero2= Double.parseDouble(JOptionPane.showInputDialog("Introduce el segundo peso en kg:"));
        numero3= Double.parseDouble(JOptionPane.showInputDialog("Introduce el tercer peso en kg:"));


        //Proceso de salida o resultado de las operaciones
        salida= numero1 + " kg" + " en Libras es: " +
                String.format("%.2f", numero1/FACTOR_CONVERSION) +
                "\n" + numero2 + " kg" + " en Libras es: " +
                String.format("%.2f", numero2/FACTOR_CONVERSION) +
                "\n" + numero3 + " kg" + " en Libras es: " +
                String.format("%.2f", numero3/FACTOR_CONVERSION);
        JOptionPane.showMessageDialog( null, salida);
    }
}
