import javax.swing.*;

public class ExpendioNaranjas {
    public static void main(String[] args) {
        //Declaracion de variables
        int kilos=0;
        double precio=0.0,total=0.0,totalFinal=0.0, descuento=0.0;

        //Entrada de datos
       precio= Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio del kilo de naranja: "));
        for (int i = 1; i <=15 ; i++) { //Inicia for

            //Inicializacion de variables
            total=0.0;
            descuento=0.0;
            kilos = Integer.parseInt(JOptionPane.showInputDialog("Ingresa los kilos de naranja: "));

            //Condiciones a cumplir
            if (kilos > 10) {
                total = precio * kilos;
                descuento = total * .15;
            } else {
                total = precio * kilos;
            }
            //Cadena de texto y resolucion de operaciones

            JOptionPane.showMessageDialog(null, "La persona " + i + " debe pagar $" + (total-descuento) +
                    "\nSe aplico un descuento de $" + descuento);
            totalFinal=totalFinal + (total-descuento);

        }
        //Salida de datos
        JOptionPane.showMessageDialog(null, "Los ingresos de la tienda son $" + totalFinal);
    }
}
