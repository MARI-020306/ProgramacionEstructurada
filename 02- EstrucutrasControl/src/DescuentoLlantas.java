import javax.swing.*;

public class DescuentoLlantas {
    public static void main(String[] args) {
       //Declaracion de variables
       int numLlantas=0;
       double precio=0.0;
       double total=0.0;
       String salida="";

        // Entrada de valores
        numLlantas = Integer.parseInt(JOptionPane.showInputDialog("Introducir la cantidad de llantas : "));

        // Aplicación del descuento según la cantidad comprada
        if ( numLlantas < 5 ) {
            precio=300;
            total= numLlantas * precio;

        }else if (numLlantas>5 && numLlantas<10){
            precio=250;
            total=numLlantas * precio;

        }else if (numLlantas >10){
            precio=200;
            total=numLlantas * precio;
        }

        // Proceso de salida
        salida = "La cantidad de llantas adquiridas es: " + numLlantas +
                "\nEl precio a pagar de cada llanta es: $ " + precio +
                "\nEl total a pagar es: " + total;

        JOptionPane.showMessageDialog(null, salida);

    }
}
