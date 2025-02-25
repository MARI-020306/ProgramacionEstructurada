import javax.swing.*;

public class SucesionDeCincoEnCinco {
    public static void main(String[] args) {
        int num=0,suma=0;
        int lim=0;
        String sucesion="";
        lim=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad d numeros que tendra la sucesion: "));

        suma=0;
        num=20;
        for (int i =0; i<=lim ; i++) {
            sucesion+=num + ", ";
            suma+=num;
            num+=5;
        }
        JOptionPane.showMessageDialog(null,  "Sucesion: " + sucesion + "\nLa suma de la sucesion es: " + suma);

    }
}
