import javax.swing.*;

public class VerificacionPuntos {
    public static void main(String[] args) {
        double puntos=0.0,numMayor=0.0,numeMenor=0.0,suma=0.0;
        for (int i = 1; i <=25 ; i++) {
            puntos=Double.parseDouble(JOptionPane.showInputDialog("Ingrese los puntos contaminantes: "));
            suma=suma + puntos;
            if (i==1){
                numMayor=puntos;
                numeMenor=puntos;
            } else if (numMayor>=puntos) {
                if (numeMenor>puntos){
                    numeMenor=puntos;
                }
            }else {
                numMayor = puntos;
                if (numeMenor>puntos){
                    numeMenor=puntos;
                }
            }

        }
        if (numMayor==numeMenor){
            JOptionPane.showMessageDialog(null, "Los puntos de contaminacion son iguales");
        }else {
            JOptionPane.showMessageDialog(null, "Los puntos de mayor contaminacion son: " + numMayor +
                    "\nLos puntos de menor contaminacion son: " + numeMenor);
        }
        JOptionPane.showMessageDialog(null, "El promedio de puntos de contaminacion es: " + (suma / 25));
    }
}
