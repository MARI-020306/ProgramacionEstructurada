import javax.swing.*;

public class ContinueAndBreak {
    public static void main(String[] args) {
        //Declaracion de variables
        int suma=0;
        int numero=0;
        int n=0;

        //Entrada de datos
        n=Integer.parseInt(JOptionPane.showInputDialog("Introduce el total de numeros a ingresar"));

        for (int i=1; i<=n; i++){ //Inicia for
            numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero" + i));

            //Condiciones a cumplir
            if (numero==0){
                continue;
            }
            if (numero<0){
                break;
            }
            suma+=numero; //Acumulacion de datos para sumarlos
        }
        //Salida de datos
        JOptionPane.showMessageDialog(null, "La suma del numero es: " + suma);
    }
}
