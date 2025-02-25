import javax.swing.*;

public class Ecuacion1 {
    public static void main(String[] args) {
        //Declaracion de variables
        int n=0;
        int denSup=0;
        int deno=0;
        double x=0.0;
        double s=0.0;

        do {
            n = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de facciones: "));
            x = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de x: "));
            if(n>0 && x>0.0) {
            } else if (n>0 && x<0.0) {
                JOptionPane.showMessageDialog(null, "¡Error!, el valor para x no es valido");
            } else if (n<0 && x>0.0) {
                JOptionPane.showMessageDialog(null, "¡Error!, el valor para n no es valido");

            } else{
                JOptionPane.showMessageDialog(null, "Datos no validos, intentelo nuevamente");
            }

        }while (n<0 || x<0.0 );



            //Inicializar variables
            denSup = 3;
            deno = 1;

            for (int i = 1; i <= n; i++) {
                s += Math.pow(x, 3.0 / denSup) / deno;
                denSup += 3;
                deno += 2;


            }
            JOptionPane.showMessageDialog(null, "El valor de 'S': " + String.format("%.3f", s));

    }
}
