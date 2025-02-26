import javax.swing.*;

public class Empresa {
    public static void main(String[] args) {
        //Declaracion de variables
        int i=0;
        int numTrabajadores=0;
        int numHorasTrabajadas=0;
        int numHorasExtras=0;
        double salarioTotal=0.0;
        String salida="";

        //Entrada de datos
        numTrabajadores=Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de trabajadores:"));

        //Tabla de salida de datos
        salida="Reporte de salarios semanales\n" +
                "Empleado             " + "Horas Trabajadas             " + "Horas Extras            " + "Salario Total\n";
        i=1;
        while (i<=numTrabajadores){ //Inicia while
            numHorasTrabajadas=Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de horas trabajadas:"));
           numHorasExtras=0;
           //Condiciones a cumplir
            if (numHorasTrabajadas<=40){
                salarioTotal=numHorasTrabajadas * 20;
                salida+="Empleado " + i + "              " + numHorasTrabajadas + "               " + numHorasExtras + "               " + salarioTotal + "\n";
            }else{
                numHorasExtras=numHorasTrabajadas - 40;
                salarioTotal=40 * 20 + numHorasExtras * 25;
                salida+="Empleado " + i + "  " + numHorasTrabajadas + "  " + numHorasExtras + "  " + salarioTotal + "\n";
            }

            i++;
        } //Cierra while

        //Salida de datos
        JOptionPane.showMessageDialog(null, salida);
    }
}
