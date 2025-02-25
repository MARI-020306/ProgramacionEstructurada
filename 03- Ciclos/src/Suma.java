import javax.swing.*;

public class Suma {
    public static void main(String[] args) {
        int x=0,suma=0;
        x=100;
        do {
            suma=suma + x;
            x=x-2;
        }while (x!=0);
        JOptionPane.showMessageDialog(null, "La suma de los numero es: " + suma);
    }
}
