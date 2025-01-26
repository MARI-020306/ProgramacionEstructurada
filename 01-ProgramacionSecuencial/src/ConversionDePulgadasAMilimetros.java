import javax.swing.*;

public class ConversionDePulgadasAMilimetros {
    public static void main(String[] args) {
        // Declaracion de constante
        final double FACTOR_CONVERSION= 25.4;
        // Declaracion de variables de tres numeros dobles a convertir
        double numero1=0.0;
        double numero2= 0.0;
        double numero3= 0.0;
        double c1= 0.0;
        double c2= 0.0;
        double c3= 0.0;
        String salida= "";

        // Solicitar al usuario los 3 numeros a calcular.

        numero1= Double.parseDouble(JOptionPane.showInputDialog("Introduce el primer numero en pulgadas:"));
        numero2= Double.parseDouble(JOptionPane.showInputDialog("Introduce el segundo numero en pulgadas:"));
        numero3= Double.parseDouble(JOptionPane.showInputDialog("Introduce el tercer numero en pulgadas:"));

        // Proceso de conversion
        c1= numero1/FACTOR_CONVERSION;
        c2= numero2/FACTOR_CONVERSION;
        c3= numero3/FACTOR_CONVERSION;

        //Proceso de salida o resultado de las operaciones
        salida= numero1 + " en pulgadas" + " a milimetros es: " + String.format("%.2f", c1) +
                "\n" + numero2 + " en pulgadas" + " a milimetros es: " +  String.format("%.2f", c2) +
                "\n" + numero3 + " en pulgadas" + " a milimetros es: " +  String.format("%.2f", c3);
        JOptionPane.showMessageDialog( null, salida);
    }
}
