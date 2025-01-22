import javax.swing.*;

public class AreaCirculo {
    public static void main(String[] args) {
        double radio=0.0, area=0.0;
        final double PI= 3.1416;
        radio= Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor del radio:"));
        area= (PI* Math.pow( radio, 2));

        JOptionPane.showMessageDialog(null, "El area del circulo con radio " + radio + " es: " + area);

    }


}
