import javax.swing.*;

public class FactorialDeUnNumero {
    public static void main(String[] args) {
        int factorial=0,x=0,numero=0;
        String fact="";
        numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        if (numero<0){
            JOptionPane.showMessageDialog(null, "El numero no se puede calcular");
        }else{
            x=1;
            factorial=1;
            while (x<=numero){
               fact+=x + " x " + " ";
                factorial=factorial*x;
                x++;
            }
            JOptionPane.showMessageDialog(null, fact + "\nEl factorial del numero " + numero +
                    " = " + factorial);
        }
    }
}
