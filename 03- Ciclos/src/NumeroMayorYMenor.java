import javax.swing.*;

public class NumeroMayorYMenor {
    public static void main(String[] args) {
        int num=0,numMay=0,numMen=0,x=0,total=0;
        total=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el total de numeros: "));
        x=1;
        while (x<=total){
            num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero " + x));
            if (x==1){
                numMay=num;
                numMen=num;
            } else if (num>numMay) {
                numMay=num;
            } else if (num<numMen) {
                numMen=num;
            }
            x++;
        }
        JOptionPane.showMessageDialog(null, "El numero mayor es: " + numMay +
                "\nEl numero menor es: " + numMen);
    }
}
