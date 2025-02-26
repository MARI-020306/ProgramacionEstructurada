import javax.swing.*;

public class PromedioConWhile {
    public static void main(String[] args) {
        //Declaracion de variables
        int numCalif=0;
        double calif=0.0;
        double promedio=0.0;
        int i=0;
        //Solicitar el numero de calificaciones
        numCalif=Integer.parseInt(JOptionPane.showInputDialog("Introducel numero de calificaciones: "));
        i = 1;
        while (i <=numCalif){
            //Solicitar calificacion
            calif=Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion " + i));
            //Acumular calificaciones
            promedio+=calif;
            i++;
        }
        promedio/=numCalif; //Calcular promedio

        //Salida de datos
        JOptionPane.showMessageDialog(null, "El promedio del alumno es: " + promedio);
    }
}
