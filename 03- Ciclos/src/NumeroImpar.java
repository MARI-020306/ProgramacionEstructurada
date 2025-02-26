import javax.swing.*;

public class NumeroImpar {
    public static void main(String[] args) {
        //Declaracion de variables
        int contador=1;
        String sucesion="";

        while (contador<=100){ //Inicia while
            if (contador%2==1){ //Calcular si el numero es impar realizando su division y usando su modulo
                sucesion+=contador + ", "; //Cadena de texto que muestra la sucesion
            }
            contador++;
        } //Cierra while

        //Salida de datos
        JOptionPane.showMessageDialog(null,sucesion);
    }
}
