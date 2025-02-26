import javax.swing.*;

public class CalificacionMediaYBaja {
    public static void main(String[] args) {
        //Declaracion de variables
        double n=0.0,suma=0.0,califBaja=0.0;
        int calif;
        //Solicitar el numero de calificaciones
        calif=Integer.parseInt(JOptionPane.showInputDialog("Introducel numero de calificaciones: "));
        for (int i = 1; i <=calif ; i++) {
            //Solicitar calificacion
            n=Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion " + i));

            if (i==1){ //Guarda el primer valor de n y compara
                califBaja=n;
            } else if (n<califBaja) { //si es menor que el primer valor en la primera vuelta lo actualiza
                califBaja=n;
            }
            suma=suma + n;
        }//Cierra for

        //Salida de resultados
        JOptionPane.showMessageDialog(null, "La calificacion media es: " + String.format("%.2f",suma/calif) +
                "\nLa calificacion mas baja es: " + String.format("%.2f",califBaja));
    }
}
