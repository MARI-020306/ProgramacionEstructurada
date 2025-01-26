import javax.swing.*;

public class NumerosAlCuadarado {
    public static void main(String[] args) {
        //Declaracion de variables
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4=0;
        int num5=0;
        int num6=0;
        int num7=0;
        int num8=0;
        int num9=0;
        int resultado=0;
        int resultado1 =0;
        int resultado2=0;
        int resultado3=0;
        int resultado4=0;
        int resultado5=0;
        int resultado6=0;
        int resultado7=0;
        int resultado8=0;
        int resultado9=0;
        String salida= "";

        // Solicitud de entrada de valores para calcuñar su cuadrado
        num1= Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor del primer numero:"));
        num2= Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor del segundo numero:"));
        num3= Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor del tercer numero:"));
        num4= Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor del cuarto numero:"));
        num5= Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor del quinto numero:"));
        num6= Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor del sexto numero:"));
        num7= Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor del septimo numero:"));
        num8= Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor del octavo numero:"));
        num9= Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor del noveno numero:"));

        // Calcular los numeros al cuadrado
        resultado1 = (num1) * (num1);
        resultado2 = (num2) * (num2);
        resultado3 = (num3) * (num3);
        resultado4 = (num4) * (num4);
        resultado5 = (num5) * (num5);
        resultado6 = (num6) * (num6);
        resultado7 = (num7) * (num7);
        resultado8 = (num8) * (num8);
        resultado9 = (num9) * (num9);

        //Proceso de salida de datos
        salida= "El resultado del numero " + num1 + " al cuadrado es: " +  resultado1 +
                "\nEl resultado del numero " + num2 + " al cuadrado es: " + resultado2 +
                "\nEl resultado del numero " + num3 + " al cuadrado es: " + resultado3 +
                "\nEl resultado del numero " + num4 + " al cuadrado es: " + resultado4 +
                "\nEl resultado del numero " + num5 + " al cuadrado es: " + resultado5 +
                "\nEl resultado del numero " + num6 + " al cuadrado es: " + resultado6 +
                "\nEl resultado del numero " + num7+  " al cuadrado es: " + resultado7 +
                "\nEl resultado del numero " + num8 + " al cuadrado es: " + resultado8 +
                "\nEl resultado del numero " + num9 + " al cuadrado es: " +  resultado9;

        JOptionPane.showMessageDialog(null, salida);

    }
}
