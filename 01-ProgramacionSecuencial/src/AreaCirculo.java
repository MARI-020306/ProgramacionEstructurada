import javax.swing.*;

public class AreaCirculo {
    public static void main(String[] args) {
        //Declaracion de variavles
        double radio=0.0, area=0.0;
        //Declaracion constante
        final double PI= 3.1416;

        //Entrada de datos
        radio= Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor del radio:"));
        //Resolucion de operaciones
        area= (PI* Math.pow( radio, 2));

        //Salida de datos
        JOptionPane.showMessageDialog(null, "El area del circulo con radio " + radio + " es: " + area);

    }


}
