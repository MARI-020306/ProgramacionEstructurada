import javax.swing.*;

public class CalificacionesSentinel2 {
    public static void main(String[] args) {
        //Declaracion de variables
        boolean sentinel= true;
        double calif= 0.0;
        int numAprobados=0;
        int numReprobados=0;

        //Indicacion de inicio para poder finalizar el programa el usuario introduce una calificacion con -1
        JOptionPane.showMessageDialog(null, "Este programa cuenta el numero de calificaciones" + " aprobatorias y reprobatorias" + "\nPara terminar introduce una calificacion con -1");
        int x=1;
        while (sentinel){ //Inicia while
            calif= Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion " + x));

            //Condiciones a cumplir para que el programa funcione correctamente
            if (calif!=-1) {
                if (calif >= 7.0) {
                    numAprobados++;
                } else {
                    numReprobados++;
                }
                x++;
            }else{
                sentinel=false; //Si la condicion no se cumple, finaliza el programa
            }
        }//Finaliza while

        //Salida de resultados
        JOptionPane.showMessageDialog(null, "El numero de aprobados: " + numAprobados + "\nEl numero de reprobados es: " + numReprobados);
    }
}
