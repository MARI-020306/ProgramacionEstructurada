import javax.swing.*;

public class SumaDelUnoAlCien {
    public static void main(String[] args) {
        //Delcaracion de variables
        int suma=0;
        String sucesion="";

        for (int i = 1; i <=100 ; i++) { //Inicia for
            sucesion+=i + ", "; //Cadena de salida de texto
            suma=suma + i; //Calcular la suma con los valores ingresados
        }
        //Salida de datos
        JOptionPane.showMessageDialog(null,  "Sucesion: \n"  + sucesion +"\nLa suma de la sucesion es: " + suma);
    }
}
