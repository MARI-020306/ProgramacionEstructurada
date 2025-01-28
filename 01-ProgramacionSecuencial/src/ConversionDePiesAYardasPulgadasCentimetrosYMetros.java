import javax.swing.*;

public class ConversionDePiesAYardasPulgadasCentimetrosYMetros {
    public static void main(String[] args) {
        // Declaracion de constantes
        final double FACTOR_CONVERSION_YARDA= 0.333;
        final double FACTOR_CONVERSION_PULGADA= 12.0;
        final double FACTOR_CONVERSION_CENTIMETROS= 30.48;
        final double FACTOR_CONVERSION_METROS=0.3048;
        // Declaracion de variable a convertir
        double numero1=0.0;
        double respuestaYarda= 0.0;
        double respuestaPulgada=0.0;
        double respuestaCentimetro=0.0;
        double respuestaMetros=0.0;
        String salida= "";

        // Solicitar al usuario el numeros a calcular.

        numero1= Double.parseDouble(JOptionPane.showInputDialog("Introduce el numero que desea convertir en pies:"));

        // Proceso de conversion
        respuestaYarda= numero1 * FACTOR_CONVERSION_YARDA;
        respuestaPulgada= numero1 * FACTOR_CONVERSION_PULGADA;
        respuestaCentimetro=numero1 * FACTOR_CONVERSION_CENTIMETROS;
        respuestaMetros=numero1 * FACTOR_CONVERSION_METROS;

        //Proceso de salida o resultado de las operaciones
        salida= numero1+ ": " +
                "\n" + " en" + " Yardas es: " + String.format("%.2f", respuestaYarda) +
                "\n" + " en" + " Pulgadas es: " +  String.format("%.2f", respuestaPulgada) +
                "\n" + " en" + " Centimetros es: " +  String.format("%.2f", respuestaCentimetro) +
                "\n" + " en" + " Metros es: " +  String.format("%.2f", respuestaMetros);
        JOptionPane.showMessageDialog( null, salida);
    }
}
