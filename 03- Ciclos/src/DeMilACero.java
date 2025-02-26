import javax.swing.*;

public class DeMilACero {
    public static void main(String[] args) {
        //Declaracion de variables
        int x=0;
        String sucesion="";
        //Se inicializa a x en 1000 por que ese sera el numero del que se iniciara y se ira deceremntando en el ciclo
        x=1000;
        while (x>=0) { //Inica while
            sucesion += x + "\n"; //Cadena de texto que alamcena la sucesion de numeos para poder imprimirla
            x--; //Decremento de x
        } //Termina while

        //Salida de datos
        JOptionPane.showMessageDialog(null,  "Sucesion: \n"  + sucesion);
    }
}
