import javax.swing.*;

public class ObtenerValorDeY {
    public static void main(String[] args) {
        //Declaracion de variables
        double x= 0.0;
        double y= 0.0;
        String salida= "";

        // Solicitud de entrada de valores
        x= Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor que se asignara a x:"));

        // Calcular la expresion
        y= (3* Math.pow(x,2)) +  7 * x - 15;

        //Proceso de salida
        salida= "El resultado de la expresion es: " + y;
        JOptionPane.showMessageDialog(null, salida);
    }
}
