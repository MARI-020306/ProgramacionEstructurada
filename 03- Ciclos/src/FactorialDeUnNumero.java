import javax.swing.*;

public class FactorialDeUnNumero {
    public static void main(String[] args) {
        //Declaracion de variables
        int factorial=0,x=0,numero=0;
        String fact="";

        //Entrada de datos
        numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));

        //Condiciones a cumplir
        if (numero<0){
            JOptionPane.showMessageDialog(null, "El numero no se puede calcular");
        }else{
            x=1;
            factorial=1;
            while (x<=numero){
               fact+=x + " x " + " "; //Cadena de salida de texto
                factorial=factorial*x; //Calculo de factorial
                x++;
            }
            //Salida de datos
            JOptionPane.showMessageDialog(null, fact + "\nEl factorial del numero " + numero +
                    " = " + factorial);
        }
    }
}
