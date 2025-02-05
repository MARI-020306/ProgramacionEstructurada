import javax.swing.*;

public class ConversionDePiesAYardasPulgadasCentimetrosYMetros {
    public static void main(String[] args) {
        // Declaracion de variables a convertir
        double numero1=0.0;
        double respuestaYarda= 0.0;
        double respuestaPulgada=0.0;
        double respuestaCentimetro=0.0;
        double respuestaMetros=0.0;
        String salida= "";

        // Solicitar al usuario el numeros a calcular.

        numero1= Double.parseDouble(JOptionPane.showInputDialog("Introduce el numero que desea convertir en pies:"));

        // Proceso de conversion
        respuestaYarda= numero1/ 3.0;
        respuestaPulgada= numero1 * 12.0;
        respuestaCentimetro=(respuestaPulgada * 2.54);
        respuestaMetros=(respuestaPulgada * 2.54) /100.0 ;

        //Proceso de salida o resultado de las operaciones
        salida= numero1+ ": " +
                "\n" + " en" + " Yardas es: " + String.format("%.2f", respuestaYarda) +
                "\n" + " en" + " Pulgadas es: " +  String.format("%.2f", respuestaPulgada) +
                "\n" + " en" + " Centimetros es: " +  String.format("%.2f", respuestaCentimetro) +
                "\n" + " en" + " Metros es: " +  String.format("%.2f", respuestaMetros);
        JOptionPane.showMessageDialog( null, salida);
    }
}
