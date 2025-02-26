import javax.swing.*;

public class Ecuacion2 {
    public static void main(String[] args) {
        //Declaracion de variables
        double s=0.0;
        double x=0.0;
        double denSup=0;
        double deno=0;
        int n=0;
        int i=1;

        //Entrada de datos
        n=Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de facciones a resolver:"));

        //Inicializacion de variables
        i=1;
        deno=1.0;
        denSup=3.0;
        while (i<=n){ //Inicia while
            x = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de x: "));

            //Condiciones a cumplir
            if (i%2!=0){
                s+=Math.pow(x,3.0/denSup)/deno;  //Resolucion de operaciones para resolver la escuacion
            }else{
                s-=Math.pow(x,3.0/denSup)/deno;  //Resolucion de operaciones para resolver la escuacion
            }
            denSup+=3; //Incremento en denSup
            deno+=2; //Incremento en deno
            i++;
        }//Cierra while

        //Salida de datos
        JOptionPane.showMessageDialog(null, "El valor de 'S': " + String.format("%.3f", s));
    }
}
