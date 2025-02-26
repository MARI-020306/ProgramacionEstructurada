import javax.swing.*;

public class Supermercado {
    public static void main(String[] args) {
        //Declaracion de variables
        int cantidad=0;
        double total=0.0,precio=0.0;
        String respuesta="";

        do { //Incia do while

            //Entrada de datos
            cantidad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de articulos a pagar: "));
            precio=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del articulo: "));
            total=total + (cantidad*precio);

            //Preguntar al usuario si desea continuar
            respuesta=JOptionPane.showInputDialog("¿Desea finalizar la compra? ");
        }while (!respuesta.equalsIgnoreCase("si")); //Repetir hasta que la condicion de paro se cumpla

        //Salida de datos
        JOptionPane.showMessageDialog(null, "El total a pagar por la compra es $" + total);
    }

}
