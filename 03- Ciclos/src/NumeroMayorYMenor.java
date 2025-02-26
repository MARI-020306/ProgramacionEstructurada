import javax.swing.*;

public class NumeroMayorYMenor {
    public static void main(String[] args) {
        //Declaracion de variables
        int num=0,numMay=0,numMen=0,x=0,total=0;

        //Entrada de datos
        total=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el total de numeros: "));
        x=1;
        while (x<=total){ //Inicia while
            num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero " + x));

            //Condiciones a cumplir
            if (x==1){
                numMay=num;
                numMen=num;
            } else if (num>numMay) {
                numMay=num;
            } else if (num<numMen) {
                numMen=num;
            }
            x++;
        } //Termina while

        //Salida de datos
        JOptionPane.showMessageDialog(null, "El numero mayor es: " + numMay +
                "\nEl numero menor es: " + numMen);
    }
}
