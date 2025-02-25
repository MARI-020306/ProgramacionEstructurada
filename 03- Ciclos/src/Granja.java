import javax.swing.*;

public class Granja {
    public static void main(String[] args) {
        int numHuevos=0,x=0;
        double peso=0.0,altura=0.0,calidad=0.0,kilo=0.0;
        do {
            peso=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso de la gallina: "));
            altura=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura de la gallina: "));
            numHuevos=Integer.parseInt (JOptionPane.showInputDialog("Ingrese el numero de huevos que pone diariamente la gallina: "));
            calidad=(peso * altura)/ numHuevos;
            if (calidad>=15){
                kilo=1.2 * calidad;
            } else if (calidad>8) {
                kilo=1 * calidad;
            }else{
                kilo=.80 * calidad;
            }
            JOptionPane.showMessageDialog(null, "El promedio de calidad es: " + calidad +
                    "\nEl kilo de huevo es de: $" + kilo);

            x=Integer.parseInt(JOptionPane.showInputDialog("Para salir presione 1 - Para continuar presione cualquier otro numero "));
        }while (x!=1);
    }
}
