import javax.swing.*;

public class CalificacionesAcumulativas {
    public static void main(String[] args) {
        int numCalif=0;
        double calif=0.0;
        double promedio=0.0;
        //Solicitar el numero de calificaciones
        numCalif=Integer.parseInt(JOptionPane.showInputDialog("Introducel numero de calificaciones: "));
        for (int i = 1; i <=numCalif; i++) {
            //Solicitar calificacion
            calif=Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion " + i));
            //Acumular calificaciones
            promedio+=calif;
        }
        promedio/=numCalif;
        JOptionPane.showMessageDialog(null, "El promedio del alumno es: " + String.format("%.1f",promedio));
    }
}