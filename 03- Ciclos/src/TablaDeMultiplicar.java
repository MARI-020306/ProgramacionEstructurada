import javax.swing.*;

public class TablaDeMultiplicar {
    public static void main(String[] args) {
        int numero=0;
        int operacion=0;
        int resultado=0;

        //Solicitar el numero a multiplicar
        numero=Integer.parseInt(JOptionPane.showInputDialog("Introducel numero del que deseas conocer la tabla de multiplicar: "));
        for (int i = 1; i <=10 ; i++) {
            operacion= numero * i;
            JOptionPane.showMessageDialog(null, numero + " x " + i + " = " + operacion);
        }


    }
}
