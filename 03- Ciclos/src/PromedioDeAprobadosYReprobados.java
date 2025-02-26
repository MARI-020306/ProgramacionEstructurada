import javax.swing.*;

public class PromedioDeAprobadosYReprobados {
    public static void main(String[] args) {
        //Declaracion de variables
        boolean sentinel= true;
        double calif= 0.0;
        int numAprobados=0;
        int numReprobados=0;
        double promedioA=0.0, promR=0.0;

        //Entrada de datos
        JOptionPane.showMessageDialog(null, "Este programa cuenta el numero de calificaciones" + " aprobatorias y reprobatorias" + "\nPara terminar introduce una calificacion con -1");
        int x=1;
        while (sentinel){ //Inica while
            calif= Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion " + x));

            //Condiciones a cumplir
            if (calif!=-1) {
                if (calif >= 7.0) { //Evaluar aprobados
                    numAprobados++;
                    promedioA=(numAprobados/calif) * 100; //Calcular el promedio de aprobados

                } else { //Evaluar reprobados
                    numReprobados++;
                    promR=(numReprobados/calif) * 100; //Calcular el promedio de aprobados
                }
            }else{ //Terminar programa usando -1
                sentinel=false;
            }
            x++;
        }
        //Salida de datos
        JOptionPane.showMessageDialog(null, "El porcentaje de aprobados: " + promedioA + " %" + "\nEl porcentaje de reprobados es: " + promR + " %");
    }
}
