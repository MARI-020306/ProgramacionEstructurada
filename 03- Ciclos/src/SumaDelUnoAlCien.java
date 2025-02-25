import javax.swing.*;

public class SumaDelUnoAlCien {
    public static void main(String[] args) {
        int suma=0;
        String sucesion="";
        for (int i = 1; i <=100 ; i++) {
            sucesion+=i + ", ";
            suma=suma + i;
        }
        JOptionPane.showMessageDialog(null,  "Sucesion: \n"  + sucesion +"\nLa suma de la sucesion es: " + suma);
    }
}
