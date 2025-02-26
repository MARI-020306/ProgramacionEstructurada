import javax.swing.*;

public class SucesionDeCincoEnCinco {
    public static void main(String[] args) {
        //Declaracion de variables
        int num=0,suma=0;
        int lim=0;
        String sucesion="";

        //Ingresar datos
        lim=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad d numeros que tendra la sucesion: "));

        //Inicializar variables
        suma=0;
        num=20;
        for (int i =0; i<=lim ; i++) { //Inicia for
            sucesion+=num + ", "; //Cadena de salida de texto
            suma+=num; //Crear la sucesion
            num+=5; //Incrementar de 5 en 5
        }
        //Salida de datos
        JOptionPane.showMessageDialog(null,  "Sucesion: " + sucesion + "\nLa suma de la sucesion es: " + suma);

    }
}
