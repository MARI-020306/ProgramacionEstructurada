import javax.swing.*;

public class NumeroMayor {
    public static void main(String[] args) {
        //Declaracion de variables
        int numero=0,total=0,numMayor=0;
        int i=0;
        //Solicitar la cantidad de numeros
        total=Integer.parseInt(JOptionPane.showInputDialog("Introducel numero de calificaciones: "));
       i=1;
        while ( i <=total) {
            //Solicitar calificacion
            numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce la calificacion " + i));

            if (i == 1) { //Guarda el primer valor de n y compara
                numMayor = numero;
            } else if (numero > numMayor) {
                numMayor = numero;
            }
            i++;
        }
        //Salida de datos
        JOptionPane.showMessageDialog(null, "El numero mayor es: " + numMayor);
    }
}
