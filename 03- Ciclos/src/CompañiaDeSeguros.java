import javax.swing.*;

public class CompañiaDeSeguros {
    public static void main(String[] args) {
        // Declaración de constante
        final double COMISION = 0.10;

        // Declaración de variables
        int numTrabajadores;
        double sueldoBase, montoVentas, sueldoFinal, comision;
        double totalSueldos = 0.0, totalComisiones = 0.0;
        String salida = "";

        // Solicitud del número de empleados
        numTrabajadores = Integer.parseInt(JOptionPane.showInputDialog("Introducir el número de empleados: "));

        for (int i = 1; i <= numTrabajadores; i++) {
            // Solicitud de datos por cada empleado
            sueldoBase = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo base del empleado(a) " + i + ":"));
            montoVentas = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad obtenida de las 3 ventas del empleado(a) " + i + ":"));

            // Cálculo de comisiones y sueldo final
            comision = montoVentas * COMISION;
            sueldoFinal = sueldoBase + comision;


            totalSueldos += sueldoFinal;
            totalComisiones += comision;


            salida += "Empleado(a) " + i + ":\n"
                    + "Sueldo base: $" + String.format("%.2f", sueldoBase) + "\n"
                    + "Comisión: $" + String.format("%.2f", comision) + "\n"
                    + "Sueldo total: $" + String.format("%.2f", sueldoFinal) + "\n\n";
        }

        // Salida de resultados
        salida += "Número total de empleados: " + numTrabajadores + "\n"
                + "Comisiones totales: $" + String.format("%.2f", totalComisiones) + "\n"
                + "Monto total a pagar en sueldos: $" + String.format("%.2f", totalSueldos);

        JOptionPane.showMessageDialog(null, salida);
    }
}

