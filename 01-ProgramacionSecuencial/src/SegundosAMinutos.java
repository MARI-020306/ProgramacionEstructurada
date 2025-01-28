import javax.swing.*;

public class SegundosAMinutos {
    public static void main(String[] args) {

        // Declaracion de variables
        double segundo= 0.0;
        double minutos= 0.0;
        String salida= "";

        // Solicitar al usuario el numero a calcular.

        segundo=Double.parseDouble(JOptionPane.showInputDialog("Introduce el numero a convertir:"));

        // Proceso de conversion
        minutos= (segundo * 1) / 60;

        //Proceso de salida o resultado de las operaciones
        salida= segundo + " segundos" + " es igual a: " + String.format("%.4f",minutos) + " minutos.";
        JOptionPane.showMessageDialog( null, salida);
    }
}
