import javax.swing.*;

public class Expresion {
    public static void main(String[] args) {
        //Declaracion de variables
        double x= 0.0;
        double y= 0.0;
        double resultado= 0.0;
        String salida= "";

        // Solicitud de entrada de valores
        x= Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de x:"));
        y= Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de y:"));

        // Calcular la expresion
        resultado= (x + y)/ (y-1);

        //Proceso de salida
        salida= "El resultado de la expresion es: " + String.format("%.3f", resultado);
        JOptionPane.showMessageDialog(null, salida);
    }
}
