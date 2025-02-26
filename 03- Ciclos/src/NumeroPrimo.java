import javax.swing.*;

public class NumeroPrimo {
    public static void main(String[] args) {
        //Declaracion de variables
        int numero=0, contador=0;

        //Entrada de datos
        numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));

        for (int i = 1; i <numero ; i++) { //Inicia for
            if (numero%2==0){ //Calcular si el numero es primo realizando su division y usando su modulo
                contador++;
            }
        }
        //Condiciones a cumplir y salida de datos
        if (contador==2){
            JOptionPane.showMessageDialog(null, numero + " es un numero primo");
        }else{
            JOptionPane.showMessageDialog(null, numero + " no es un numero primo");
        }
    }
}
