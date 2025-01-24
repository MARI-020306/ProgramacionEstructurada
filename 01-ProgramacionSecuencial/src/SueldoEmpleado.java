/*Realizar un programa que calcule e imprima el sueldo de un empleado, bajo las
siguientes características
a. Se debe almacenar el nombre del empleado
b. Las horas trabajadas que deben ser horas sin parte fraccionaria
c. Cuota por hora
d. Se debe imprimir el nombre del Trabajador y el Sueldo que va a percibir
  */

import javax.swing.*;

public class SueldoEmpleado {
    public static void main(String[] args) {
        //Declaracion de variables
        double cuota= 0;
        int horasTrabajadas= 0;
        double sueldo= 0;
        String nombreEmpleado;
        String salida= "";

        //Solicitud de datos
        nombreEmpleado= JOptionPane.showInputDialog("Introducir nombre del empleado: ");
        cuota= Double.parseDouble(JOptionPane.showInputDialog("introduce la cuota por hora: "));
        horasTrabajadas=Integer.parseInt(JOptionPane.showInputDialog("introduce el numero de horas trabajadas: "));

        //Proceso de resolucion
        sueldo= (cuota)*(horasTrabajadas);

        //Proceso de salida de datos
        salida="El nombre del empreado es: " + nombreEmpleado +
                "\n con " + horasTrabajadas + " horas trabajadas" +
                "\n con una cuota de: $ " + cuota +
                "\n tiene un sueldo a percibir de: $ " + String.format("%.2f", sueldo) + " pesos";
        JOptionPane.showMessageDialog(null, salida);



    }
}
