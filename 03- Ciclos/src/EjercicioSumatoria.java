import javax.swing.*;

public class EjercicioSumatoria {
    public static void main(String[] args) {
        int suma=0, numero=0;
        numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero; "));
        for (int i = 1; i <numero ; i++) {
            suma=suma + i;
        }
      JOptionPane.showMessageDialog(null, "La suma de los numeros anteriores a " + numero + " es: " + suma);
    }
}
