import javax.swing.*;

public class Suma {
    public static void main(String[] args) {
        //Declaracion de variables
        int x=0,suma=0;
        //Inicializacion de variables
        x=100;
        do { //Inicia while
            suma=suma + x; //Calcular la suma
            x=x-2; //Se reduce en 2 unidades
        }while (x!=0); //Finalizar la entrada de datos hasta que la condicion se cumpla

        //Salida de datos
        JOptionPane.showMessageDialog(null, "La suma de los numero es: " + suma);
    }
}
