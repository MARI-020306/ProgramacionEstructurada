import javax.swing.*;

/*
        Evaluar si un valor o un numero es mayor a 10 utilizando el operador ternario (?)

        (expresion)? parte true: parte false
         */
    public class NumeroMayor {
    public static void main(String[] args) {

        //Declaracion de variables

        double numero=0.0;
        String salida="";

        //Entrada de datos

        numero= Double.parseDouble(JOptionPane.showInputDialog("Introduce un numero"));

        //Uso de operador ternario
       salida= (numero>10)?"El numero es mayor a 10": "El numero es menor a 10";
       JOptionPane.showMessageDialog(null, salida);

       //Condiciones a cumplir
       if (numero>10){
           salida= "El numero es mayor a 10";
       }else{
           salida= "El numero es menor a 10";
       }

    }
}
