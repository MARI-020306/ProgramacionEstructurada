import javax.swing.*;

public class ConversionTemperatura {
    public static void main(String[] args) {
        // Declaracion de variables
        double gradoCentigrado= 0.0;
        double gradoFarenheit = 0.0;
        String salida= "";

        // Solicitar al usuario el numero a calcular.

        gradoCentigrado=Double.parseDouble(JOptionPane.showInputDialog("Introduce los grados centigrados:"));

        // Proceso de conversion
        gradoFarenheit = (9.0/5.0) * gradoCentigrado + 32;

        //Proceso de salida o resultado de las operaciones
        salida= gradoCentigrado + " grados centigrados" + " es igual a: " + String.format("%.2f", gradoFarenheit) + " grados farenheit.";
        JOptionPane.showMessageDialog( null, salida);
    }
}
