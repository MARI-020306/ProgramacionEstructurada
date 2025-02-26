import javax.swing.*;

public class CalificacionesContador {
    public static void main(String[] args) {

        //Declaracion variables

        int numAprobados=0;
        int numReprobados=0;
        int numDeCalif=0;
        double calif=0.0;

        //Solicitud de datos
        numDeCalif= Integer.parseInt(JOptionPane.showInputDialog("Cuantas calificaciones se van a evaluar: "));

        //Inicia ciclo for
        for (int i = 1; i <=numDeCalif ; i++) {

            calif=Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion " + i));

            //Condiciones para los datos ingresados
            if (calif>=7.0){
                //Contador de numero de Aprobados
                numAprobados++;
            }else{
                numReprobados++;
                //Contador de numero de Reprobados
            }

        } //Cierra for

        //Salida de resultados
        JOptionPane.showMessageDialog(null, "El numero de aprobados: " + numAprobados + "\nEl numero de reprobados es: " + numReprobados);

        //Inicializacion de variables para nuevo ciclo
        int i=1;
        numAprobados=0;
        numReprobados=0;

        //Inicia ciclo while
        while (i<=numDeCalif){

            calif=Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion " + i));

            //Condiciones para los datos ingresados
            if (calif>=7.0){
                numAprobados++;
                //Contador de numero de Aprobados

            }else {
                numReprobados++;
                //Contador de numero de Reprobados
            }
            i++;
        }//Cierra while

        //Salida de resultados
        JOptionPane.showMessageDialog(null, "El numero de aprobados: " + numAprobados + "\nEl numero de reprobados es: " + numReprobados);

        //Inicializacion de variables para nuevo ciclo
        i=0;
        numReprobados=0;
        numAprobados=0;

        //Inicia ciclo do while
        do {
            calif=Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion " + i));
            if (calif>=7.0){
                numAprobados++;
                //Contador de numero de Aprobados

            }else {
                numReprobados++;
                //Contador de numero de Reprobados
            }

            i++;

        }while(i<=numDeCalif); //Cierra do while

        //Salida de resultados
        JOptionPane.showMessageDialog(null, "El numero de aprobados: " + numAprobados + "\nEl numero de reprobados es: " + numReprobados);
    }
}
