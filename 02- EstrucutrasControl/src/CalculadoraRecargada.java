import javax.swing.*;

public class CalculadoraRecargada {
    public static void main(String[] args) {
        //Declaracion de variables
        String menu="";
        double numero1=0.0, numero2=0.0;
        String opcion= "", resultado="";

        //Creacion de menu interactivo
        menu= "MENU PRINCIPAL\n" +
                "a) Sumar\n " +
                "b) Restar\n" +
                "c) Multiplicar\n" +
                "d) Dividir\n" +
                "e) Modulo\n" +
                "Elegir una opcion";

        opcion= (JOptionPane.showInputDialog(menu));

        //Entrada de datos
        numero1= Double.parseDouble(JOptionPane.showInputDialog("Introduce el numero 1"));
        numero2= Double.parseDouble(JOptionPane.showInputDialog("Introduce el numero 2"));
        opcion=opcion.toLowerCase();

        //Condiciones a cumplir
        if (numero2>0.0) {
            switch (opcion) {//Incia switch y los casos que se mandaran llamar en el menu
                case "a":
                case "A":
                    //suma
                    resultado="La suma es: " + (numero1 + numero2);
                    break;
                case "b":
                case "B":
                    //resta
                    resultado="La resta es: " + (numero1 - numero2);
                case "c":
                case "C":
                    //multiplicacion
                    resultado="La multiplicacion es: " + (numero1 * numero2);
                    break;
                case "d":
                case "D":
                    //division
                    resultado="La division es: " + (numero1 / numero2);
                    break;
                case "e":
                case "E":
                    //modulo
                    resultado="El modulo es: " + (numero1 % numero2);
                    break;
                default:
                    resultado= "Caso NO valido";

            }//cierra switch

            //Salida de datos
            JOptionPane.showMessageDialog(null, resultado);

        }else { //Validar solo datos positivos
            JOptionPane.showMessageDialog(null, "El numero 2 no puede ser 0 o negativo");
        }

    }
}
