import javax.swing.*;

public class CalculadoraSencilla {
    public static void main(String[] args) {
        //Declaracion de variables
        String menu = "";
        double resultado = 0.0, numero1 = 0.0, numero2 = 0.0;
        String opcion = "";

        //Creacion de menu interactivo
        menu = "MENU PRINCIPAL\n" +
                "1) Sumar\n " +
                "2) Restar\n" +
                "3) Multiplicar\n" +
                "4) Dividir\n" +
                "5) Modulo\n" +
                "Elegir una opcion";

        opcion = (JOptionPane.showInputDialog(menu));

        //Entrada de datos
        numero1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el numero 1"));
        numero2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el numero 2"));

        //Condiciones a cumplir
        if (numero2>0.0) {
            switch (opcion) { //Incia switch y los casos que se mandaran llamar en el menu
                case "1":
                    //suma
                    resultado= numero1 + numero2;
                    JOptionPane.showMessageDialog(null, "La suma es: " + resultado);
                    break;
                case "2":
                    //resta
                    resultado= numero1 - numero2;
                    JOptionPane.showMessageDialog(null, "La resta es: " + resultado);
                    break;
                case "3":
                    //multiplicacion
                    resultado= numero1 * numero2;
                    JOptionPane.showMessageDialog(null, "La multiplicacion es: " + resultado);
                    break;
                case "4":
                    //division
                    resultado= numero1 / numero2;
                    JOptionPane.showMessageDialog(null, "La division es: " + resultado);
                    break;
                case "5":
                    //modulo
                    resultado= numero1 % numero2;
                    JOptionPane.showMessageDialog(null, "El modulo es: " + resultado);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Caso NO valido");

            }
        }else {
            //Salida de datos
            JOptionPane.showMessageDialog(null, "El numero 2 no puede ser 0 o negativo");
        }


    }
}
