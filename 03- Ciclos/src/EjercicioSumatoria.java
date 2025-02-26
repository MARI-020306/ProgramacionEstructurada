import javax.swing.*;

public class EjercicioSumatoria {
    public static void main(String[] args) {

        //Declaracion de variables
        int suma=0, numero=0;
        //Entrada de datos
        numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero; "));

        for (int i = 1; i <numero ; i++) { //Inicia for
            suma=suma + i; //Se almacenan los valores en la suma para poder ralizar la suma de los datos ingresados
        }
        //Salida de datos
      JOptionPane.showMessageDialog(null, "La suma de los numeros anteriores a " + numero + " es: " + suma);
    }
}
