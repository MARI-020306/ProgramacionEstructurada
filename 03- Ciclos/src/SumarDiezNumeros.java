import javax.swing.*;

public class SumarDiezNumeros {
    public static void main(String[] args) {
        double num=0.0,suma=0.0;
        for (int i = 1; i <=10 ; i++) {
            num=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero " + i));
            suma= suma + num;
        }
        JOptionPane.showMessageDialog(null, "La suma de los 10 numeros es: " + suma);
    }
}
