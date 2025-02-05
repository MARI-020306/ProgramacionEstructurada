import javax.swing.*;

public class SueldoVendedorMasComision {
    public static void main(String[] args) {
        //Declaracion de constante
        final double COMISION= 0.10;
        //Declaracion de variables
        double sueldo= 0;
        double sueldoFinal= 0.0;
        double comision=0.0;
        double totalComisiones= 0.0;
        String nombreEmpleado;
        String salida= "";

        //Solicitud de datos
        nombreEmpleado= JOptionPane.showInputDialog("Introducir nombre del empleado(a): ");
        comision= Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad obtenida de las 3 ventas: "));
        sueldo= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo base del empleado(a): "));

        //Proceso de resolucion
        totalComisiones= comision * COMISION;
        sueldoFinal= sueldo + totalComisiones;

        //Proceso de salida de datos
        salida="El nombre del empreado es: " + nombreEmpleado +
                "\n con un total de $" + String.format("%.2f", totalComisiones) + " pesos de comision, por sus 3 ventas del mes" +
                "\n y su sueldo total es de: $ " + String.format("%.2f", sueldoFinal) + " pesos";
        JOptionPane.showMessageDialog(null, salida);
    }
}
