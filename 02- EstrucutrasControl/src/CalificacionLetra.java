import javax.swing.*;

public class CalificacionLetra {
    public static void main(String[] args) {
        //Declaracion de variables

        double calif=0.0;
        char letra=' ';
        String salida= "";

        //Entrada de valores
        calif= Double.parseDouble(JOptionPane.showInputDialog("Introducir la calificacion: "));

        //Proceso de condicionales
        if (calif>=0.0 && calif<=10.0) {
            if (calif >= 9.0) {
                letra = 'A';
            } else if (calif >= 8.0) {
                letra = 'B';
            } else if (calif >= 7.0) {
                letra = 'C';
            } else if (calif >= 6.0) {
                letra = 'D';
            } else {
                letra = 'F';
            }

             //Proceso de salida
            salida = "Tu calificacion " + calif + " corresponde a una letra: " + letra;

        } else{
                salida = "Calificacion NO valida";
        }
        //Salida de datos
        JOptionPane.showMessageDialog(null,salida);
    }//Cierra el main
}
