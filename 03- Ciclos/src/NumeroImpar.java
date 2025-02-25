import javax.swing.*;

public class NumeroImpar {
    public static void main(String[] args) {
        int contador=1;
        String sucesion="";
        while (contador<=100){
            if (contador%2==1){
                sucesion+=contador + ", ";
            }
            contador++;
        }
        JOptionPane.showMessageDialog(null,sucesion);
    }
}
