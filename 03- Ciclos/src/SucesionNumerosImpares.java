import javax.swing.*;

public class SucesionNumerosImpares {
    public static void main(String[] args) {
        //Declaracion de variables
        int num=0,suma=0;
        int lim=0;
        String sucesion="";

        //Entrada de datos
        lim=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad d numeros que tendra la sucesion: "));

        //Inicializar variable
        suma=0;
        for (int i =1; i<=lim ; i++) { //Inicia for
             int cuadrado= i*i; //Elevar al cuadrado el numero alamcenado en i en cada vuelta
            sucesion+=cuadrado + ", "; //Cadena de salida de texto para mostrar la sucesion
            suma+=cuadrado; //Sumar los valores

        }
        //Salida de datos
        JOptionPane.showMessageDialog(null,  "Sucesion: " + sucesion + "\nLa suma de la sucesion es: " + suma);
    }
}
