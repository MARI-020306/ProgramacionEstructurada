import javax.swing.*;

public class SumarDiezNumeros {
    public static void main(String[] args) {
        //Declaracion de variables
        double num=0.0,suma=0.0;

        for (int i = 1; i <=10 ; i++) { //Inicia for
            //Entrada de datos
            num=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero " + i));
            suma= suma + num; //Proceso de la suma de los 10 numeros
        }
        //Salida de datos
        JOptionPane.showMessageDialog(null, "La suma de los 10 numeros es: " + suma);
    }
}
