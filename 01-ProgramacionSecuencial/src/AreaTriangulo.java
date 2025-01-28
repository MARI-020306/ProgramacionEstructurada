import javax.swing.*;

public class AreaTriangulo {
    public static void main(String[] args) {
        //Creacion de variables
        double base=0.0, altura=0.0;
        double area=0.0;

        //Introduccion de datos numericos
        base= Double.parseDouble(JOptionPane.showInputDialog("Introduce la medida de la base del triangulo:"));
        altura= Double.parseDouble(JOptionPane.showInputDialog("Introduce la medida de la altura del triangulo:"));

        //Proceso de resolucion
        area= (base * altura) / 2;


        //Mensaje de salida
        JOptionPane.showMessageDialog(null, "El area del triangulo con base " + base + " y altiura " + altura + " es: " + area);

    }
}
