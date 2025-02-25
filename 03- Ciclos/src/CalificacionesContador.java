import javax.swing.*;

public class CalificacionesContador {
    public static void main(String[] args) {

        //Declaracion variables

        int numAprobados=0;
        int numReprobados=0;
        int numDeCalif=0;
        double calif=0.0;

        numDeCalif= Integer.parseInt(JOptionPane.showInputDialog("Cuantas calificaciones se van a evaluar: "));

        for (int i = 1; i <=numDeCalif ; i++) {

            calif=Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion " + i));

            if (calif>=7.0){
                //Contador de numero de Aprobados
                numAprobados++;
            }else{
                numReprobados++;
            }

        } //Cierra for
        JOptionPane.showMessageDialog(null, "El numero de aprobados: " + numAprobados + "\nEl numero de reprobados es: " + numReprobados);

        int i=1;
        numAprobados=0;
        numReprobados=0;

        while (i<=numDeCalif){
            calif=Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion " + i));
            if (calif>=7.0){
                numAprobados++;
            }else {
                numReprobados++;
            }
            i++;
        }
        JOptionPane.showMessageDialog(null, "El numero de aprobados: " + numAprobados + "\nEl numero de reprobados es: " + numReprobados);
        i=0;
        numReprobados=0;
        numAprobados=0;
        do {
            calif=Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion " + i));
            if (calif>=7.0){
                numAprobados++;
            }else {
                numReprobados++;
            }

            i++;

        }while(i<=numDeCalif);
        JOptionPane.showMessageDialog(null, "El numero de aprobados: " + numAprobados + "\nEl numero de reprobados es: " + numReprobados);
    }
}
