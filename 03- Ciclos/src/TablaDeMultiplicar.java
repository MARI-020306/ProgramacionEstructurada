import javax.swing.*;

public class TablaDeMultiplicar {
    public static void main(String[] args) {
        //Declaracion de variables
        int numero=0;
        int operacion=0;
        int resultado=0;

        //Solicitar el numero a multiplicar
        numero=Integer.parseInt(JOptionPane.showInputDialog("Introducel numero del que deseas conocer la tabla de multiplicar: "));
        for (int i = 1; i <=10 ; i++) { //Inica for
            operacion= numero * i; //Creacion de la tabla

            //Salida de datos
            JOptionPane.showMessageDialog(null, numero + " x " + i + " = " + operacion);
        }


    }
}
