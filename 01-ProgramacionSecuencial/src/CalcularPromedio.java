import javax.swing.*;

public class CalcularPromedio {
    public static void main(String[] args) {
//Declaracion de variables
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4=0;
        int resultado=0;
        String salida= "";

        // Solicitud de entrada de valores a promediar
        num1= Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor del primer numero:"));
        num2= Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor del segundo numero:"));
        num3= Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor del tercer numero:"));
        num4= Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor del cuarto numero:"));

        //Calcular el promedio de los numeros ingresados
        resultado= (num1 + num2 + num3 + num4)/ 4;

        //Proceso de salida de datos
        salida= "El promedio de los numeros " + num1 + ", " + num2 + ", " + num3 + ", " + num4 + " es: " +  resultado;
        JOptionPane.showMessageDialog(null, salida);

    }
}
