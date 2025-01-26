import javax.swing.*;

public class PerimetroYAreaDeCirculo {
    public static void main(String[] args) {

        // Declaracion de variables
        double radio=0.0;
        double area=0.0;
        double perimetro=0.0;
        double conversion=0.0;

        // Declaracion de constante
        final double PI= 3.1416;
        final double FACTOR_CONVERSION= 2.54;

        // Resolucion
        radio= Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor del radio en centimetros:"));

        //Proceso de conversion
        conversion = radio / FACTOR_CONVERSION;
        area= (PI* Math.pow( conversion, 2));
        perimetro= (2 * PI) * (conversion);


        JOptionPane.showMessageDialog(null, "El area del circulo con radio " + radio + " es: " + String.format("%.3f",area) +
                "\nEl perimetro del circulo con radio " + radio + " es: " + String.format("%.3f",perimetro));

    }
}
