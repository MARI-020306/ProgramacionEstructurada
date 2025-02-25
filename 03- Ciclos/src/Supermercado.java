import javax.swing.*;

public class Supermercado {
    public static void main(String[] args) {
        int cantidad=0;
        double total=0.0,precio=0.0;
        String respuesta="";
        do {
            cantidad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de articulos a pagar: "));
            precio=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del articulo: "));
            total=total + (cantidad*precio);
            respuesta=JOptionPane.showInputDialog("¿Desea finalizar la compra? ");
        }while (!respuesta.equalsIgnoreCase("si"));
        JOptionPane.showMessageDialog(null, "El total a pagar por la compra es $" + total);
    }

}
