import javax.swing.*;

public class PromedioDeCuatroCalificaciones {
    public static void main(String[] args) {
        //Declaracion de variables
        double calif1 = 0.0;
        double calif2 = 0.0;
        double calif3 = 0.0;
        double calif4=0.0;
        double promedio=0.0;
        int matricula= 0;
        String nombreAlumno= "";
        String salida= "";

        // Solicitud de entrada de valores a promediar y nombre del alumno
        nombreAlumno= JOptionPane.showInputDialog("Introducir nombre de la/el alumno: ");
        matricula= Integer.parseInt(JOptionPane.showInputDialog( "Introduce la matricula del alumno(a): "));
        calif1= Double.parseDouble(JOptionPane.showInputDialog("Introduce la primera calificacion:"));
        calif2= Double.parseDouble(JOptionPane.showInputDialog("Introduce la segunda calificacion:"));
        calif3= Double.parseDouble(JOptionPane.showInputDialog("Introduce la tercera calificacion:"));
        calif4= Double.parseDouble(JOptionPane.showInputDialog("Introduce la cuarta calificacion:"));

        //Calcular el promedio de los numeros ingresados
        promedio= (calif1 + calif2 + calif3 + calif4)/ 4;

        //Proceso de salida de datos
        salida= "El promedio del alumno(a): " + nombreAlumno +  "\n "  + "Con matricula: " + matricula + "\n " + "con las siguientes calificaciones: " +
                "\n " + calif1 + "\n  " + calif2 + "\n " + calif3 + "\n " + calif4 + "\n " + " es: " +  promedio;
        JOptionPane.showMessageDialog(null, salida);
    }
}
