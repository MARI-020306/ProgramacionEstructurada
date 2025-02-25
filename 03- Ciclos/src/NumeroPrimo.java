import javax.swing.*;

public class NumeroPrimo {
    public static void main(String[] args) {
        int numero=0, contador=0;
        numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        for (int i = 1; i <numero ; i++) {
            if (numero%2==0){
                contador++;
            }
        }
        if (contador==2){
            JOptionPane.showMessageDialog(null, numero + " es un numero primo");
        }else{
            JOptionPane.showMessageDialog(null, numero + " no es un numero primo");
        }
    }
}
